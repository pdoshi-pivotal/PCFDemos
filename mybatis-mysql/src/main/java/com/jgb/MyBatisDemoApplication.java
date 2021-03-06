package com.jgb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.jgb.service.MyBatisUserService;
import com.jgb.service.UserService;

@SpringBootApplication
public class MyBatisDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(MyBatisDemoApplication.class, args);
    }

    @Bean
    public UserService userService() {
        return new MyBatisUserService();
    }
}
