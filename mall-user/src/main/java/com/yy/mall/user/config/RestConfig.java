package com.yy.mall.user.config;


import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.cloud.client.loadbalancer.LoadBalancerInterceptor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.Collections;

/**
 * @author Yu#
 */
@Configuration
public class RestConfig {

    @Autowired
    LoadBalancerClient loadBalancerClient;
    
    @Bean
//    @LoadBalanced
    public RestTemplate restTemplate() {

//        restTemplate.setInterceptors(Collections.singletonList(new LoadBalancerInterceptor(loadBalancerClient)));
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate;
    }
    
    
}
