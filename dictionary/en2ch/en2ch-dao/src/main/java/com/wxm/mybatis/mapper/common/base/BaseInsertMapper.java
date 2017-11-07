package com.wxm.mybatis.mapper.common.base;

import com.wxm.mybatis.mapper.common.base.insert.InsertMapper;
import com.wxm.mybatis.mapper.common.base.insert.InsertSelectiveMapper;

/**
 * 
 * <b>Title:</b> 通用Mapper接口,基础查询<br>
 * <b>Description:</b> <br>
 * <b>Date:</b> 2017年11月7日 下午5:42:33<br>
 * 
 * @author wuxm
 * @version 1.0.0
 * @param <T>
 *            不能为空
 */
public interface BaseInsertMapper<T> extends InsertMapper<T>, InsertSelectiveMapper<T> {

}
