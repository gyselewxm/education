package com.wxm.mybatis.mapper.common.base.delete;

import org.apache.ibatis.annotations.DeleteProvider;

import com.wxm.mybatis.mapper.provider.base.BaseDeleteProvider;

/**
 * 
 * <b>Title:</b> 通用Mapper接口,删除<br>
 * <b>Description:</b> <br>
 * <b>Date:</b> 2017年11月7日 下午4:16:24<br>
 * @author wuxm
 * @version 1.0.0
 * @param <T> 不能为空
 */
public interface DeleteByPrimaryKeyMapper<T> {
    /**
     * 根据主键字段进行删除，方法参数必须包含完整的主键属性
     *
     * @param key
     * @return
     */
    @DeleteProvider(type = BaseDeleteProvider.class, method = "dynamicSQL")
    int deleteByPrimaryKey(Object key);
}
