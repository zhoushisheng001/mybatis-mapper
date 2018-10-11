package com.zhuguan.zhou;

import com.zhuguan.zhou.entity.User;
import com.zhuguan.zhou.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.sql.Date;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ApplicationTests {

    @Autowired
    private UserService userService;

   @Test
    public void contextLoads() {
        User user = new User();
        user.setSex("1");
        user.setAddress("深圳");
        user.setBirthday(new Date(System.currentTimeMillis()));
        user.setUsername("马云");
        userService.getUserMapper().insert(user);
    }

}
