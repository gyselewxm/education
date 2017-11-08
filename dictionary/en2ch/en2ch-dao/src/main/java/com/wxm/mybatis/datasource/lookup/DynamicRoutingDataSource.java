package com.wxm.mybatis.datasource.lookup;

import org.springframework.jdbc.datasource.lookup.AbstractRoutingDataSource;

/**
 * 
 * <b>Title:</b> 动态数据源切换<br>
 * <b>Description:</b> <br>
 * <b>Date:</b> 2017年11月8日 上午10:19:52<br>
 * 
 * @author wuxm
 * @version 1.0.0
 */
public class DynamicRoutingDataSource extends AbstractRoutingDataSource {

    @Override
    protected Object determineCurrentLookupKey() {
        return DynamicRoutingContextHolder.getRouteStrategy().getKey();
    }
}
