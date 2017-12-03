package com.wxm.education.dictionary.en2ch.pojo.example.bo;

import com.wxm.base.annotation.ColumnSql;
import com.wxm.education.dictionary.en2ch.pojo.example.entity.SimplePks;

/**
 * <b>Title:</b> 简单示例-多个主键[业务对象]
 * <br><b>Description:</b> 
 * <br><b>Date:</b> 2017年12月3日 下午8:12:51
 * <br><b>Author:</b> Gysele
 * <br><b>Version:</b> 1.0.0
 */
public class SimplePksBO extends SimplePks {

    @ColumnSql("SELECT COUNT(1) FROM simple_pks")
    private String totalCount;

    public String getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(String totalCount) {
        this.totalCount = totalCount;
    }
}
