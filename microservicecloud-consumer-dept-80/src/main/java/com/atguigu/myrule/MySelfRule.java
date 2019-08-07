package com.atguigu.myrule;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author XuKaiKai
 * @date 2019/8/7 19:28
 */

@Configuration
public class MySelfRule {

    @Bean
    public IRule myRule(){
        //return  new RandomRule();  //随机算法
        return new RandomRule_ZY();  //自定义算法
    }
}
