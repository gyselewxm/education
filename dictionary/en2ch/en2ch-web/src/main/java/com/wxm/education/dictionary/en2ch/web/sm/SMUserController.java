package com.wxm.education.dictionary.en2ch.web.sm;

import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;

import org.springframework.web.bind.annotation.RestController;

/**
 * 
 * <b>Title:</b> 系统用户请求处理<br>
 * <b>Description:</b> <br>
 * <b>Date:</b> 2017年10月30日 上午11:42:36<br>
 * 
 * @author wuxm
 * @version 1.0.0
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

    @Path("{name}")
    @GET
    public String list(@PathParam("name") String code) {
        return "用户列表:" + code;
    }

    @DELETE
    public String delete() {
        return "删除用户";
    }
}
