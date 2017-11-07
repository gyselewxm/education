package com.wxm.mybatis.mapper.common.base.insert;

import org.apache.ibatis.annotations.InsertProvider;

import com.wxm.mybatis.mapper.provider.base.BaseInsertProvider;

/**
 * 
 * <b>Title:</b> 通用Mapper接口,插入<br>
 * <b>Description:</b> <br>
 * <b>Date:</b> 2017年11月7日 下午5:37:28<br>
 * @author wuxm
 * @version 1.0.0
 * @param <T> 不能为空
 */
public interface InsertSelectiveMapper<T> {

    /**
     * 保存一个实体，null的属性不会保存，会使用数据库默认值
     *
     * @param record
     * @return
     */
    @InsertProvider(type = BaseInsertProvider.class, method = "dynamicSQL")
    int insertSelective(T record);
}
