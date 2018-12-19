package com.eureka_user.myuser.utils;


import com.eureka_user.myuser.VO.ResultVO;
import com.eureka_user.myuser.emun.ResultEnum;

import java.util.Map;

/*
@Author Ming Zhou
@Date: 2018/11/19 14:34
*/
public class ResultVOUtil {

    public static ResultVO<Map<String,String>> getUser(Object obj){
        ResultVO<Map<String,String>> rvo =  new ResultVO<Map<String,String>>();
        rvo.setData((Map<String, String>) obj);
        rvo.setCode(0);
        rvo.setMsg("Successful");
        return rvo;
    }
    public static ResultVO<Map<String,String>> success(){
        ResultVO<Map<String,String>> rvo =  new ResultVO<Map<String,String>>();
        rvo.setCode(0);
        rvo.setMsg("Successful");
        return rvo;
    }
    public static ResultVO<Map<String,String>> error(ResultEnum resultEnum){
        ResultVO<Map<String,String>> rvo =  new ResultVO<Map<String,String>>();
        rvo.setCode(resultEnum.getCode());
        rvo.setMsg("Failure!!!!!");
        return rvo;
    }
}
