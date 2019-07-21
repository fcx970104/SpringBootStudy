package com.fcx.controller;

import com.fcx.entity.User;
import com.fcx.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Author: fancaixing
 * @Date: 2019/7/21 14:46
 * @Version 1.0
 */
@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    public UserService userService;

    @RequestMapping(value = "/{id}",method = RequestMethod.GET)
    public List<User> getUsers(@PathVariable("id") int id){
        return userService.findById(id);
    }
}
