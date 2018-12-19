package com.eureka_user.myuser.utils;

//import javax.servlet.http.Cookie;
//import javax.servlet.http.HttpServletResponse;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletResponse;

/*
@Author Ming Zhou
@Date: 2018/12/5 23:46
*/
public class CookieUtil {
    public static void set(HttpServletResponse res, String name, String value, int maxAge){
        Cookie cookie = new Cookie(name,value);
        cookie.setPath("/");
        cookie.setMaxAge(maxAge);
        res.addCookie(cookie);
    }

}
