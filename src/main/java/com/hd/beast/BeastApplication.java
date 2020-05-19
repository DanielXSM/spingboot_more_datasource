package com.hd.beast;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
//@MapperScan("com.hd.beast.mapper")
public class BeastApplication {

    public static void main(String[] args) {
        SpringApplication.run(BeastApplication.class, args);
    }

}
