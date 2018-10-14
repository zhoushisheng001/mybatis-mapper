package com.zhuguan.zhou;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import java.util.HashMap;
import java.util.Map;

@SpringBootApplication
//@ComponentScan("com.zhuguan.zhou.mapper")
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
        System.out.println("haoliao");
        Map<String, String> paraMap = new HashMap<>();
        paraMap.put("121","江西");
        paraMap.put("122","深圳");
        paraMap.put("123","北京");
        paraMap.put("124","广州");
        paraMap.put("125","珠海");
    }
}
