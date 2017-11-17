package com.wxm.education.dictionary.en2ch.dao.example;

import static org.junit.Assert.fail;

import java.util.LinkedList;
import java.util.List;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.alibaba.fastjson.JSON;
import com.wxm.education.dictionary.en2ch.base.junit.JunitBase;
import com.wxm.education.dictionary.en2ch.pojo.example.entity.ExIsnullDefault;
import com.wxm.mybatis.mapper.util.UUIDUtil;

public class ExIsnullDefaultMapperTest extends JunitBase {
    private Logger logger = LoggerFactory.getLogger(ExIsnullDefaultMapperTest.class);

    private ExIsnullDefaultMapper mapper;

    @Override
    public void before() {
        super.before();
        mapper = getBean(ExIsnullDefaultMapper.class);
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
        ExIsnullDefault bean = new ExIsnullDefault();
        try {
            bean.setVarcharNotnull("varcharNotnull"); // 变长字符串_非空
            // bean.setVarcharCannull("varcharCannull"); // 变长字符串_可空
            // bean.setVarcharCannullDefault("varcharCannullDefault"); // 变长字符串_可空_默认
            bean.setCharNotnull("charNotnull"); // 定长字符串_非空
            // bean.setCharCannull("charCannull"); // 定长字符串_可空
            // bean.setCharCannullDefault("charCannullDefault"); // 定长字符串_可空_默认

            // 该值不会存入数据库
            bean.setVarcharNotinsertCannull("varcharNotinsertCannull"); // 变长字符串_非插入_可空

            // 该值不会存入数据库
            bean.setVarcharNotinsertCannullDefault("varcharNotinsertCannullDefault"); // 变长字符串_非插入_可空_默认

            // 该值不会存入数据库，需将该字段上的insertable设为true才可测试通过
            bean.setVarcharNotinsertNotnull("varcharNotinsertNotnull");

            mapper.insert(bean);
            logger.debug(String.format("%s\n%s", "保存成功", JSON.toJSONString(bean)));
        } catch (Exception e) {
            logger.debug("因未设置非空值而导致保存失败", e);
        }
        try {
            // 该值取代数据库默认值
            bean.setVarcharNotnullDefault("varcharNotnullDefault"); // 变长字符串_非空_默认

            // 该值取代数据库默认值
            bean.setCharNotnullDefault("charNotnullDefault"); // 定长字符串_非空_默认

            // 该值不会存入数据库，需将该字段上的insertable设为true才可存入数据库
            bean.setVarcharNotinsertNotnullDefault("varcharNotinsertNotnullDefault");

            mapper.insert(bean);
            logger.debug(String.format("%s\n%s", "保存成功", JSON.toJSONString(bean)));
        } catch (Exception e) {
            logger.debug("因未设置非空值而导致保存失败", e);
        }
    }

    @Test
    public void testInsertSelective() {
        ExIsnullDefault bean = new ExIsnullDefault();
        try {
            bean.setVarcharNotnull("varcharNotnull"); // 变长字符串_非空
            // bean.setVarcharCannull("varcharCannull"); // 变长字符串_可空
            // bean.setVarcharCannullDefault("varcharCannullDefault"); // 变长字符串_可空_默认
            bean.setCharNotnull("charNotnull"); // 定长字符串_非空
            // bean.setCharCannull("charCannull"); // 定长字符串_可空
            // bean.setCharCannullDefault("charCannullDefault"); // 定长字符串_可空_默认

            // 该值不会存入数据库
            bean.setVarcharNotinsertCannull("varcharNotinsertCannull"); // 变长字符串_非插入_可空

            // 该值不会存入数据库
            bean.setVarcharNotinsertCannullDefault("varcharNotinsertCannullDefault"); // 变长字符串_非插入_可空_默认

            // 该值不会存入数据库，需将该字段上的insertable设为true才可测试通过
            bean.setVarcharNotinsertNotnull("varcharNotinsertNotnull");

            mapper.insertSelective(bean);
            logger.debug(String.format("%s\n%s", "保存成功", JSON.toJSONString(bean)));
        } catch (Exception e) {
            logger.debug("因未设置非空值而导致保存失败", e);
        }
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
        List<ExIsnullDefault> list = new LinkedList<ExIsnullDefault>();
        ExIsnullDefault bean;
        for (int i = 0; i < 5; i++) {
            bean = new ExIsnullDefault();
            bean.setId(UUIDUtil.getUUID());
            bean.setVarcharNotnull("varcharNotnull"); // 变长字符串_非空
            // bean.setVarcharCannull("varcharCannull"); // 变长字符串_可空
            // bean.setVarcharCannullDefault("varcharCannullDefault"); // 变长字符串_可空_默认
            bean.setCharNotnull("charNotnull"); // 定长字符串_非空
            // bean.setCharCannull("charCannull"); // 定长字符串_可空
            // bean.setCharCannullDefault("charCannullDefault"); // 定长字符串_可空_默认
            // 该值不会存入数据库
            bean.setVarcharNotinsertCannull("varcharNotinsertCannull"); // 变长字符串_非插入_可空
            // 该值不会存入数据库
            bean.setVarcharNotinsertCannullDefault("varcharNotinsertCannullDefault"); // 变长字符串_非插入_可空_默认
            // 该值不会存入数据库，需将该字段上的insertable设为true才可测试通过
            bean.setVarcharNotinsertNotnull("varcharNotinsertNotnull");
            // 该值取代数据库默认值
            bean.setVarcharNotnullDefault("varcharNotnullDefault"); // 变长字符串_非空_默认
            // 该值取代数据库默认值
            bean.setCharNotnullDefault("charNotnullDefault"); // 定长字符串_非空_默认
            // 该值不会存入数据库，需将该字段上的insertable设为true才可存入数据库
            bean.setVarcharNotinsertNotnullDefault("varcharNotinsertNotnullDefault");

            list.add(bean);
        }
        mapper.insertList(list);
        logger.debug(String.format("%s\n%s", "保存成功", JSON.toJSONString(list)));
    }

    @Test
    public void testInsertSelectiveList() {
        List<ExIsnullDefault> list = new LinkedList<ExIsnullDefault>();
        ExIsnullDefault bean;
        for (int i = 0; i < 5; i++) {
            bean = new ExIsnullDefault();
            bean.setId(UUIDUtil.getUUID());
            bean.setVarcharNotnull("varcharNotnull"); // 变长字符串_非空
            // bean.setVarcharCannull("varcharCannull"); // 变长字符串_可空
            // bean.setVarcharCannullDefault("varcharCannullDefault"); // 变长字符串_可空_默认
            bean.setCharNotnull("charNotnull"); // 定长字符串_非空
            // bean.setCharCannull("charCannull"); // 定长字符串_可空
            // bean.setCharCannullDefault("charCannullDefault"); // 定长字符串_可空_默认
            // 该值不会存入数据库
            bean.setVarcharNotinsertCannull("varcharNotinsertCannull"); // 变长字符串_非插入_可空
            // 该值不会存入数据库
            bean.setVarcharNotinsertCannullDefault("varcharNotinsertCannullDefault"); // 变长字符串_非插入_可空_默认
            // 该值不会存入数据库，需将该字段上的insertable设为true才可测试通过
            bean.setVarcharNotinsertNotnull("varcharNotinsertNotnull");

            list.add(bean);
        }
        mapper.insertSelectiveList(list);
        logger.debug(String.format("%s\n%s", "保存成功", JSON.toJSONString(list)));
    }

}
