package com.hd.beast;

import com.github.pagehelper.autoconfigure.PageHelperAutoConfiguration;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.sql.DataSource;

@SpringBootApplication(scanBasePackages = "com.hd.beast",exclude = {PageHelperAutoConfiguration.class})
//@MapperScan("com.hd.beast.mapper")
public class BeastApplication {

    public static void main(String[] args) {

        SpringApplication.run(BeastApplication.class, args);
    }

}
