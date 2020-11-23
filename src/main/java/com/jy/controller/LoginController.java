package com.jy.controller;

import com.jy.api.CommonResult;
import com.jy.entity.User;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@RestController
public class LoginController {

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public CommonResult login(@RequestBody User user) {
        if (user.getName().equals("admin") && user.getPassword().equals("123456"))
            return CommonResult.success("admin");
        else
            return CommonResult.validateFailed();
    }
}


//import java.util.Objects;
//
//import javax.validation.Valid;
//
//import org.springframework.stereotype.Controller;
//import org.springframework.validation.BindingResult;
//import org.springframework.web.bind.annotation.CrossOrigin;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;
//import org.springframework.web.bind.annotation.ResponseBody;
//
//import com.hpxtest.blog.pojo.vo.VueLoginInfoVo;
//import com.hpxtest.blog.result.Result;
//import com.hpxtest.blog.result.ResultFactory;
//
//@Controller
//public class LoginController {
//
//    /**
//     * 登录控制器，前后端分离用的不同协议和端口，所以需要加入@CrossOrigin支持跨域。
//     * 给VueLoginInfoVo对象加入@Valid注解，并在参数中加入BindingResult来获取错误信息。
//     * 在逻辑处理中我们判断BindingResult知否含有错误信息，如果有错误信息，则直接返回错误信息。
//     */
//    @CrossOrigin
//    @RequestMapping(value = "/api/login", method = RequestMethod.POST, produces = "application/json; charset=UTF-8")
//    @ResponseBody
//    public User login(@Valid @RequestBody User user, BindingResult bindingResult) {
//        if (bindingResult.hasErrors()) {
//            String message = String.format("登陆失败，详细信息[%s]。", bindingResult.getFieldError().getDefaultMessage());
//            return ResultFactory.buildFailResult(message);
//        }
//        if (!Objects.equals("javalsj", user.getName()) || !Objects.equals("123456", user.getPassword())) {
//            String message = String.format("登陆失败，详细信息[用户名、密码信息不正确]。");
//            return ResultFactory.buildFailResult(message);
//        }
//        return ResultFactory.buildSuccessResult("登陆成功。");
//    }
//
//
//}
