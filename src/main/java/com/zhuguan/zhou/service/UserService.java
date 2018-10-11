package com.zhuguan.zhou.service;

import com.zhuguan.zhou.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    private UserMapper userMapper;

    public UserMapper getUserMapper() {
        return this.userMapper;
    }

}
