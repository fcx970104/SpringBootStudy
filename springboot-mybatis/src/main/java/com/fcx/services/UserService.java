package com.fcx.services;

import com.fcx.dao.UserMapper;
import com.fcx.entity.User;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author: fancaixing
 * @Date: 2019/7/21 14:12
 * @Version 1.0
 */
@Service
public class UserService {
    @Autowired
    private UserMapper userMapper;

    public List<User> findById(int id){
        return userMapper.findById(id);
    }

    public int insert(User user){
        return userMapper.insert(user);
    }
}
