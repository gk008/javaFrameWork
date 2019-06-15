package com.example.springboot.service.serviceImpl;

import com.alibaba.fastjson.JSONObject;
import com.example.springboot.dao.UserinfoMapper;
import com.example.springboot.entity.Userinfo;
import com.example.springboot.entity.UserinfoExample;
import com.example.springboot.service.UserInfoService;
import com.example.springboot.util.DataCheckUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("userInfoService")
public class UserInfoServiceImpl implements UserInfoService {

    @Autowired
    UserinfoMapper userinfoMapper;

    @Override
    public List<Userinfo> getUserInfos() {
        UserinfoExample userinfoExample = new UserinfoExample();
        userinfoExample.createCriteria().andIdIsNotNull();
        List<Userinfo> userinfos = userinfoMapper.selectByExample(userinfoExample);
        return userinfos;
    }

    @Override
    public Userinfo getUserInfoById(Integer id) {
        return userinfoMapper.selectByPrimaryKey(id);
    }

    @Override
    public Userinfo getUserInfoByUid(Integer uid) {
        UserinfoExample userinfoExample = new UserinfoExample();
        userinfoExample.createCriteria().andUidEqualTo(uid);
        List<Userinfo> userinfos = userinfoMapper.selectByExample(userinfoExample);
        if (userinfos != null && userinfos.size() > 0) {
            return userinfos.get(0);
        }
        return null;
    }

    @Override
    public Userinfo saveUserInfo(Userinfo userinfo) {
        Integer uid = userinfo.getUid();
        if (getUserInfoByUid(uid) == null) {
            userinfoMapper.insert(userinfo);
        } else {
            UserinfoExample userinfoExample = new UserinfoExample();
            userinfoExample.createCriteria().andUidEqualTo(uid);
            userinfoMapper.updateByExampleSelective(userinfo, userinfoExample);
        }
        return getUserInfoByUid(uid);
    }

    @Override
    public String changeUserInfo(Userinfo userinfo) {
        JSONObject jsonObject = new JSONObject();
        int code = 0;
        String message = "修改成功";
        if (DataCheckUtil.checkNickName(userinfo.getNickname())) {
            if (getUserInfoById(userinfo.getId()) != null) {
                saveUserInfo(userinfo);
                jsonObject.put("newUserinfo", userinfo);
            } else {
                code = 1;
                message = "不存在该用户";
            }
        } else {
            code = 2;
            message = "昵称不合法";
        }
        jsonObject.put("code", code);
        jsonObject.put("message", message);
        return jsonObject.toJSONString();
    }

    @Override
    public String getUserInfo(Integer uid) {
        JSONObject jsonObject = new JSONObject();
        int code = 0;
        String message = "返回成功";
        Userinfo userinfo = getUserInfoByUid(uid);
        if (userinfo != null) {
            jsonObject.put("userinfo", userinfo);
        } else {
            code = 1;
            message = "找不到该用户";
        }
        return jsonObject.toJSONString();
    }

}
