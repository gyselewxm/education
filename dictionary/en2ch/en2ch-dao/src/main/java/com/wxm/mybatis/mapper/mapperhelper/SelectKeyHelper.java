package com.wxm.mybatis.mapper.mapperhelper;

import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.executor.keygen.Jdbc3KeyGenerator;
import org.apache.ibatis.executor.keygen.KeyGenerator;
import org.apache.ibatis.executor.keygen.NoKeyGenerator;
import org.apache.ibatis.executor.keygen.SelectKeyGenerator;
import org.apache.ibatis.mapping.MappedStatement;
import org.apache.ibatis.mapping.ParameterMap;
import org.apache.ibatis.mapping.ParameterMapping;
import org.apache.ibatis.mapping.ResultMap;
import org.apache.ibatis.mapping.ResultMapping;
import org.apache.ibatis.mapping.SqlCommandType;
import org.apache.ibatis.mapping.SqlSource;
import org.apache.ibatis.mapping.StatementType;
import org.apache.ibatis.reflection.MetaObject;
import org.apache.ibatis.reflection.SystemMetaObject;
import org.apache.ibatis.scripting.defaults.RawSqlSource;
import org.apache.ibatis.session.Configuration;

import com.wxm.mybatis.mapper.entity.EntityColumn;

/**
 * 
 * <b>Title:</b> 创建 selectKey<br>
 * <b>Description:</b> <br>
 * <b>Date:</b> 2017年11月7日 下午5:30:18<br>
 * 
 * @author wuxm
 * @version 1.0.0
 */
public class SelectKeyHelper {

    /**
     * 新建SelectKey节点
     *
     * @param ms
     * @param column
     */
    public static void newSelectKeyMappedStatement(MappedStatement ms, EntityColumn column, Class<?> entityClass,
            Boolean executeBefore, String identity) {
        String keyId = ms.getId() + SelectKeyGenerator.SELECT_KEY_SUFFIX;
        if (ms.getConfiguration().hasKeyGenerator(keyId)) {
            return;
        }
        // defaults
        Configuration configuration = ms.getConfiguration();
        KeyGenerator keyGenerator;
        String IDENTITY = (column.getGenerator() == null || column.getGenerator().equals("")) ? identity : column
                .getGenerator();
        if (IDENTITY.equalsIgnoreCase("JDBC")) {
            keyGenerator = new Jdbc3KeyGenerator();
        } else {
            SqlSource sqlSource = new RawSqlSource(configuration, IDENTITY, entityClass);

            MappedStatement.Builder statementBuilder = new MappedStatement.Builder(configuration, keyId, sqlSource,
                    SqlCommandType.SELECT);
            statementBuilder.resource(ms.getResource());
            statementBuilder.fetchSize(null);
            statementBuilder.statementType(StatementType.STATEMENT);
            statementBuilder.keyGenerator(new NoKeyGenerator());
            statementBuilder.keyProperty(column.getProperty());
            statementBuilder.keyColumn(null);
            statementBuilder.databaseId(null);
            statementBuilder.lang(configuration.getDefaultScriptingLanguageInstance());
            statementBuilder.resultOrdered(false);
            statementBuilder.resultSets(null);
            statementBuilder.timeout(configuration.getDefaultStatementTimeout());

            List<ParameterMapping> parameterMappings = new ArrayList<ParameterMapping>();
            ParameterMap.Builder inlineParameterMapBuilder = new ParameterMap.Builder(configuration,
                    statementBuilder.id() + "-Inline", entityClass, parameterMappings);
            statementBuilder.parameterMap(inlineParameterMapBuilder.build());

            List<ResultMap> resultMaps = new ArrayList<ResultMap>();
            ResultMap.Builder inlineResultMapBuilder = new ResultMap.Builder(configuration, statementBuilder.id()
                    + "-Inline", column.getJavaType(), new ArrayList<ResultMapping>(), null);
            resultMaps.add(inlineResultMapBuilder.build());
            statementBuilder.resultMaps(resultMaps);
            statementBuilder.resultSetType(null);

            statementBuilder.flushCacheRequired(false);
            statementBuilder.useCache(false);
            statementBuilder.cache(null);

            MappedStatement statement = statementBuilder.build();
            try {
                configuration.addMappedStatement(statement);
            } catch (Exception e) {
                // ignore
            }
            MappedStatement keyStatement = configuration.getMappedStatement(keyId, false);
            keyGenerator = new SelectKeyGenerator(keyStatement, executeBefore);
            try {
                configuration.addKeyGenerator(keyId, keyGenerator);
            } catch (Exception e) {
                // ignore
            }
        }
        // keyGenerator
        try {
            MetaObject msObject = SystemMetaObject.forObject(ms);
            msObject.setValue("keyGenerator", keyGenerator);
            msObject.setValue("keyProperties", column.getTable().getKeyProperties());
            msObject.setValue("keyColumns", column.getTable().getKeyColumns());
        } catch (Exception e) {
            // ignore
        }
    }
}
