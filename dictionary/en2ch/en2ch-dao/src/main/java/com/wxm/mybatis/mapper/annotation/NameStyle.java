package com.wxm.mybatis.mapper.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import com.wxm.mybatis.mapper.code.StyleEnum;


/**
 * 
 * <b>Title:</b> 名字转换样式，注解的优先级高于全局配置<br>
 * <b>Description:</b> <br>
 * <b>Date:</b> 2017年11月7日 下午3:52:54<br>
 * 
 * @author wuxm
 * @version 1.0.0
 */
@Target({ ElementType.TYPE })
@Retention(RetentionPolicy.RUNTIME)
public @interface NameStyle {

    StyleEnum value() default StyleEnum.normal;

}