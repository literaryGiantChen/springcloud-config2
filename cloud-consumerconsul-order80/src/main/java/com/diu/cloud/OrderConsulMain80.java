package com.diu.cloud;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * @Author: DIU
 * @Date: 2021/10/1 16:20
 */
@SpringBootApplication
@Slf4j
@EnableDiscoveryClient
public class OrderConsulMain80 {

    public static void main(String[] args) {
        ConfigurableApplicationContext run = SpringApplication.run(OrderConsulMain80.class);
        log.info("初始化组件一共有：{}", run.getBeanDefinitionCount());
    }

}
