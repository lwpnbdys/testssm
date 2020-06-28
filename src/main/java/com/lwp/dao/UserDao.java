package com.lwp.dao;

import com.lwp.pojo.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

@Component
public interface UserDao {

    public User getUser();
}
