package com.wxm.mybatis.datasource.lookup;

import org.springframework.util.Assert;

import com.wxm.mybatis.datasource.code.RoutingStrategy;

/**
 * 
 * <b>Title:</b> 动态数据源设置<br>
 * <b>Description:</b> <br>
 * <b>Date:</b> 2017年11月8日 上午10:21:02<br>
 * 
 * @author wuxm
 * @version 1.0.0
 */
public class DynamicRoutingContextHolder {
    private static final ThreadLocal<RoutingStrategy> contextHolder = new ThreadLocal<>();

    public static void setRouteStrategy(RoutingStrategy routingStrategy) {
        Assert.notNull(routingStrategy, "routingStrategy cannot be null");
        contextHolder.set(routingStrategy);
    }

    public static RoutingStrategy getRouteStrategy() {
        return (RoutingStrategy) contextHolder.get();
    }

    public static void clearRouteStrategy() {
        contextHolder.remove();
    }
}
