package com.wxm.mybatis.datasource.proxy;

import java.lang.reflect.Method;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.core.annotation.AnnotationUtils;
import org.springframework.transaction.support.TransactionSynchronizationManager;

import com.wxm.base.common.util.LoggerUtils;
import com.wxm.mybatis.datasource.annotation.DataSource;
import com.wxm.mybatis.datasource.code.RoutingStrategy;
import com.wxm.mybatis.datasource.lookup.DynamicRoutingContextHolder;

public class DatasourceAspect {
    public static final Pattern DELIMITER = Pattern.compile("insert*|update*|delete*");

    /**
     * 
     * <b>Title:</b> 数据源前置配置 <br>
     * <b>Description:</b> <br>
     * <b>Date:</b> 2017年11月7日 下午2:47:45 <br>
     * 
     * @author wuxm
     * 
     * @param joinPoint
     */
    public void datasourceBefore(JoinPoint joinPoint) {
        // 若事务已被激活或数据源不为空，则退出
        if (TransactionSynchronizationManager.isActualTransactionActive()
                && DynamicRoutingContextHolder.getRouteStrategy() != null)
            return;
        // 获取方法
        Method declareMethod = ((MethodSignature) joinPoint.getSignature()).getMethod();
        try {
            // 获取方法实例
            Method instanceMethod = joinPoint.getTarget().getClass()
                    .getMethod(declareMethod.getName(), declareMethod.getParameterTypes());
            // 获取方法DataSource注解
            DataSource methodAnnotation = AnnotationUtils.findAnnotation(instanceMethod, DataSource.class);
            if (methodAnnotation == null) {
                Matcher matcher = DELIMITER.matcher(declareMethod.getName());
                if (matcher.find()) {
                    DynamicRoutingContextHolder.setRouteStrategy(RoutingStrategy.MASTER);
                } else {
                    DynamicRoutingContextHolder.setRouteStrategy(RoutingStrategy.SLAVE);
                }
            } else {
                // 设置该方法指定数据源
                DynamicRoutingContextHolder.setRouteStrategy(methodAnnotation.value());
            }
            LoggerUtils.info("Datasource type of '{}.{}' is '{}'.", joinPoint.getTarget().getClass().getName(),
                    joinPoint.getSignature().getName(), DynamicRoutingContextHolder.getRouteStrategy());
        } catch (NoSuchMethodException | SecurityException e) {
            LoggerUtils.error("数据源获取异常", e);
        }
    }

    public void datasourceAfter(JoinPoint joinPoint) {
        if (TransactionSynchronizationManager.isActualTransactionActive())
            return;
        if (TransactionSynchronizationManager.isSynchronizationActive())
            TransactionSynchronizationManager.clearSynchronization();
        DynamicRoutingContextHolder.clearRouteStrategy();
    }
}
