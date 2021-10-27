package com.eternal.microservices.mq;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @Author eternal
 * @Date 2021/7/22
 * @Version 1.0
 */
@SpringBootApplication
@EnableFeignClients(basePackages= {"com.eternal.api.mq.interfaces"})
@EnableDiscoveryClient
public class MQApplication {
 public static void main(String[] args) {
  SpringApplication.run(MQApplication.class,args);
 }
}