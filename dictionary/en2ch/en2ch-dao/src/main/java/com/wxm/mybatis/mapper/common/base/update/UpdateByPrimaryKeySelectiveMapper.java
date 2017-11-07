package com.wxm.mybatis.mapper.common.base.update;

import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.UpdateProvider;

import com.wxm.mybatis.mapper.provider.base.BaseUpdateProvider;

/**
 * 
 * <b>Title:</b> 通用Mapper接口,更新<br>
 * <b>Description:</b> <br>
 * <b>Date:</b> 2017年11月7日 下午5:40:36<br>
 * 
 * @author wuxm
 * @version 1.0.0
 * @param <T>
 *            不能为空
 */
public interface UpdateByPrimaryKeySelectiveMapper<T> {

    /**
     * 根据主键更新属性不为null的值
     *
     * @param record
     * @return
     */
    @UpdateProvider(type = BaseUpdateProvider.class, method = "dynamicSQL")
    @Options(useCache = false, useGeneratedKeys = false)
    int updateByPrimaryKeySelective(T record);
}
