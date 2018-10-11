package com.zhuguan.zhou.controller;

import com.zhuguan.zhou.entity.User;
import com.zhuguan.zhou.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/getUserInfoList",method = RequestMethod.GET)
    public List<User> getUserInfoList () {
        User user = new User();
        List<User> users = userService.getUserMapper().selectAll();
        return users;
    }
}
