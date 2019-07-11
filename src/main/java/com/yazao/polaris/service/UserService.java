package com.yazao.polaris.service;

import com.yazao.polaris.pojo.User;

import java.util.List;

public interface UserService {
    public User findUserById(int id);

    List<User> findAllUsers();
}
