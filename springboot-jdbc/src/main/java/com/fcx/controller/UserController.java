package com.fcx.controller;

import com.fcx.entity.User;
import com.fcx.services.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @Author: fancaixing
 * @Date: 2019/7/21 11:36
 * @Version 1.0
 */
@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    IUserService userService;

    @RequestMapping(value = "/list",method = RequestMethod.GET)
    public List<User> getUsers(){
        return userService.findUserList();
    }

    @RequestMapping(value = "/{id}",method = RequestMethod.GET)
    public  User getUserById(@PathVariable("id") int id){
        return userService.findUserById(id);
    }

    @RequestMapping(value = "/{id}",method = RequestMethod.PUT)
    public  String updateUser(@PathVariable("id")int id , @RequestBody User u){
        User user=new User();
        user.setAge(u.getAge());
        user.setName(u.getName());
        user.setId(id);
        int t=userService.update(user);
        if(t==1){
            return user.toString();
        }else {
            return "fail";
        }
    }

    @RequestMapping(value = "",method = RequestMethod.POST)
    public  String postUser(@RequestBody User u){
        User user=new User();
        user.setAge(u.getAge());
        user.setName(u.getName());
        user.setAddress(u.getAddress());
        user.setPwd(u.getPwd());
        int t= userService.add(user);
        if(t==1){
            return user.toString();
        }else {
            return "fail";
        }
    }
}
