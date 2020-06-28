package com.lwp;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages = {"com.lwp.dao"})
public class TestssmApplication {

    public static void main(String[] args) {
        SpringApplication.run(TestssmApplication.class, args);
    }

}
