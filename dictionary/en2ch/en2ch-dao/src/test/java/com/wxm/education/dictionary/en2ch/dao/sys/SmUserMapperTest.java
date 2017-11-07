package com.wxm.education.dictionary.en2ch.dao.sys;

import static org.junit.Assert.fail;

import org.junit.Test;

import com.wxm.education.dictionary.en2ch.base.junit.JunitBase;
import com.wxm.education.dictionary.en2ch.pojo.dataobject.sm.SmUser;
import com.wxm.education.dictionary.en2ch.pojo.query.sm.SmUserQuery;

public class SmUserMapperTest extends JunitBase {
    private SmUserMapper smUserMapper;

    @Override
    public void before() {
        super.before();
        smUserMapper = getBean(SmUserMapper.class);
    }

    @Test
    public void testQueryOne() {
        smUserMapper.queryById("11");
    }

    @Test
    public void testSelectOne() {
        smUserMapper.selectOne(new SmUserQuery("11"));
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
    public void testExistsWithPrimaryKey() {
        fail("Not yet implemented");
    }

    @Test
    public void testInsert() {
        SmUser smUser = new SmUser();
        smUser.setUsername("admin");
        smUser.setCnName("管理员");
        smUser.setEnName("Administrator");
        smUser.setCreatedBy("00");
        smUser.setModifiedBy("00");
        smUserMapper.insert(smUser);
    }

    @Test
    public void testInsertSelective() {
        fail("Not yet implemented");
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
    public void testSelectByExample() {
        fail("Not yet implemented");
    }

    @Test
    public void testSelectCountByExample() {
        fail("Not yet implemented");
    }

    @Test
    public void testDeleteByExample() {
        fail("Not yet implemented");
    }

    @Test
    public void testUpdateByExample() {
        fail("Not yet implemented");
    }

    @Test
    public void testUpdateByExampleSelective() {
        fail("Not yet implemented");
    }

    @Test
    public void testSelectByExampleAndRowBounds() {
        fail("Not yet implemented");
    }

    @Test
    public void testSelectByRowBounds() {
        fail("Not yet implemented");
    }

    @Test
    public void testSelectByCondition() {
        fail("Not yet implemented");
    }

    @Test
    public void testSelectCountByCondition() {
        fail("Not yet implemented");
    }

    @Test
    public void testDeleteByCondition() {
        fail("Not yet implemented");
    }

    @Test
    public void testUpdateByCondition() {
        fail("Not yet implemented");
    }

    @Test
    public void testUpdateByConditionSelective() {
        fail("Not yet implemented");
    }

    @Test
    public void testInsertList() {
        fail("Not yet implemented");
    }

    @Test
    public void testInsertUseGeneratedKeys() {
        fail("Not yet implemented");
    }

}
