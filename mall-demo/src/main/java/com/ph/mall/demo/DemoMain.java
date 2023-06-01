package com.ph.mall.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoMain {
    public static void main(String[] args) {
        SpringApplication.run(DemoMain.class, args);
        System.out.println("Hello world!");
    }
}