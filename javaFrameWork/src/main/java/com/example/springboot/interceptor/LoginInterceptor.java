package com.example.springboot.interceptor;

import com.example.springboot.dao.UserMapper;
import com.example.springboot.entity.User;
import com.example.springboot.util.MD5Utils;
import com.example.springboot.util.SpringContextHolder;
import com.example.springboot.util.TokenUtil;
import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginInterceptor implements HandlerInterceptor {

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        if (request.getSession().getAttribute("user") != null) {
            return true;
        }
        String[] splits = TokenUtil.getTokenFromCookies(request.getCookies());
        if (splits != null) {
            UserMapper userMapper = SpringContextHolder.getBean(UserMapper.class);
            User user = userMapper.selectByPrimaryKey(Integer.valueOf(splits[1]));
            if (user != null) {
                String md5 = MD5Utils.encodeByMD5(user.getPhonenumber());
                if (md5.equals(splits[0])) {
                    request.getSession().setAttribute("user", user);
                    return true;
                }
            }
        }
        return false;
    }
}
