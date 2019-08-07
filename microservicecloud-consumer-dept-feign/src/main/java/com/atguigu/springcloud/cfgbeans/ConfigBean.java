package com.atguigu.springcloud.cfgbeans;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import com.netflix.loadbalancer.RetryRule;
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

   //ribbon负载均衡算法的切换 核心组件 IRule

   /* @Bean
    public IRule getRule(){
        //return new RandomRule();  //使用随机算法实现负载均衡
        return  new RetryRule();
    }*/

}

