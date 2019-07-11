package com.yazao.polaris.mapper;

import com.yazao.polaris.pojo.User;

import java.util.List;

public interface UserMapper {

    public User findUserById(int id);

    List<User> findAllUsers();
}
