package com.eureka_user.myuser.controller;

import com.eureka_user.myuser.MyuserApplicationTests;
import com.eureka_user.myuser.entity.UserInfo;
import com.eureka_user.myuser.service.UserService;
import com.netflix.discovery.converters.Auto;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import static org.junit.Assert.*;

/*
@Author Ming Zhou
@Date: 2018/12/6 11:24
*/


public class LoginControllerTest extends MyuserApplicationTests {
    @Autowired
    private UserService userService;
    @Test
    public void buyer() {
        UserInfo userInfo = userService.findByOpenid("123");
        Assert.assertEquals(userInfo.getId(),"1");
    }
}