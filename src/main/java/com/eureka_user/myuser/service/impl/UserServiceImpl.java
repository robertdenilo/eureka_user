package com.eureka_user.myuser.service.impl;

import com.eureka_user.myuser.entity.UserInfo;
import com.eureka_user.myuser.repository.UserInfoRepository;
import com.eureka_user.myuser.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/*
@Author Ming Zhou
@Date: 2018/12/5 23:20
*/
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserInfoRepository userInfoRepository;
    @Override
    public UserInfo findByOpenid(String openid) {
        UserInfo ui =userInfoRepository.findByOpenid(openid);
        return ui;
    }

    @Override
    public void saveUser(UserInfo userInfo) {
        userInfoRepository.save(userInfo);
    }

    @Override
    public UserInfo findById(String id) {
        UserInfo ui =userInfoRepository.findAllById(id);
        return ui;
    }


}
