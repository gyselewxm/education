package com.wxm.education.dictionary.en2ch.web;

import org.glassfish.jersey.server.ResourceConfig;
import org.glassfish.jersey.server.spring.scope.RequestContextFilter;

/**
 * 
 * <b>Title:</b> 配置Jersey框架相关信息<br>
 * <b>Description:</b> 该类应放在被扫描的包的根目录下，可省去额外配置<br>
 * <b>Date:</b> 2017年10月30日 上午11:39:52<br>
 * 
 * @author wuxm
 * @version 1.0.0
 */
public class JerseyResourceConfig extends ResourceConfig {

    public JerseyResourceConfig() {
        super();
        register(RequestContextFilter.class);
        // 配置Jersey扫描请求处理包下的class文件
        packages(this.getClass().getPackage().getName());
    }
}
