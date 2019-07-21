package com.fcx.dao.impl;

import com.fcx.dao.IUserDao;
import com.fcx.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @Author: fancaixing
 * @Date: 2019/7/21 11:23
 * @Version 1.0
 */
@Repository
public class UserDaoImpl implements IUserDao {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public int add(User user) {
        return jdbcTemplate.update("insert into user(name,age,address,pwd) values(?, ?,?,?)",
                user.getName(), user.getAge(), user.getAddress(), user.getPwd());
    }

    @Override
    public int update(User user) {
        return jdbcTemplate.update("UPDATE  user SET name=? ,age=? WHERE id=?",
                user.getName(),user.getAge(),user.getId());
    }

    @Override
    public int delete(int id) {
        return jdbcTemplate.update("DELETE from TABLE user where id=?",id);
    }

    @Override
    public User findUserById(int id) {
        List<User> list = jdbcTemplate.query("select * from user where id = ?", new Object[]{id}, new BeanPropertyRowMapper(User.class));
        if(list!=null && list.size()>0){
            User account = list.get(0);
            return account;
        }else{
            return null;
        }
    }

    @Override
    public List<User> findUserList() {
        List<User> list = jdbcTemplate.query("select * from user", new Object[]{}, new BeanPropertyRowMapper(User.class));
        if(list!=null && list.size()>0){
            return list;
        }else{
            return null;
        }
    }
}
