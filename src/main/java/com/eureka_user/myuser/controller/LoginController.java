package com.eureka_user.myuser.controller;

import com.eureka_user.myuser.VO.ResultVO;
import com.eureka_user.myuser.constant.CookieConstant;
import com.eureka_user.myuser.emun.ResultEnum;
import com.eureka_user.myuser.emun.RoleEnum;
import com.eureka_user.myuser.entity.UserInfo;
import com.eureka_user.myuser.service.UserService;
import com.eureka_user.myuser.utils.CookieUtil;
import com.eureka_user.myuser.utils.ResultVOUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;
import java.util.HashMap;

//import javax.servlet.http.HttpServletResponse;

/*
@Author Ming Zhou
@Date: 2018/12/5 23:22
*/
@RestController
@RequestMapping("/login")
public class LoginController {
    @Autowired
    private UserService userService;

@GetMapping("/buyer")
public ResultVO buyer(@RequestParam("openid") String openid, HttpServletResponse req){
    UserInfo userInfo = userService.findByOpenid(openid);
    if (userInfo == null){
        return ResultVOUtil.error(ResultEnum.LOGIN_FAIL);
    }
    if(!RoleEnum.BUYER.getCode().equals(userInfo.getRole()) ){
        return ResultVOUtil.error(ResultEnum.LOGIN_FAIL);
    }
     CookieUtil.set(req, CookieConstant.OPENID,  openid, CookieConstant.EXPIRE);
     return ResultVOUtil.success();
}
    @GetMapping("/seller")
    public ResultVO seller(@RequestParam("id") String id){

        UserInfo userInfo = userService.findById(id);
        HashMap<String, UserInfo> ul = new HashMap<String, UserInfo>();
        ul.put(id,userInfo);
        System.out.println(userInfo);
    return ResultVOUtil.getUser(ul);
    }
    @PostMapping("/setuser")
    public ResultVO setUser(@RequestBody UserInfo userInfo){

        userService.saveUser(userInfo);
        HashMap<String, UserInfo> ul = new HashMap<String, UserInfo>();
        ul.put("1",userInfo);
        System.out.println(userInfo);
        return ResultVOUtil.getUser(ul);
    }
}
