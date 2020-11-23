package com.jy.controller;

import com.jy.api.CommonResult;
import com.jy.entity.User;

import com.jy.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController {
    @Autowired
    private UserService userService;
    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public CommonResult login(@RequestBody User user) {
        userService.login(user.getUsername(),user.getPassword());
//        if (user.getUsername().equals("admin") && user.getPassword().equals("123456"))
//            return CommonResult.success("admin");
//        else
//            return CommonResult.validateFailed();
        if(userService == null)
            return CommonResult.success(user.getUsername());
        else
            return CommonResult.validateFailed();
    }
}