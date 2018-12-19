package com.eureka_user.myuser;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;





@SpringBootApplication
@EnableDiscoveryClient
public class MyuserApplication {

    public static void main(String[] args) {
        SpringApplication.run(MyuserApplication.class, args);
    }
}
