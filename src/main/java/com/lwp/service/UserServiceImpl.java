package com.lwp.service;

import com.lwp.dao.UserDao;
import com.lwp.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService{
    @Autowired
    UserDao userDao;
    @Override
    public User getUser() {
        System.out.println(111111111);
        return userDao.getUser();
    }
}
