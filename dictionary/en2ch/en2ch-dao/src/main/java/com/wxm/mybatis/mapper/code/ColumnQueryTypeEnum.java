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
public enum ColumnQueryTypeEnum {
    PREFIX_NONE(0, ""), // 非模糊
    PREFIX_LIKE(1, "like_"), // 全模糊
    PREFIX_LIKE_LEFT(2, "likeL_"), // 左模糊
    PREFIX_LIKE_RIGHT(3, "likeR_"); // 右模糊

    private int code;
    private String frag;

    private ColumnQueryTypeEnum(int code, String value) {
        this.code = code;
        this.frag = value;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getFrag() {
        return frag;
    }

    public void setFrag(String frag) {
        this.frag = frag;
    }
}
