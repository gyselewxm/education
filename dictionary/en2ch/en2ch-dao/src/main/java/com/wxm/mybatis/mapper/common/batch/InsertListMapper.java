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

package com.wxm.mybatis.mapper.common.batch;

import java.util.List;

import org.apache.ibatis.annotations.InsertProvider;

import com.wxm.mybatis.mapper.provider.BatchProvider;

/**
 * 
 * <b>Title:</b> 通用保存接口 <br>
 * <b>Description:</b> 批量插入，支持批量插入的数据库都可以使用，例如mysql,h2等 <br>
 * <b>Date:</b> 2017年11月12日 上午11:26:53
 * 
 * @author wuxm
 * @version 1.0.0
 * @param <T>
 *            Entity数据表实体
 */
public interface InsertListMapper<T> {

    /**
     * 
     * <b>Title:</b> 批量插入，支持批量插入的数据库可以使用，例如MySQL,H2等，另外该接口限制实体包含`id`属性并且必须为自增列 <br>
     * <b>Description:</b> <br>
     * <b>Date:</b> 2017年11月12日 下午12:18:03
     * 
     * @author wuxm
     * @version 1.0.0
     * @param recordList
     * @return
     */
    @InsertProvider(type = BatchProvider.class, method = "dynamicSQL")
    int insertList(List<T> recordList);

    /**
     * ======如果主键不是id怎么用？========== 假设主键的属性名是uid,那么新建一个Mapper接口如下
     * 
     * <pre>
     *         public interface InsertUidListMapper<T> {
     *             @Options(useGeneratedKeys = true, keyProperty = "uid")
     *             @InsertProvider(type = BatchProvider.class, method = "dynamicSQL")
     *             int insertList(List<T> recordList);
     *         }
     * 只要修改keyProperty = "uid"就可以
     * 
     * 然后让你自己的Mapper继承InsertUidListMapper<T>即可
     *
     * </pre>
     */
}