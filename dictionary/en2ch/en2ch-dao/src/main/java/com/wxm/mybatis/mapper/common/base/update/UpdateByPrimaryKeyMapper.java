package com.wxm.mybatis.mapper.common.base.update;

import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.UpdateProvider;

import com.wxm.mybatis.mapper.provider.base.BaseUpdateProvider;

/**
 * 
 * <b>Title:</b> 通用Mapper接口,更新<br>
 * <b>Description:</b> <br>
 * <b>Date:</b> 2017年11月7日 下午5:39:48<br>
 * 
 * @author wuxm
 * @version 1.0.0
 * @param <T>
 *            不能为空
 */
public interface UpdateByPrimaryKeyMapper<T> {

    /**
     * 根据主键更新实体全部字段，null值会被更新
     *
     * @param record
     * @return
     */
    @UpdateProvider(type = BaseUpdateProvider.class, method = "dynamicSQL")
    @Options(useCache = false, useGeneratedKeys = false)
    int updateByPrimaryKey(T record);
}
