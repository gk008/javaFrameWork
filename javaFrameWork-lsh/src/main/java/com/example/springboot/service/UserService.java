package com.example.springboot.service;

import com.example.springboot.entity.User;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

public interface UserService {

    public List<User> getUsers();

    public User getUser(Integer id);

    public User getUser(String phoneNumber);

    public User addUser(User user);

    public String login(String phoneNumber, String password, HttpServletRequest request, HttpServletResponse response);

    public String register(String phoneNumber, String password, HttpServletRequest request, HttpServletResponse response);

    public String logout(HttpServletRequest request, HttpServletResponse response);

    public String changePassword(Integer id, String oldPassword, String newPassword, HttpServletRequest request, HttpServletResponse response);

    public String changePhoneNumber();
}
