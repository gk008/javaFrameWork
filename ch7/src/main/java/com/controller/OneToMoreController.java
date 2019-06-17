package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.dao.UserDao;
import com.po.MyUser;

@Controller("oneToMoreController")
public class OneToMoreController {
	@Autowired
	private UserDao userDao;
	public void test()
	{
		MyUser auser1=userDao.selectUserById(1);
		System.out.println(auser1);
	}
}
