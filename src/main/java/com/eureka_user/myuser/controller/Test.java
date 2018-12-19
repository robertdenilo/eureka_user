package com.eureka_user.myuser.controller;

import java.text.SimpleDateFormat;
import java.util.Properties;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/*
@Author Ming Zhou
@Date: 2018/12/7 16:44
*/
public class Test {
    public Test() {
        ExecutorService es = Executors.newFixedThreadPool(2);
        es.execute(new Runnable() {
            @Override
            public void run() {

            }
        });
        es.submit(new Runnable() {
            @Override
            public void run() {

            }
        });
        Properties p = System.getProperties();
    }
}
