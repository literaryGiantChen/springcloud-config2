package com.diu.cloud;

import com.diu.myrule.MySelfRule;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * @author DIU
 * @date 2021/9/29 19:59
 */
@SpringBootApplication
@Slf4j
@EnableEurekaClient
@RibbonClient(name = "CLOUD-PAYMENT-SERVICE", configuration = MySelfRule.class)
public class MainApp80 {

    public static void main(String[] args) {
        ConfigurableApplicationContext run = SpringApplication.run(MainApp80.class);
        log.info("初始化组件一共有：{}", run.getBeanDefinitionCount());
    }
}
