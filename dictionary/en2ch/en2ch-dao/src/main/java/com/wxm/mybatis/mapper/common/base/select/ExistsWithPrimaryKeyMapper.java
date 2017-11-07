package com.wxm.mybatis.mapper.common.base.select;

import org.apache.ibatis.annotations.SelectProvider;

import com.wxm.mybatis.mapper.provider.base.BaseSelectProvider;

/**
 * 
 * <b>Title:</b> 通用Mapper接口,查询<br>
 * <b>Description:</b> <br>
 * <b>Date:</b> 2017年11月7日 下午5:38:32<br>
 * 
 * @author wuxm
 * @version 1.0.0
 * @param <T>
 *            不能为空
 */
public interface ExistsWithPrimaryKeyMapper<T> {

    /**
     * 根据主键字段查询总数，方法参数必须包含完整的主键属性，查询条件使用等号
     *
     * @param key
     * @return
     */
    @SelectProvider(type = BaseSelectProvider.class, method = "dynamicSQL")
    boolean existsWithPrimaryKey(Object key);

}
