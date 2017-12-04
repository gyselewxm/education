package com.wxm.education.dictionary.en2ch.dao.example;

import com.wxm.education.dictionary.en2ch.pojo.example.bo.ExIsnullDefaultBO;
import com.wxm.education.dictionary.en2ch.pojo.example.entity.ExIsnullDefault;
import com.wxm.education.dictionary.en2ch.pojo.example.query.ExIsnullDefaultQuery;
import com.wxm.mybatis.mapper.common.Mapper;

/**
 * 
 * <b>Title:</b> 示例-是否为空-默认 <br>
 * <b>Description:</b> <br>
 * <b>Date:</b> 2017年12月4日 上午9:45:33 <br>
 * <b>Author:</b> Gysele <br>
 * <b>Version:</b> 1.0.0
 */
public interface ExIsnullDefaultMapper extends Mapper<ExIsnullDefault, ExIsnullDefaultBO, ExIsnullDefaultQuery> {
    public ExIsnullDefault queryOne(String id);
}
