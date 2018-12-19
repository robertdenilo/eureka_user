package com.eureka_user.myuser.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

/*
@Author Ming Zhou
@Date: 2018/12/5 23:13
*/
@Data
@Entity
public class UserInfo {
    @Id
    private String id;

    private String username;

    private String password;

    private String openid;

    private String role;

}
