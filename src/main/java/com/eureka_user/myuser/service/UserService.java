package com.eureka_user.myuser.service;

import com.eureka_user.myuser.entity.UserInfo;

/*
@Author Ming Zhou
@Date: 2018/12/5 23:18
*/
public interface UserService {
    UserInfo findByOpenid(String openid);
    void saveUser(UserInfo ui);
    UserInfo findById(String id);
}
