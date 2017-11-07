package com.wxm.mybatis.mapper.common;

import com.wxm.mybatis.mapper.common.ids.DeleteByIdsMapper;
import com.wxm.mybatis.mapper.common.ids.SelectByIdsMapper;

/**
 * 
 * <b>Title:</b> 通用Mapper接口,根据ids操作<br>
 * <b>Description:</b> <br>
 * <b>Date:</b> 2017年11月7日 下午5:56:14<br>
 * 
 * @author wuxm
 * @version 1.0.0
 * @param <T>
 *            不能为空
 */
public interface IdsMapper<T> extends SelectByIdsMapper<T>, DeleteByIdsMapper<T> {

}
