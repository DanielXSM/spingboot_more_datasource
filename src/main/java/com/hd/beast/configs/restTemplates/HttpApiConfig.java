package com.hd.beast.configs.restTemplates;

import com.alibaba.fastjson.support.spring.FastJsonHttpMessageConverter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.MediaType;
import org.springframework.http.client.ClientHttpRequestFactory;
import org.springframework.http.client.SimpleClientHttpRequestFactory;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.converter.StringHttpMessageConverter;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;

@Configuration
public class HttpApiConfig {

    @Bean
    public RestTemplate restTemplate(ClientHttpRequestFactory factory) {
        RestTemplate restTemplate = new RestTemplate();
        List<HttpMessageConverter<?>> converters= restTemplate.getMessageConverters();
        List<MediaType> fastMediaTypes = new ArrayList<>();
        MediaType type = MediaType.parseMediaType("application/json; charset=UTF-8");
        // 处理中文乱码问题
        fastMediaTypes.add(type);
        FastJsonHttpMessageConverter fastConverter = new FastJsonHttpMessageConverter();
        StringHttpMessageConverter stringConverter = new StringHttpMessageConverter();
        stringConverter.setSupportedMediaTypes(fastMediaTypes);
        fastConverter.setSupportedMediaTypes(fastMediaTypes);
        converters.add(0, fastConverter);
        converters.set(1,stringConverter);
        return restTemplate;

    }

    @Bean
    public ClientHttpRequestFactory simpleClientHttpRequestFactory() {
        SimpleClientHttpRequestFactory factory = new SimpleClientHttpRequestFactory();
        factory.setReadTimeout(5000);//单位为ms
        factory.setConnectTimeout(5000);//单位为ms
        return factory;
    }

}
