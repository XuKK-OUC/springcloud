package com.atguigu.springcloud.cfgbeans;

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
   public RestTemplate getRestTemplate(){
       return new RestTemplate();
   }
}

