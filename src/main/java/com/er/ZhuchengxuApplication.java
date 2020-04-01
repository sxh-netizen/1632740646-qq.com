package com.er;

import org.mybatis.spring.annotation.MapperScan;
import org.mybatis.spring.annotation.MapperScans;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.servlet.View;
import org.springframework.web.servlet.ViewResolver;

import java.util.Locale;

@SpringBootApplication
//扫描路径下的mapper类
@MapperScan(basePackages = {"com.er.mapper"})
//扫描com下的所有类
@ComponentScan("com")
//开启缓存注解
@EnableCaching
public class ZhuchengxuApplication {

    public static void main(String[] args) {
        SpringApplication.run(ZhuchengxuApplication.class, args);
    }


}
