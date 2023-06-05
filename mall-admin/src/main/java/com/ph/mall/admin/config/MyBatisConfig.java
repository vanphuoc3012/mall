package com.ph.mall.admin.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

@MapperScan("com.ph.mall.mbg.mapper")
@Configuration
public class MyBatisConfig {
}
