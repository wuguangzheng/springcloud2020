package com.atguigu.springcloud.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * 写这个配置类的目的是因为Spring boot为容器型框架，需要把RestTemplate注入
 */
@Configuration
public class ApplicationContextConfig {
    @Bean
    //@LoadBalanced  // ribbon自带的负载均衡
    public RestTemplate getRestTemplate(){
        return new RestTemplate();
    }
}
