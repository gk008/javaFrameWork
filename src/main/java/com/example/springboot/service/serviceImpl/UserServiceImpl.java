package com.example.springboot.service.serviceImpl;

import com.alibaba.fastjson.JSONObject;
import com.example.springboot.dao.UserMapper;
import com.example.springboot.entity.User;
import com.example.springboot.entity.UserExample;
import com.example.springboot.entity.Userinfo;
import com.example.springboot.service.UserInfoService;
import com.example.springboot.service.UserService;
import com.example.springboot.util.DataCheckUtil;
import com.example.springboot.util.SpringContextHolder;
import com.example.springboot.util.TokenUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

@Service("userService")
@Primary
public class UserServiceImpl implements UserService {

    @Autowired
    UserMapper userMapper;

    @Override
    public List<User> getUsers() {
        UserExample userExample = new UserExample();
        userExample.createCriteria().andIdIsNotNull();
        return userMapper.selectByExample(userExample);
    }

    @Override
    public User getUser(Integer id) {
        return userMapper.selectByPrimaryKey(id);
    }

    @Override
    public User getUser(String phoneNumber) {
        UserExample userExample = new UserExample();
        userExample.createCriteria().andPhonenumberLike(phoneNumber);
        List<User> users = userMapper.selectByExample(userExample);
        User user = null;
        if (users != null && users.size() > 0) {
            user = users.get(0);
        }
        return user;
    }

    @Override
    public User addUser(User user) {
        userMapper.insertSelective(user);
        return getUser(user.getPhonenumber());
    }

    @Override
    public String login(String phoneNumber, String password,
                        HttpServletRequest request, HttpServletResponse response) {
        JSONObject jsonObject = new JSONObject();
        int code = 0;
        String message = "登录成功";
        if (DataCheckUtil.checkPhoneNumber(phoneNumber)) {
            User user = getUser(phoneNumber);
            if (user != null) {
                if (password.equals(user.getPassword())) {
                    Integer id = user.getId();
                    jsonObject.put("userid", id);
                    request.getSession().setAttribute("user", user);
                    Cookie cookie = new Cookie("token",
                            TokenUtil.getLoginToken(phoneNumber, user.getId()));
                    cookie.setPath("/");
                    response.addCookie(cookie);
                } else {
                    code = 1;
                    message = "密码错误";
                }
            } else {
                code = 2;
                message = "用户不存在";
            }
        } else {
            code = 3;
            message = "请输入合法的电话号码";
        }
        jsonObject.put("code", code);
        jsonObject.put("message", message);
        return jsonObject.toJSONString();
    }

    @Override
    public String register(String phoneNumber, String password,
                           HttpServletRequest request, HttpServletResponse response) {
        JSONObject jsonObject = new JSONObject();
        int code = 0;
        String message = "注册成功";
        if (DataCheckUtil.checkPhoneNumber(phoneNumber)) {
            User user = null;
            user = getUser(phoneNumber);
            if (user == null) {
                user = new User();
                user.setPhonenumber(phoneNumber);
                user.setPassword(password);
                addUser(user);
                user = getUser(phoneNumber);
                //生成对应的用户信息
                Userinfo userinfo = new Userinfo();
                userinfo.setUid(user.getId());
                userinfo.setNickname("手机用户_" + user.getPhonenumber());
                UserInfoService userInfoService = SpringContextHolder.getBean("userInfoService");
                userInfoService.saveUserInfo(userinfo);
            } else {
                code = 2;
                message = "该号码已注册";
            }
        } else {
            code = 3;
            message = "请输入合法的电话号码";
        }
        jsonObject.put("code", code);
        jsonObject.put("message", message);
        return jsonObject.toJSONString();
    }

    @Override
    public String logout(HttpServletRequest request, HttpServletResponse response) {
        request.getSession().invalidate();
        Cookie[] cookies = request.getCookies();
        for (Cookie cookie : cookies) {
            if ("token".equals(cookie.getName())) {
                Cookie newCookie = new Cookie("token", "");
                newCookie.setPath("/");
                newCookie.setMaxAge(0);
                response.addCookie(newCookie);
            }
        }
        return "已注销";
    }

    @Override
    public String changePassword(Integer id, String oldPassword, String newPassword,
                                 HttpServletRequest request, HttpServletResponse response) {
        JSONObject jsonObject = new JSONObject();
        int code = 0;
        String message = "修改成功";
        User user = userMapper.selectByPrimaryKey(id);
        if (user != null) {
            if (oldPassword.equals(user.getPassword())) {
                user.setPassword(newPassword);
                userMapper.updateByPrimaryKey(user);
                logout(request, response);
            } else {
                code = 2;
                message = "旧密码不符";
            }
        } else {
            code = 1;
            message = "修改失败";
        }
        jsonObject.put("code", code);
        jsonObject.put("message", message);
        return jsonObject.toJSONString();
    }

    @Override
    public String changePhoneNumber() {
        return null;
    }
}
