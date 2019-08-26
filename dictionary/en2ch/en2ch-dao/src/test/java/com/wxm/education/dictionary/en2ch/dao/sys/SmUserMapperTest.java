package com.wxm.education.dictionary.en2ch.dao.sys;

import static org.junit.Assert.fail;

import org.junit.Test;

import com.wxm.base.common.junit.JunitBase;
import com.wxm.education.dictionary.en2ch.pojo.sm.entity.SmUser;

/**
 * <b>Title:</b> <br>
 * <b>Description:</b> <br>
 * <b>Date:</b> 2017年12月10日 下午6:46:01 <br>
 * <b>Author:</b> Gysele <br>
 * <b>Version:</b> 1.0.0
 */
public class SmUserMapperTest extends JunitBase {
    private SmUserMapper mapper;

    @Override
    public void before() {
        super.before();
        mapper = getBean(SmUserMapper.class);
    }

    @Test
    public void testSelectOne() {
    }

    @Test
    public void testSelectBOOne() {
        fail("Not yet implemented"); // TODO
    }

    @Test
    public void testSelect() {
        fail("Not yet implemented"); // TODO
    }

    @Test
    public void testSelectBO() {
        fail("Not yet implemented"); // TODO
    }

    @Test
    public void testSelectAll() {
        fail("Not yet implemented"); // TODO
    }

    @Test
    public void testSelectAllBO() {
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
    public void testSelectBOByPrimaryKey() {
        fail("Not yet implemented"); // TODO
    }

    @Test
    public void testInsert() {
        SmUser bean = new SmUser();
        bean.setUsername("admin");
        bean.setCnName("管理员");
        bean.setEnName("Administrator");
        bean.setCreatedBy("00");
        bean.setModifiedBy("00");
        mapper.insert(bean);
    }

    @Test
    public void testInsertSelective() {
        SmUser bean = new SmUser();
        bean.setUsername("user");
        bean.setCnName("user");
        bean.setCreatedBy("00");
        bean.setModifiedBy("00");
        mapper.insertSelective(bean);
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
    public void testUpdate() {
        fail("Not yet implemented"); // TODO
    }

    @Test
    public void testUpdateSelective() {
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

    @Test
    public void testInsertList() {
        fail("Not yet implemented"); // TODO
    }

}
