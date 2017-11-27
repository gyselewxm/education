/*
 * The MIT License (MIT)
 *
 * Copyright (c) 2014-2016 abel533@gmail.com
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */
package com.wxm.mybatis.mapper.common;

import com.wxm.mybatis.mapper.common.base.BaseDeleteMapper;
import com.wxm.mybatis.mapper.common.base.BaseInsertMapper;
import com.wxm.mybatis.mapper.common.base.BaseSelectMapper;
import com.wxm.mybatis.mapper.common.base.BaseUpdateMapper;

/**
 * 
 * <b>Title:</b> 通用Mapper接口 <br>
 * <b>Description:</b> <br>
 * <b>Date:</b> 2017年11月9日 下午5:58:26
 * 
 * @author wuxm
 * @version 1.0.0
 * @param <T>
 *            Entity数据表实体
 */
public interface BaseMapper<T, Q> extends
        BaseSelectMapper<T, Q>,
        BaseInsertMapper<T>,
        BaseUpdateMapper<T>,
        BaseDeleteMapper<T> {

}