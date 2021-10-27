package com.eternal.microservices.mq.controller;

import com.eternal.api.mq.interfaces.MQProducerApi;
import org.apache.rocketmq.client.producer.SendResult;
import org.apache.rocketmq.spring.core.RocketMQTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author eternal
 * @Date 2021/7/22
 * @Version 1.0
 */
@RestController
public class MQProducerController implements MQProducerApi {

 @Autowired
 RocketMQTemplate rocketMQTemplate;

 private String topic="order-test";

 @Override
 public SendResult sendOrderNotice(String order) {

  SendResult sendResult = rocketMQTemplate.syncSend(topic,order);
  return sendResult;
 }
}