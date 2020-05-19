package com.hd.beast.configs.datasources;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;

import javax.sql.DataSource;
@Configuration
@MapperScan(basePackages = "com.hd.beast.mapper.mapper2",sqlSessionFactoryRef = "sqlSessionFactory2")
public class DataSourceConfig2 {
    @Bean(name="dataSource2")
    @ConfigurationProperties(prefix = "spring.datasource.data2",ignoreInvalidFields = true)
    public DataSource getDataSource2(){
        return DataSourceBuilder.create().build();
    }
    @Bean(name="sqlSessionFactory2")
    public SqlSessionFactory sqlSessionFactory2(@Qualifier("dataSource2")DataSource dataSource) throws Exception {
        SqlSessionFactoryBean bean=new SqlSessionFactoryBean();
        bean.setDataSource(dataSource);
        bean.setMapperLocations(new PathMatchingResourcePatternResolver().getResources("classpath*:/mapping/mapping2/*Mapper.xml"));
        return bean.getObject();
    }
    @Bean("sqlSessionTemplate2")
    public SqlSessionTemplate sqlSessionTemplate2(@Qualifier("sqlSessionFactory2") SqlSessionFactory sqlSessionFactory){
        return new SqlSessionTemplate(sqlSessionFactory);
    }

    @Bean
    public DataSourceTransactionManager cbcBusinessTransctionManager2(@Qualifier("dataSource2") DataSource dataSource){
        return new DataSourceTransactionManager(dataSource);
    }
}
