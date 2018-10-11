package com.zhuguan.zhou.mapper;

import com.zhuguan.zhou.entity.User;
import com.zhuguan.zhou.mappers.MyMapper;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

@Mapper
@Component
public interface UserMapper extends MyMapper<User> {
}
