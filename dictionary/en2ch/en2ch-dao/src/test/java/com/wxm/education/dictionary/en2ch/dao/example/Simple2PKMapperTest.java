package com.wxm.education.dictionary.en2ch.dao.example;

import static org.junit.Assert.fail;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import com.wxm.education.dictionary.en2ch.base.junit.JunitBase;
import com.wxm.education.dictionary.en2ch.pojo.example.entity.Simple_2PK;

/**
 * 
 * <b>Title:</b> 简单示例-两个主键 <br>
 * <b>Description:</b> <br>
 * <b>Date:</b> 2017年11月9日 下午6:46:55
 * 
 * @author wuxm
 * @version 1.0.0
 */
public class Simple2PKMapperTest extends JunitBase {
    private Simple2PKMapper simple2pkMapper;

    @Override
    public void before() {
        super.before();
        simple2pkMapper = getBean(Simple2PKMapper.class);
    }

    @Test
    public void testSelectOne() {
        fail("Not yet implemented"); // TODO
    }

    @Test
    public void testSelect() {
        fail("Not yet implemented"); // TODO
    }

    @Test
    public void testSelectAll() {
        fail("Not yet implemented"); // TODO
    }

    @Test
    public void testSelectCount() {
        fail("Not yet implemented"); // TODO
    }

    @Test
    public void testSelectByPrimaryKey() {
        fail("Not yet implemented"); // TODO
    }

    @Test
    public void testSelectById() {
        fail("Not yet implemented"); // TODO
    }

    @Test
    public void testExistsWithPrimaryKey() {
        fail("Not yet implemented"); // TODO
    }

    @Test
    public void testInsert() {
        Simple_2PK bean;
        for (int i = 1; i <= 5; i++) {
            bean = new Simple_2PK();
            // bean.setCharNotNull("---");
            bean.setCharCanNull("--");
            bean.setVarcharNotNull("---");
            simple2pkMapper.insert(bean);
        }
    }

    @Test
    public void testInsertSelective() {
        Simple_2PK bean;
        for (int i = 1; i <= 5; i++) {
            bean = new Simple_2PK();
            // bean.setCharNotNull("---");
            // bean.setCharCanNull("--");
            bean.setVarcharNotNull("---");
            simple2pkMapper.insertSelective(bean);
        }
    }

    @Test
    public void testInsertList() {
        List<Simple_2PK> list = new ArrayList<Simple_2PK>();
        Simple_2PK bean;
        for (int i = 1; i <= 5; i++) {
            bean = new Simple_2PK();
            bean.setCharNotNull("---");
            bean.setCharCanNull("--");
            bean.setVarcharNotNull("---");
            list.add(bean);
        }
        simple2pkMapper.insertList(list);
    }

    @Test
    public void testUpdateByPrimaryKey() {
        fail("Not yet implemented"); // TODO
    }

    @Test
    public void testUpdateByPrimaryKeySelective() {
        fail("Not yet implemented"); // TODO
    }

    @Test
    public void testDelete() {
        fail("Not yet implemented"); // TODO
    }

    @Test
    public void testDeleteByPrimaryKey() {
        fail("Not yet implemented"); // TODO
    }

}
