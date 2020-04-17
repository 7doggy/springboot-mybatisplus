package com.springboot.mybatisplus.controller;

import com.baomidou.mybatisplus.extension.conditions.query.QueryChainWrapper;
import com.springboot.mybatisplus.entity.User;
import com.springboot.mybatisplus.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    private IUserService userService;

    @GetMapping("/getUser")
    public List<User> getUser() {
        List<User> list = userService.list();
        return list;
    }



}
