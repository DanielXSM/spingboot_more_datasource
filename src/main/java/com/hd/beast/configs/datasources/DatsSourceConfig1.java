package com.hd.beast.configs.datasources;

import com.alibaba.druid.spring.boot.autoconfigure.DruidDataSourceBuilder;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInterceptor;
import org.apache.ibatis.plugin.Interceptor;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.annotation.MapperScan;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;

import javax.sql.DataSource;
import java.util.Properties;

@Configuration
@MapperScan(basePackages = "com.hd.beast.mapper.mapper1",sqlSessionFactoryRef = "sqlSessionFactory1")
public class DatsSourceConfig1 {
    @Bean(name="dataSource1")
    // 表示这个数据源是默认数据源
    @Primary
    @ConfigurationProperties(prefix = "spring.datasource.data1",ignoreInvalidFields = true)
    public DataSource getDataSource1(){

        return DruidDataSourceBuilder.create().build();
//        return DataSourceBuilder.create(dataSourceProperties.getClassLoader())
//                .type(HikariDataSource.class)
//                .driverClassName(dataSourceProperties.determineDriverClassName())
//                .username(dataSourceProperties.determineUsername())
//                .password(dataSourceProperties.determinePassword())
//                .url(dataSourceProperties.determineUrl())
//                .build();
    }

    @Bean(name="sqlSessionFactory1")
    @Primary
    public SqlSessionFactory sqlSessionFactory1(@Qualifier("dataSource1")DataSource dataSource) throws Exception {
        SqlSessionFactoryBean bean=new SqlSessionFactoryBean();
        bean.setDataSource(dataSource);
        bean.setMapperLocations(new PathMatchingResourcePatternResolver().getResources("classpath*:/mapping/mapping1/*Mapper.xml"));
        //配置分页插件
//        PageHelper pageHelper = new PageHelper();
        Interceptor pageHelper = new PageInterceptor();
        Properties properties = new Properties();
        properties.setProperty("reasonable", "true");
        properties.setProperty("supportMethodsArguments", "true");
        properties.setProperty("returnPageInfo", "check");
        properties.setProperty("params", "count=countSql");
        pageHelper.setProperties(properties);

        //设置插件
        bean.setPlugins(new Interceptor[]{pageHelper});
        return bean.getObject();
    }
    @Bean("sqlSessionTemplate1")
    @Primary
    public SqlSessionTemplate sqlSessionTemplate1(@Qualifier("sqlSessionFactory1") SqlSessionFactory sqlSessionFactory1){
       return new SqlSessionTemplate(sqlSessionFactory1);
    }



    //    配置数据库1的事务管理器
    @Bean(name = "transactionManager1")
    @Primary
    public DataSourceTransactionManager cbcBusinessTransctionManager1(@Qualifier("dataSource1") DataSource dataSource){
        return new DataSourceTransactionManager(dataSource);
    }

}
