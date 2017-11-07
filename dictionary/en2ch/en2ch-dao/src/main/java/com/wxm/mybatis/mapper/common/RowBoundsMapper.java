package com.wxm.mybatis.mapper.common;

import com.wxm.mybatis.mapper.common.rowbounds.SelectRowBoundsMapper;

/**
 * 
 * <b>Title:</b> 通用Mapper接口,带RowBounds参数的查询<br>
 * <b>Description:</b> 配合分页插件PageHelper可以实现物理分页。配合分页插件PageHelper可以实现物理分页<br>
 * <b>Date:</b> 2017年11月7日 下午6:00:15<br>
 * 
 * @author wuxm
 * @version 1.0.0
 * @param <T>
 *            不能为空
 */
public interface RowBoundsMapper<T> extends SelectRowBoundsMapper<T> {

}
