package com.atguigu.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author XuKaiKai
 * @date 2019/8/7 14:17
 */
@SpringBootApplication
@EnableEurekaServer
public class EurekaServer7002_App {  //EurekaServer服务器端启动类,接受其它微服务注册进来
    public static void main(String[] args) {
        SpringApplication.run(EurekaServer7002_App.class,args);
    }
}
