package com.wxm.mybatis.mapper.provider.base;

import org.apache.ibatis.mapping.MappedStatement;

import com.wxm.mybatis.mapper.mapperhelper.MapperHelper;
import com.wxm.mybatis.mapper.mapperhelper.MapperTemplate;
import com.wxm.mybatis.mapper.mapperhelper.SqlHelper;

/**
 * 
 * <b>Title:</b> BaseDeleteMapper实现类，基础方法实现类<br>
 * <b>Description:</b> <br>
 * <b>Date:</b> 2017年11月7日 下午4:18:02<br>
 * 
 * @author wuxm
 * @version 1.0.0
 */
public class BaseDeleteProvider extends MapperTemplate {

    public BaseDeleteProvider(Class<?> mapperClass, MapperHelper mapperHelper) {
        super(mapperClass, mapperHelper);
    }

    /**
     * 通过条件删除
     *
     * @param ms
     * @return
     */
    public String delete(MappedStatement ms) {
        Class<?> entityClass = getEntityClass(ms);
        StringBuilder sql = new StringBuilder();
        sql.append(SqlHelper.deleteFromTable(entityClass, tableName(entityClass)));
        sql.append(SqlHelper.whereAllIfColumns(entityClass, isNotEmpty()));
        return sql.toString();
    }

    /**
     * 通过主键删除
     *
     * @param ms
     */
    public String deleteByPrimaryKey(MappedStatement ms) {
        final Class<?> entityClass = getEntityClass(ms);
        StringBuilder sql = new StringBuilder();
        sql.append(SqlHelper.deleteFromTable(entityClass, tableName(entityClass)));
        sql.append(SqlHelper.wherePKColumns(entityClass));
        return sql.toString();
    }
}
