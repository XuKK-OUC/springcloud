package com.atguigu.springcloud.cfgbeans;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @author XuKaiKai
 * @date 2019/8/6 21:16
 */

@Configuration
public class ConfigBean {  //boot --> spring  applicationContext.xml  ------@Configuration配置  ConfigBean = applicationContext.xml

    @Bean
    @LoadBalanced //spring cloud ribbon是基于 Netflix Ribbon 实现的一套客户端 负载均衡的工具

    public RestTemplate getRestTemplate(){
       return new RestTemplate();
   }
}

