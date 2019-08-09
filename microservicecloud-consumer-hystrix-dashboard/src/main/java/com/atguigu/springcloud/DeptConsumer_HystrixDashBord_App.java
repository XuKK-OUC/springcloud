package com.atguigu.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

/**
 * @author XuKaiKai
 * @date 2019/8/9 19:36
 */
@SpringBootApplication
@EnableHystrixDashboard
public class DeptConsumer_HystrixDashBord_App {
    public static void main(String[] args) {
        SpringApplication.run(DeptConsumer_HystrixDashBord_App.class,args);
    }
}
