package com.wxm.mybatis.mapper.entity;

/**
 * 
 * <b>Title:</b> 实现动态表名时，实体类需要实现该接口<br>
 * <b>Description:</b> <br>
 * <b>Date:</b> 2017年11月7日 下午5:19:42<br>
 * 
 * @author wuxm
 * @version 1.0.0
 */
public interface IDynamicTableName {

    /**
     * 
     * <b>Title:</b> 获取动态表名 <br>
     * <b>Description:</b> 只要有返回值，不是null和''，就会用返回值作为表名 <br>
     * <b>Date:</b> 2017年11月7日 下午5:20:01 <br>
     * @author wuxm
     * 
     * @return
     */
    String getDynamicTableName();
}
