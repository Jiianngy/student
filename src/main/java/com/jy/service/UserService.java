package com.jy.service;


import com.jy.entity.User;

public interface UserService {
    public User login(String username, String password);
}
