package com.wxm.mybatis.datasource.code;

/**
 * 
 * <b>Title:</b> 路由策略<br>
 * <b>Description:</b> <br>
 * <b>Date:</b> 2017年11月8日 上午10:23:22<br>
 * 
 * @author wuxm
 * @version 1.0.0
 */
public enum RoutingStrategy {
    MASTER("master"), SLAVE("slave");

    private String value;

    RoutingStrategy(String value) {
        this.value = value;
    }

    public String getKey() {
        return value;
    }
}
