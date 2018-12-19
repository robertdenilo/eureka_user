package com.eureka_user.myuser.VO;

import lombok.Data;

import java.util.Map;

/*
@Author Ming Zhou
@Date: 2018/11/16 23:46
*/
@Data
public class ResultVO<T> {
    private Integer code;
    private String msg;
    private T data;
}
