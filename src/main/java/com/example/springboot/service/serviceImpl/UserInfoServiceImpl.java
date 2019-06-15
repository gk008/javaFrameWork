package com.example.springboot.service.serviceImpl;

import com.alibaba.fastjson.JSONObject;
import com.example.springboot.dao.UserMapper;
import com.example.springboot.dao.UserinfoMapper;
import com.example.springboot.entity.User;
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

    @Autowired
    UserMapper userMapper;

    //获取所有用户信息
    @Override
    public List<Userinfo> getUserInfos() {
        UserinfoExample userinfoExample = new UserinfoExample();
        userinfoExample.createCriteria().andIdIsNotNull();
        List<Userinfo> userinfos = userinfoMapper.selectByExample(userinfoExample);
        return userinfos;
    }

    //根据用户id查找用户信息
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

    //保存用户信息 若不存在该用户，创建新纪录 若存在该用户，更新其记录
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

    /**
     * 修改用户信息
     *
     * @param userinfo
     * @return 返回json串
     * int code：消息码 0表示修改成功 1表示不存在该用户 2表示昵称不合法
     * String message：消息内容
     */
    @Override
    public String changeUserInfo(Userinfo userinfo) {
        JSONObject jsonObject = new JSONObject();
        int code = 0;
        String message = "修改成功";
        if (DataCheckUtil.checkNickName(userinfo.getNickname())) {
            if (getUserInfoByUid(userinfo.getUid()) != null) {
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

    /**
     * 返回用户信息与手机号
     * @param uid
     * @return 返回json串
     *          int code：消息码 0表示返回成功 1表示找不到该用户
     *          String message：消息内容
     */
    @Override
    public String getUserInfo(Integer uid) {
        JSONObject jsonObject = new JSONObject();
        int code = 0;
        String message = "返回成功";
        Userinfo userinfo = getUserInfoByUid(uid);
        User user = userMapper.selectByPrimaryKey(uid);
        if (userinfo != null && user != null) {
            jsonObject.put("userinfo", userinfo);
            jsonObject.put("phonenumber", user.getPhonenumber());
        } else {
            code = 1;
            message = "找不到该用户";
        }
        jsonObject.put("code", code);
        jsonObject.put("message", message);
        return jsonObject.toJSONString();
    }

}
