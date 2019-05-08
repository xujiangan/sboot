package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

// 包括@ComponentScan，和@SpringBootConfiguration，@EnableAutoConfiguration
@SpringBootApplication
// 扫描所有包下注解
//@ComponentScan(basePackages = {"com.example.*"})
public class DemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

}
