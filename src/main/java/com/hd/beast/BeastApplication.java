package com.hd.beast;

import com.github.pagehelper.autoconfigure.PageHelperAutoConfiguration;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.sql.DataSource;
@EnableTransactionManagement//启动注解事务管理，等同于xml配置方式<tx:annotation-driven/>
@SpringBootApplication(scanBasePackages = "com.hd.beast",exclude = {PageHelperAutoConfiguration.class})
//@MapperScan("com.hd.beast.mapper")
public class BeastApplication {

    @Bean
    public Object testBean(PlatformTransactionManager platformTransactionManager){
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>"+platformTransactionManager.getClass().getName());
        return new Object();
    }
    public static void main(String[] args) {

        SpringApplication.run(BeastApplication.class, args);
    }

}
