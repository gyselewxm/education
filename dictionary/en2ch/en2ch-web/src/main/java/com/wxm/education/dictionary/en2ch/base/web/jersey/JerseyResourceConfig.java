package com.wxm.education.dictionary.en2ch.base.web.jersey;

import org.glassfish.jersey.server.ResourceConfig;
import org.glassfish.jersey.server.spring.scope.RequestContextFilter;

/**
 * 配置Jersey框架相关信息
 * 
 * @author wuxm
 * @date 2017年10月30日 上午10:34:56
 * @see 1.0.0
 */
public class JerseyResourceConfig extends ResourceConfig {

    public JerseyResourceConfig() {
        super();
        register(RequestContextFilter.class);
        // 配置Jersey扫描请求处理包下的class文件
        packages("com.wxm.education.dictionary.en2ch.web");
    }
}
