package com.wxm.education.dictionary.en2ch.base.config.dao;

import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.alibaba.druid.support.http.StatViewServlet;
import com.alibaba.druid.support.http.WebStatFilter;

/**
 * 
 * <b>Title:</b> 连接池的监控配置<br>
 * <b>Description:</b> <br>
 * <b>Date:</b> 2017年11月6日 下午1:40:25<br>
 * 
 * @author wuxm
 * @version 1.0.0
 */

@Configuration
public class DruidConfig {
    @Bean
    public ServletRegistrationBean<StatViewServlet> servletRegistration() {
        ServletRegistrationBean<StatViewServlet> servletRegistration = new ServletRegistrationBean<StatViewServlet>(new StatViewServlet()); // 添加初始化参数：initParams
        servletRegistration.addUrlMappings("/druid/*");
        // 白名单
        servletRegistration.addInitParameter("allow", "127.0.0.1");
        // IP黑名单 (存在共同时，deny优先于allow) : 如果满足deny的话提示:Sorry, you are not permitted to view this page.
        servletRegistration.addInitParameter("deny", "192.168.1.73");
        // 登录查看信息的账号密码.
        servletRegistration.addInitParameter("loginUsername", "admin");
        servletRegistration.addInitParameter("loginPassword", "123456");
        // 是否能够重置数据.
        servletRegistration.addInitParameter("resetEnable", "false");
        return servletRegistration;
    }

    @Bean
    public FilterRegistrationBean<WebStatFilter> filterRegistrationBean() {
        FilterRegistrationBean<WebStatFilter> filterRegistrationBean = new FilterRegistrationBean<WebStatFilter>(new WebStatFilter());
        // 添加过滤规则.
        filterRegistrationBean.addUrlPatterns("/*");
        // 添加不需要忽略的格式信息.
        filterRegistrationBean.addInitParameter("exclusions", "*.js,*.gif,*.jpg,*.png,*.css,*.ico,/druid/*");
        return filterRegistrationBean;
    }
}
