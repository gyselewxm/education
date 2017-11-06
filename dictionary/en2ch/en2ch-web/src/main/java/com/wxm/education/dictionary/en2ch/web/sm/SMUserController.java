package com.wxm.education.dictionary.en2ch.web.sm;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 
 * <b>Title:</b> 系统用户请求处理<br>
 * <b>Description:</b> <br>
 * <b>Date:</b> 2017年10月30日 上午11:42:36<br>
 * 
 * @author wuxm
 * @version 1.0.0
 */
@Controller
@RequestMapping("sm/user")
public class SMUserController {
    Logger logger = LoggerFactory.getLogger(this.getClass());

    @PostMapping
    @ResponseBody
    public String save() {
        return "保存用户";
    }

    @PutMapping
    public String update() {
        return "更新用户";
    }

    @GetMapping("{name}")
    public String list(@PathVariable("name") String code) {
        logger.debug("保存用户");
        logger.info("保存用户");
        logger.warn("保存用户");
        logger.error("保存用户");
        // throw new WebException("asdasd");
        return "base/area/test";
    }

    @DeleteMapping
    public String delete() {
        return "删除用户";
    }
}
