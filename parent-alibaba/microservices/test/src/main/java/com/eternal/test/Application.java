package com.eternal.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @Author eternal
 * @Date 2021/7/19
 * @Version 1.0
 */
@SpringBootApplication
@EnableFeignClients(basePackages= {"com.eternal.api.userapi.interfaces"})
@EnableDiscoveryClient
public class Application {
 public static void main(String[] args) {
  SpringApplication.run(Application.class,args);
 }
}