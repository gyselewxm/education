package com.wxm.mybatis.mapper.common.ids;

import org.apache.ibatis.annotations.DeleteProvider;

import com.wxm.mybatis.mapper.provider.IdsProvider;

/**
 * 
 * <b>Title:</b> 通用Mapper接口,根据ids删除<br>
 * <b>Description:</b> <br>
 * <b>Date:</b> 2017年11月7日 下午5:44:59<br>
 * @author wuxm
 * @version 1.0.0
 * @param <T> 不能为空
 */
public interface DeleteByIdsMapper<T> {

    /**
     * 
     * <b>Title:</b> 根据主键字符串进行删除，类中只有存在一个带有@Id注解的字段
     * <br><b>Description:</b> 
     * <br><b>Date:</b> 2017年11月7日 下午5:45:21
     * <br>@author wuxm
     * @param ids 如 "1,2,3,4"
     * @return
     */
    @DeleteProvider(type = IdsProvider.class, method = "dynamicSQL")
    int deleteByIds(String ids);
}
