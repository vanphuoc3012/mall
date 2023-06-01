package com.ph.mall.demo.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@MapperScan("com.ph.mall.mbg.mapper")
public class MyBatisConfig {
}
