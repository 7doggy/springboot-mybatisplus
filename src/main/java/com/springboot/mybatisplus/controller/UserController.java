package com.springboot.mybatisplus.controller;

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

    @GetMapping("/saveUser")
    public String saveUser() {
        User user = new User();
        user.setId(100L);
        user.setName("Lichun");
        user.setAge(11);
        user.setEmail("run200@163.com");
        userService.save(user);
        return "ok";
    }

}
