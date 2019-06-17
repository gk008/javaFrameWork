package com.example.springboot;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(value = "com.example.springboot.dao")
public class SpringbootjavaframeApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootjavaframeApplication.class, args);
    }

}
