package com.example.springboot;

import com.example.springboot.dao.UserMapper;
import com.example.springboot.entity.User;
import com.example.springboot.entity.UserExample;
import com.example.springboot.entity.Userinfo;
import com.example.springboot.service.UserInfoService;
import com.example.springboot.service.UserService;
import com.example.springboot.util.DataCheckUtil;
import com.example.springboot.util.MD5Utils;
import com.example.springboot.util.SpringContextHolder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringbootjavaframeApplicationTests {

    @Test
    public void test01() {
        String s = "123456";
        String md5 = MD5Utils.encryptPassword(s, "java");
        System.out.println(md5);
    }

    @Test
    public void test02() {
        UserMapper userMapper = SpringContextHolder.getBean(UserMapper.class);
        UserExample userExample = new UserExample();
        userExample.createCriteria().andPhonenumberLike("13377779999");
        System.out.println(userMapper.selectByExample(userExample).size());
    }

    @Test
    public void test03() {
        User user = null;
        UserService userService = SpringContextHolder.getBean("userService");
        user = userService.getUser("13377779999");
        System.out.println(user);
    }

    @Test
    public void testCheckPhoneNumber() {
        System.out.println(DataCheckUtil.checkPhoneNumber("17673127786"));
    }

    @Test
    public void testadduser() {
        UserMapper userMapper = SpringContextHolder.getBean(UserMapper.class);
        User user = new User();
        user.setPhonenumber("13377779999");
        user.setPassword("123456");
        userMapper.insertSelective(user);
    }

    @Test
    public void testuserinfo() {
        UserInfoService userInfoService = SpringContextHolder.getBean("userInfoService");
        Userinfo userinfo = new Userinfo();
        userinfo.setUid(1);
        userinfo.setNickname("aaa");
        System.out.println(userInfoService.saveUserInfo(userinfo));
    }

    @Test
    public void testcheckNickName() {
        System.out.println(DataCheckUtil.checkNickName("手机用户_17673127786"));
    }

}
