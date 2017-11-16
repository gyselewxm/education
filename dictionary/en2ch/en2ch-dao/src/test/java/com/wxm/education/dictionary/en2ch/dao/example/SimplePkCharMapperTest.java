package com.wxm.education.dictionary.en2ch.dao.example;

import static org.junit.Assert.fail;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.alibaba.fastjson.JSON;
import com.wxm.education.dictionary.en2ch.base.junit.JunitBase;
import com.wxm.education.dictionary.en2ch.pojo.example.entity.SimplePkChar;

public class SimplePkCharMapperTest extends JunitBase {
    private Logger logger = LoggerFactory.getLogger(this.getClass());
    private SimplePkCharMapper mapper;

    @Override
    public void before() {
        super.before();
        mapper = getBean(SimplePkCharMapper.class);
    }

    @Test
    public void testSelectOne() {
        fail("Not yet implemented");
    }

    @Test
    public void testSelect() {
        fail("Not yet implemented");
    }

    @Test
    public void testSelectAll() {
        fail("Not yet implemented");
    }

    @Test
    public void testSelectCount() {
        fail("Not yet implemented");
    }

    @Test
    public void testSelectByPrimaryKey() {
        fail("Not yet implemented");
    }

    @Test
    public void testSelectById() {
        fail("Not yet implemented");
    }

    @Test
    public void testExistsWithPrimaryKey() {
        fail("Not yet implemented");
    }

    @Test
    public void testInsert() {
        SimplePkChar bean =new SimplePkChar();
        mapper.insert(bean);
        logger.debug(JSON.toJSONString(bean));
    }

    @Test
    public void testInsertSelective() {
        SimplePkChar bean =new SimplePkChar();
        mapper.insertSelective(bean);
        logger.debug(JSON.toJSONString(bean));
    }

    @Test
    public void testUpdateByPrimaryKey() {
        fail("Not yet implemented");
    }

    @Test
    public void testUpdateByPrimaryKeySelective() {
        fail("Not yet implemented");
    }

    @Test
    public void testDelete() {
        fail("Not yet implemented");
    }

    @Test
    public void testDeleteByPrimaryKey() {
        fail("Not yet implemented");
    }

    @Test
    public void testInsertList() {
        fail("Not yet implemented");
    }

    @Test
    public void testInsertSelectiveList() {
        fail("Not yet implemented");
    }

}
