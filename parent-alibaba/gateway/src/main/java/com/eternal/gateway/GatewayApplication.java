package com.eternal.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @Author eternal
 * @Date 2021/7/20
 * @Version 1.0
 */
@SpringBootApplication
@EnableDiscoveryClient
public class GatewayApplication {
 public static void main(String[] args) {
  SpringApplication.run(GatewayApplication.class,args);
 }
}