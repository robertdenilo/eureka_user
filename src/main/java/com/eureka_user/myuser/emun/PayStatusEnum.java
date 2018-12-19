package com.eureka_user.myuser.emun;

import lombok.Getter;

/*
@Author Ming Zhou
@Date: 2018/11/16 15:30
*/
@Getter
public enum PayStatusEnum {
    WAIT(0,"waiting"),SUCCESS(1,"paid");
    private Integer code;
    private String msg;

    PayStatusEnum(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }
}
