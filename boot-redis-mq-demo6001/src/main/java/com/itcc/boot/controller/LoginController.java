package com.itcc.boot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by caocaixia on 2021/2/22 16:12
 */
@Controller
public class LoginController {

    @RequestMapping(value={"/","/login"})
    public String loginPage(){
        return "index";
    }
}
