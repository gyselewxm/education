package com.wxm.mybatis.mapper.common.batch;

import java.util.List;

import org.apache.ibatis.annotations.InsertProvider;

import com.wxm.mybatis.mapper.provider.BatchProvider;

/**
 * 
 * <b>Title:</b> 通用保存接口-null的属性也会保存，不会使用数据库默认值 <br>
 * <b>Description:</b> 批量插入，支持批量插入的数据库都可以使用，例如mysql,h2等 <br>
 * <b>Date:</b> 2017年11月12日 上午11:26:53
 * 
 * @author wuxm
 * @version 1.0.0
 * @param <T>
 *            Entity数据表实体
 */
public interface BatchInsertMapper<T> {

    /**
     * 
     * <b>Title:</b> 批量保存 <br>
     * <b>Description:</b> null的属性也会保存，不会使用数据库默认值，另外该接口不提供主键策略，限制实体的主键属性值不能为空<br>
     * <b>Date:</b> 2017年11月12日 下午12:18:03
     * 
     * @author wuxm
     * @version 1.0.0
     * @param recordList
     * @return
     */
    @InsertProvider(type = BatchProvider.class, method = "dynamicSQL")
    int insertList(List<T> list);
}