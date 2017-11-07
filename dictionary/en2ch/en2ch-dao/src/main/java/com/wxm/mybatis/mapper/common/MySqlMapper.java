package com.wxm.mybatis.mapper.common;

import com.wxm.mybatis.mapper.common.special.InsertListMapper;
import com.wxm.mybatis.mapper.common.special.InsertUseGeneratedKeysMapper;

/**
 * 
 * <b>Title:</b> 通用Mapper接口,MySql独有的通用方法<br>
 * <b>Description:</b> <br>
 * <b>Date:</b> 2017年11月7日 下午5:59:10<br>
 * 
 * @author wuxm
 * @version 1.0.0
 * @param <T>
 *            不能为空
 */
public interface MySqlMapper<T> extends InsertListMapper<T>, InsertUseGeneratedKeysMapper<T> {

}
