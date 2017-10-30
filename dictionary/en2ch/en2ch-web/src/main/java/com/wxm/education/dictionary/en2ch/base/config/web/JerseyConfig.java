package com.wxm.education.dictionary.en2ch.base.config.web;

import org.glassfish.jersey.servlet.ServletContainer;
import org.glassfish.jersey.servlet.ServletProperties;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.wxm.education.dictionary.en2ch.web.JerseyResourceConfig;

/**
 * 配置Jersey
 * 
 * @author wuxm
 * @date 2017年10月30日 上午10:37:02
 * @see 1.0.0
 */
@Configuration
public class JerseyConfig {
    @SuppressWarnings({ "rawtypes", "unchecked" })
    @Bean
    public ServletRegistrationBean jerseyServlet() {
        ServletRegistrationBean registration = new ServletRegistrationBean(new ServletContainer());
        registration.addInitParameter(ServletProperties.JAXRS_APPLICATION_CLASS, JerseyResourceConfig.class.getName());
        return registration;
    }
}
