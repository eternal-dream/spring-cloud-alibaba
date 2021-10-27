package com.eternal.microservices.message.listener;

import org.apache.rocketmq.spring.annotation.RocketMQMessageListener;
import org.apache.rocketmq.spring.core.RocketMQListener;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;

/**
 * @Author eternal
 * @Date 2021/7/22
 * @Version 1.0
 */
@Component
@RocketMQMessageListener(consumerGroup = "test-mq",topic = "order-test")
public class OnMessageListener implements RocketMQListener<String> {

 public static String name="test";
 @Override
 public void onMessage(String message) {
  System.out.println("接收到消息："+message);
 }

 public static void main(String[] args) {
  BigDecimal a = new BigDecimal("1922456414567893372036854775807");
  Object b =(Object)a;
  System.out.println(b instanceof BigDecimal);
 }
}