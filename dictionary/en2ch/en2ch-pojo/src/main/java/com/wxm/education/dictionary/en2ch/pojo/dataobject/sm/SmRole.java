package com.wxm.education.dictionary.en2ch.pojo.dataobject.sm;

import com.wxm.base.pojo.dataobject.BaseUUIDDO;

/**
 * 
 * <b>Title:</b> 系统角色<br>
 * <b>Description:</b> <br>
 * <b>Date:</b> 2017年11月7日 下午2:16:29<br>
 * 
 * @author wuxm
 * @version 1.0.0
 */
public class SmRole extends BaseUUIDDO {
    /**
     * 角色名称
     */
    private String roleName;
    /**
     * 角色编码
     */
    private String roleCode;

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public String getRoleCode() {
        return roleCode;
    }

    public void setRoleCode(String roleCode) {
        this.roleCode = roleCode;
    }
}
