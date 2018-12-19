package com.eureka_user.myuser.emun;

import lombok.Getter;

/*
@Author Ming Zhou
@Date: 2018/12/5 23:40
*/
@Getter
public enum RoleEnum {
    BUYER("1", "buyer"), SELLER("2","seller");
    private String code;
    private String msg;

    RoleEnum(String code, String msg) {
        this.code = code;
        this.msg = msg;
    }
}
