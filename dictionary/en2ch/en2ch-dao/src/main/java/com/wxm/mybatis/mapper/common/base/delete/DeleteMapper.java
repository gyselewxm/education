package com.wxm.mybatis.mapper.common.base.delete;

import org.apache.ibatis.annotations.DeleteProvider;

import com.wxm.mybatis.mapper.provider.base.BaseDeleteProvider;

/**
 * 
 * <b>Title:</b> 通用Mapper接口,删除<br>
 * <b>Description:</b> <br>
 * <b>Date:</b> 2017年11月7日 下午5:25:58<br>
 * 
 * @author wuxm
 * @version 1.0.0
 * @param <T>
 *            不能为空
 */
public interface DeleteMapper<T> {

    /**
     * 根据实体属性作为条件进行删除，查询条件使用等号
     *
     * @param record
     * @return
     */
    @DeleteProvider(type = BaseDeleteProvider.class, method = "dynamicSQL")
    int delete(T record);
}
