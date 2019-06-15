package com.example.springboot.service;

import com.example.springboot.entity.Userinfo;

import java.util.List;

public interface UserInfoService {

    public List<Userinfo> getUserInfos();

    public Userinfo getUserInfoByUid(Integer uid);

    public Userinfo saveUserInfo(Userinfo userinfo);

    public String changeUserInfo(Userinfo userinfo);

    public String getUserInfo(Integer uid);

}
