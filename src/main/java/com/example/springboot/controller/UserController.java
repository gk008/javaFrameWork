package com.example.springboot.controller;

import com.alibaba.fastjson.JSONObject;
import com.example.springboot.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    UserService userService;

    @PostMapping("/login")
    public String login(@RequestParam("phonenumber") String phoneNumber,
                        @RequestParam("password") String password,
                        HttpServletRequest request, HttpServletResponse response) {
        return userService.login(phoneNumber, password, request, response);
    }

    @PostMapping("/register")
    public String register(@RequestParam("phonenumber") String phoneNumber,
                           @RequestParam("password") String password,
                           HttpServletRequest request, HttpServletResponse response) {
        return userService.register(phoneNumber, password, request, response);
    }

    @GetMapping("/logout")
    public String logout(HttpServletRequest request, HttpServletResponse response) {
        return userService.logout(request, response);
    }

    @PostMapping("/changepassword")
    public String changePassword(@RequestParam("oldpassword") String oldPassword,
                                 @RequestParam("newpassword") String newPassword,
                                 @RequestParam("userid") Integer id,
                                 HttpServletRequest request, HttpServletResponse response) {
        return userService.changePassword(id, oldPassword, newPassword, request, response);
    }

    @GetMapping(value = "/main")
    public String main(HttpServletRequest request) {
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("user", request.getSession().getAttribute("user"));
        return jsonObject.toJSONString();
    }

    @GetMapping(value = "/cookies")
    public String cookies(HttpServletRequest request) {
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("cookies", request.getCookies());
        return jsonObject.toJSONString();
    }

}
