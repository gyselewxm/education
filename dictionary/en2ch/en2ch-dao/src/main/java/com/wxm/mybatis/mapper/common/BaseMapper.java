package com.wxm.mybatis.mapper.common;

import com.wxm.mybatis.mapper.common.base.BaseDeleteMapper;
import com.wxm.mybatis.mapper.common.base.BaseInsertMapper;
import com.wxm.mybatis.mapper.common.base.BaseSelectMapper;
import com.wxm.mybatis.mapper.common.base.BaseUpdateMapper;

/**
 * 
 * <b>Title:</b> 通用Mapper接口,其他接口继承该接口即可<br>
 * <b>Description:</b> 项目地址 : <a href="https://github.com/abel533/Mapper"
 * target="_blank">https://github.com/abel533/Mapper</a><br>
 * <b>Date:</b> 2017年11月7日 下午5:54:09<br>
 * 
 * @author wuxm
 * @version 1.0.0
 * @param <T>
 *            不能为空
 * @param <D>
 *            不能为空
 * @param <Q>
 *            不能为空
 */
public interface BaseMapper<T, D, Q> extends
        BaseSelectMapper<T, D, Q>,
        BaseInsertMapper<T>,
        BaseUpdateMapper<T>,
        BaseDeleteMapper<T> {

}
