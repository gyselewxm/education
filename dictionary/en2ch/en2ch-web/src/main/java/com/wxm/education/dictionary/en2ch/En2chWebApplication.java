package com.wxm.education.dictionary.en2ch;

import org.apache.commons.lang3.ArrayUtils;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 
 * <b>Title:</b> SpringBoot启动入口<br>
 * <b>Description:</b> <br>
 * <b>Date:</b> 2017年10月30日 上午11:42:05<br>
 * 
 * @author wuxm
 * @version 1.0.0
 */
@SpringBootApplication
public class En2chWebApplication {
    private final static String SPRING_PROFILES_ACTIVE = "spring.profiles.active=";

    public static void main(String[] args) {
        if (ArrayUtils.isNotEmpty(args)) {
            for (String arg : args) {
                if (arg.startsWith(SPRING_PROFILES_ACTIVE)) {
                    SpringApplication.run(En2chWebApplication.class, args).getEnvironment()
                            .setActiveProfiles(arg.replace(SPRING_PROFILES_ACTIVE, ""));
                }
            }
        } else {
            SpringApplication.run(En2chWebApplication.class, args);
        }
    }
}
