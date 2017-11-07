package com.wxm.mybatis.mapper.common.base;

import com.wxm.mybatis.mapper.common.base.delete.DeleteByPrimaryKeyMapper;
import com.wxm.mybatis.mapper.common.base.delete.DeleteMapper;

/**
 * 
 * <b>Title:</b> 通用Mapper接口,基础删除<br>
 * <b>Description:</b> <br>
 * <b>Date:</b> 2017年11月7日 下午5:41:42<br>
 * 
 * @author wuxm
 * @version 1.0.0
 * @param <T>
 *            不能为空
 */
public interface BaseDeleteMapper<T> extends DeleteMapper<T>, DeleteByPrimaryKeyMapper<T> {

}
