package com.yazao.polaris.service.impl;

import com.yazao.polaris.mapper.UserMapper;
import com.yazao.polaris.pojo.User;
import com.yazao.polaris.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    public UserMapper userMapper;

    @Override
    public User findUserById(int id) {
        User user = null;
        try {
            user =  userMapper.findUserById(id);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            return user;
        }
    }

    @Override
    public List<User> findAllUsers() {
        List<User> userList = null;
        try {
            userList = userMapper.findAllUsers();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            return userList;
        }
    }
}
