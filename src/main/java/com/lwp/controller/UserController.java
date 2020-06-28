package com.lwp.controller;

import com.lwp.pojo.User;
import com.lwp.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    UserService userService;

    @RequestMapping("getUser")
    public User getUser(){
        return userService.getUser();
    }
}
