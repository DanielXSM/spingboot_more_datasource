package com.hd.beast.configs.druid;

import com.alibaba.druid.pool.DruidDataSource;
import com.alibaba.druid.spring.boot.autoconfigure.DruidDataSourceBuilder;
import com.alibaba.druid.support.http.StatViewServlet;
import com.alibaba.druid.support.http.WebStatFilter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import javax.sql.DataSource;

/**
 * 数据库连接池配置
 */
@Configuration
public class DruidConfig {

    @Bean
    public ServletRegistrationBean druidServlet(){// 主要实现web监控的配置处理
        ServletRegistrationBean servletRegistrationBean=new ServletRegistrationBean(new StatViewServlet(),"/druid/*");//表示进行druid监控的配置处理操作
        servletRegistrationBean.addInitParameter("allow", "127.0.0.1,129.168.1.11");//白名单
        servletRegistrationBean.addInitParameter("deny", "129.168.1.12");//黑名单
        servletRegistrationBean.addInitParameter("loginUsername", "root");//用户名
        servletRegistrationBean.addInitParameter("loginPassword", "root");//密码
        //是否能够重置数据 禁用HTML页面上的“Reset All”功能
        servletRegistrationBean.addInitParameter("resetEnable", "false");//是否可以重置数据源
        return servletRegistrationBean;

    }

    @Bean    //监控
    public FilterRegistrationBean filterRegistrationBean(){
        FilterRegistrationBean filterRegistrationBean=new FilterRegistrationBean();
        filterRegistrationBean.setFilter(new WebStatFilter());
        filterRegistrationBean.addUrlPatterns("/*");//所有请求进行监控处理
        filterRegistrationBean.addInitParameter("exclusions", "*.js,*.gif,*.jpg,*.css,/druid/*");//排除
        return filterRegistrationBean;
    }

/*    @Bean(name = "data111")
    @ConfigurationProperties(prefix = "spring.datasource",ignoreInvalidFields = true)
    public DataSource druidDataSource1() {
        return new DruidDataSource();
    }*/

//    @Bean(destroyMethod ="close", initMethod = "init")
   /* @Bean
    @ConfigurationProperties(prefix = "spring.datasource.druid",ignoreInvalidFields = true)
    public DruidDataSource druidDataSource12() {
        return DruidDataSourceBuilder.create().build();
       *//* DruidDataSource datasource=new DruidDataSource();
        datasource.setUrl("jdbc:postgresql://10.100.21.106:5432/i20_gateway");
                 datasource.setUsername("postgres");
                 datasource.setPassword("postgres");
                 datasource.setDriverClassName("org.postgresql.Driver");
                 datasource.setInitialSize(5);
                 datasource.setMinIdle(5);
        return new DruidDataSource();*//*
    }*/



}
