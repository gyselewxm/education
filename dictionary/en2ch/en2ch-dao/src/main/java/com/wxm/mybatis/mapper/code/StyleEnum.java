package com.wxm.mybatis.mapper.code;

/**
 * 
 * <b>Title:</b> 字段转换方式<br>
 * <b>Description:</b> <br>
 * <b>Date:</b> 2017年11月7日 下午4:11:43<br>
 * 
 * @author wuxm
 * @version 1.0.0
 */
public enum StyleEnum {
    normal, // 原值
    camelhump, // 驼峰转下划线
    uppercase, // 转换为大写
    lowercase, // 转换为小写
    camelhumpAndUppercase, // 驼峰转下划线大写形式
    camelhumpAndLowercase, // 驼峰转下划线小写形式
}
