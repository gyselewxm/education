/*
 * The MIT License (MIT)
 *
 * Copyright (c) 2014-2016 abel533@gmail.com
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */

package com.wxm.mybatis.mapper.provider;

import java.util.Set;

import org.apache.ibatis.mapping.MappedStatement;

import com.wxm.mybatis.mapper.MapperException;
import com.wxm.mybatis.mapper.entity.EntityColumn;
import com.wxm.mybatis.mapper.mapperhelper.EntityHelper;
import com.wxm.mybatis.mapper.mapperhelper.MapperHelper;
import com.wxm.mybatis.mapper.mapperhelper.MapperTemplate;
import com.wxm.mybatis.mapper.mapperhelper.SelectKeyHelper;
import com.wxm.mybatis.mapper.mapperhelper.SqlHelper;
import com.wxm.mybatis.mapper.util.StringUtil;

/**
 * SpecialProvider实现类，特殊方法实现类
 *
 * @author liuzh
 */
public class BatchProvider extends MapperTemplate {

    public BatchProvider(Class<?> mapperClass, MapperHelper mapperHelper) {
        super(mapperClass, mapperHelper);
    }

    /**
     * 批量插入
     *
     * @param ms
     */
    public String insertList(MappedStatement ms) {
        Class<?> entityClass = getEntityClass(ms);
        StringBuilder sql = new StringBuilder();
        // 获取全部列
        Set<EntityColumn> columnList = EntityHelper.getColumns(entityClass);
        // Identity列只能有一个
        Boolean hasIdentityKey = false;
        // 先处理cache或bind节点
        for (EntityColumn column : columnList) {
            if (!column.isInsertable()) {
                continue;
            }
            if (StringUtil.isNotEmpty(column.getSequenceName())) {
            } else if (column.isIdentity()) {
                /**
                 * 待测
                 */
                // 这种情况下,如果原先的字段有值,需要先缓存起来,否则就一定会使用自动增长
                // 这是一个bind节点
                sql.append(SqlHelper.getBindCache(column));
                // 如果是Identity列，就需要插入selectKey
                // 如果已经存在Identity列，抛出异常
                if (hasIdentityKey) {
                    // jdbc类型只需要添加一次
                    if (column.getGenerator() != null && column.getGenerator().equals("JDBC")) {
                        continue;
                    }
                    throw new MapperException(ms.getId() + "对应的实体类" + entityClass.getCanonicalName()
                            + "中包含多个MySql的自动增长列,最多只能有一个!");
                }
                // 插入selectKey
                SelectKeyHelper.newSelectKeyMappedStatement(ms, column, entityClass, isBEFORE(), getIDENTITY(column));
                hasIdentityKey = true;
            } else if (column.isUuid()) {
                // uuid的情况，直接插入bind节点
                sql.append(SqlHelper.getBindValue(column, getUUID()));
            } else if (column.isUuid32()) {
                // uuid32的情况，直接插入bind节点
                sql.append(SqlHelper.getBindValue(column, getUUID32()));
            }
        }
        sql.append(SqlHelper.insertIntoTable(entityClass, tableName(entityClass)));
        sql.append(SqlHelper.insertColumns(entityClass, false, false, false));
        sql.append(" VALUES ");
        sql.append("<foreach collection=\"list\" item=\"record\" separator=\",\" >");
        sql.append("<trim prefix=\"(\" suffix=\")\" suffixOverrides=\",\">");
        for (EntityColumn column : columnList) {
            if (!column.isInsertable()) {
                continue;
            }
            // 优先使用传入的属性值,当原属性property!=null时，用原属性
            // 自增的情况下,如果默认有值,就会备份到property_cache中,所以这里需要先判断备份的值是否存在
            if (column.isIdentity()) {
                sql.append(SqlHelper.getIfCacheNotNull(column, column.getColumnHolder("record", "_cache", ",")));
            } else {
                // 其他情况值仍然存在原property中
                sql.append(SqlHelper.getIfNotNull("record", column, column.getColumnHolder("record", null, ","), isNotEmpty()));
            }
            // 当属性为null时，如果存在主键策略，会自动获取值，如果不存在，则使用null
            // 序列的情况
            if (StringUtil.isNotEmpty(column.getSequenceName())) {
                System.out.println("sequenceName:" + column.getSequenceName());
                sql.append(SqlHelper.getIfIsNull("record",column, getSeqNextVal(column) + " ,", false));
            } else if (column.isIdentity()) {
                /**
                 * 待测
                 */
                System.out.println("identity");
                sql.append(SqlHelper.getIfCacheIsNull(column, column.getColumnHolder() + ","));
            } else if (column.isUuid()) {
                sql.append(SqlHelper.getIfIsNull("record",column, column.getColumnHolder(null, "_bind", ","), isNotEmpty()));
            } else if (column.isUuid32()) {
                sql.append(SqlHelper.getIfIsNull("record",column, column.getColumnHolder(null, "_bind", ","), isNotEmpty()));
            } else {
                // 当null的时候，如果不指定jdbcType，oracle可能会报异常，指定VARCHAR不影响其他
                sql.append(SqlHelper.getIfIsNull("record", column, column.getColumnHolder("record", null, ","), isNotEmpty()));
            }
        }
        sql.append("</trim>");
        sql.append("</foreach>");
        return sql.toString();
    }
}
