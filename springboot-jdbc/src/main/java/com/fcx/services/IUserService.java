package com.fcx.services;

import com.fcx.entity.User;

import java.util.List;

/**
 * @Author: fancaixing
 * @Date: 2019/7/21 11:32
 * @Version 1.0
 */
public interface IUserService {
    int add(User user);

    int update(User user);

    int delete(int id);

    User findUserById(int id);

    List<User> findUserList();
}
