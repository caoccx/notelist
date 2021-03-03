package com.itcc.boot.controller;

import com.itcc.boot.entities.CommonResult;
import com.itcc.boot.entities.User;
import com.itcc.boot.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by caocaixia on 2021/2/22 12:46
 */
@RestController
@Slf4j
public class UserController {
    @Resource
    UserService userService;

    @Value("${server.port}")
    String serverPort;

    @GetMapping("/userlist")
    public String getUserList(Model model){
        List<User> userList = userService.getUserList();
        model.addAttribute("users",userList);
        return "table/user_table";
    }


    @GetMapping("/user/deleteuser/{id}")
    public String deleteUser(@PathVariable("id") Long id){

        userService.removeById(id);

        return "redirect:/userlist";
    }

    @GetMapping("/user/adduser")
    public String addUser(){
        return "redirect:/userlist";
    }

//    @GetMapping(value = "/user/create")
//    public String createUserTest(){
//
//        User user = new User();
//        user.setId(8l);
//        user.setName("cc");
//        user.setAge(12);
//        user.setEmail("2132@qq.com");
//        int result = userService.createUser(user);
//        log.info("******插入结果：{}",result);
//        if(result > 0){
//            return "插入成功！！！";
//            //return new CommonResult(200,"插入数据库成功，serverPort: "+serverPort,result);
//        }else{
//            return "插入失败！！！";
//            //return new CommonResult(444,"插入数据库失败",null);
//        }
//    }

    @PostMapping (value = "/user/createdemo")
    public CommonResult createUserDemo(@RequestBody User user){
        int result = userService.createUser(user);
        log.info("******插入结果：{}",result);
        if(result > 0){
           // return "插入成功！！！";
            return new CommonResult(200,"插入数据库成功，serverPort: "+serverPort,result);
        }else{
            //return "插入失败！！！";
            return new CommonResult(444,"插入数据库失败",null);
        }
    }

}
