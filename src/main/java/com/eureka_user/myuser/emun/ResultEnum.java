package com.eureka_user.myuser.emun;

import lombok.Getter;

/*
@Author Ming Zhou
@Date: 2018/11/19 22:17
*/
@Getter
public enum ResultEnum {
    LOGIN_FAIL(1,"login fail"),
    ROLE_ERROR(2, "role not allowed");
    private Integer code;
    private String msg;
    ResultEnum(Integer code, String msg){
         this.code = code;
         this.msg = msg;
    }
}
