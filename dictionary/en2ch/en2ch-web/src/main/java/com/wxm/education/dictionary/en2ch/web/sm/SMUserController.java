package com.wxm.education.dictionary.en2ch.web.sm;

import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;

import org.springframework.web.bind.annotation.RestController;

/**
 * 系统用户请求处理
 * 
 * @author wuxm
 * @date 2017年10月30日 上午9:45:53
 * @see 1.0.0
 */
@RestController
@Path("sm/user")
public class SMUserController {

    @POST
    public String save() {
        return "保存用户";
    }

    @PUT
    public String update() {
        return "更新用户";
    }

    @GET
    public String list() {
        return "用户列表";
    }

    @DELETE
    public String delete() {
        return "删除用户";
    }
}
