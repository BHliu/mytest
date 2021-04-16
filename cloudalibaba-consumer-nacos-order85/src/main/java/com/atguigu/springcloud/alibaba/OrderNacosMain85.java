package com.atguigu.springcloud.alibaba;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @Author 刘波华
 * @Data 2021/4/10 10:16
 * @Description
 **/

@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
public class OrderNacosMain85 {
    public static void main(String[] args) {
        SpringApplication.run(OrderNacosMain85.class, args);
    }

}
