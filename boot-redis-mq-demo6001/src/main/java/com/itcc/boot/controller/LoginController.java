package com.itcc.boot.controller;

import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import java.util.UUID;

/**
 * Created by caocaixia on 2021/2/22 16:12
 */
@Controller
public class LoginController {

    @Resource
    RedisTemplate redisTemplate;

    @RequestMapping(value={"/","/login"})
    public String loginPage(){

        //生成cookie
        //将登陆信息存入到redis中
        //UUID.randomUUID().toString().replace("-", "");
        redisTemplate.opsForValue().set("user",UUID.randomUUID().toString().replace("-", ""));

        return "index";
    }
}
