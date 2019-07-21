package com.fcx.controller;

import com.fcx.entity.User;
import com.fcx.services.UserService;
import org.junit.runner.RunWith;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;


/**
 * @Author: fancaixing
 * @Date: 2019/7/21 14:15
 * @Version 1.0
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class TestMyBatis {
    private static final Logger log = LoggerFactory.getLogger(Test.class);

    @Autowired
    public UserService userService;

    @Test
    public void test1() throws Exception {
        final List<User> u1 = userService.findById(1);
        log.info("[根据id查询] - [{}]", u1);
    }
}
