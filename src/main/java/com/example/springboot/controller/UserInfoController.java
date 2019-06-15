package com.example.springboot.controller;

import com.example.springboot.entity.Userinfo;
import com.example.springboot.service.UserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/userinfo")
public class UserInfoController {

    @Autowired
    UserInfoService userInfoService;

    //获取用户信息加手机号
    @PostMapping("/getUserinfo")
    public String getUserInfo(Integer uid) {
        return userInfoService.getUserInfo(uid);
    }

    //修改用户信息
    @PostMapping("/changeUserinfo")
    public String changeUserInfo(Userinfo userinfo) {
        return userInfoService.changeUserInfo(userinfo);
    }

}
