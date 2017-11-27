package com.wxm.mybatis.mapper.code;

/**
 * 
 * <b>Title:</b> 字段名片段枚举<br>
 * <b>Description:</b> <br>
 * <b>Date:</b> 2017年11月28日 上午11:11:17<br>
 * 
 * @author wuxm
 * @version 1.0.0
 */
public enum ColumnFragEnum {
    PREFIX_LIKE("like_"), // 全模糊
    PREFIX_LIKE_LEFT("likeL_"), // 左模糊
    PREFIX_LIKE_RIGHT("likeR_"); // 右模糊

    private String value;

    private ColumnFragEnum(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
