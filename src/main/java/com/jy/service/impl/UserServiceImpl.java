package com.jy.service.impl;

import com.jy.entity.User;
import com.jy.mapper.UserDao;
import com.jy.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;


@Service("UserService")
public class UserServiceImpl implements UserService {
    @Resource(name = "UserDao")
    private UserDao dao;

    @Override
    public User login(String username, String password){
        return dao.login(username, password);
    }
}
