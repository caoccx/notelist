package com.itcc.boot.controller;

import com.itcc.boot.bean.User;
import com.itcc.boot.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

/**
 * Created by caocaixia on 2021/2/22 12:46
 */
@Controller
public class UserController {

    @Autowired
    UserService userService;

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

}
