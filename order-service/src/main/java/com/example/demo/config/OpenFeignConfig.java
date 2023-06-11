package com.example.demo.config;

import feign.Logger;
import org.springframework.context.annotation.Bean;

public class OpenFeignConfig {
    @Bean
    public Logger.Level feignLogLevel() {
        // 日志级别为BASIC
        return Logger.Level.FULL;
    }
}
