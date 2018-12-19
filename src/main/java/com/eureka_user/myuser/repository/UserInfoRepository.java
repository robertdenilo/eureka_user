package com.eureka_user.myuser.repository;

import com.eureka_user.myuser.entity.UserInfo;
import org.springframework.data.jpa.repository.JpaRepository;

/*
@Author Ming Zhou
@Date: 2018/12/5 23:16
*/
public interface UserInfoRepository extends JpaRepository<UserInfo,String> {
    UserInfo findByOpenid(String openid);
    UserInfo findAllById(String id);
}
