package com.wxm.mybatis.mapper.common.rowbounds;

import java.util.List;

import org.apache.ibatis.annotations.SelectProvider;
import org.apache.ibatis.session.RowBounds;

import com.wxm.mybatis.mapper.provider.base.BaseSelectProvider;

/**
 * 
 * <b>Title:</b> 通用Mapper接口,查询<br>
 * <b>Description:</b> <br>
 * <b>Date:</b> 2017年11月7日 下午5:50:12<br>
 * 
 * @author wuxm
 * @version 1.0.0
 * @param <T>
 *            不能为空
 */
public interface SelectRowBoundsMapper<T> {

    /**
     * 根据实体属性和RowBounds进行分页查询
     *
     * @param record
     * @param rowBounds
     * @return
     */
    @SelectProvider(type = BaseSelectProvider.class, method = "dynamicSQL")
    List<T> selectByRowBounds(T record, RowBounds rowBounds);
}
