package com.wxm.mybatis.mapper.common.base;

import com.wxm.mybatis.mapper.common.base.update.UpdateByPrimaryKeyMapper;
import com.wxm.mybatis.mapper.common.base.update.UpdateByPrimaryKeySelectiveMapper;

/**
 * 
 * <b>Title:</b> 通用Mapper接口,基础查询<br>
 * <b>Description:</b> <br>
 * <b>Date:</b> 2017年11月7日 下午5:43:31<br>
 * 
 * @author wuxm
 * @version 1.0.0
 * @param <T>
 */
public interface BaseUpdateMapper<T> extends UpdateByPrimaryKeyMapper<T>, UpdateByPrimaryKeySelectiveMapper<T> {

}
