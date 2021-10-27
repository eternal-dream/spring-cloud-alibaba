package com.eternal.api.mq.interfaces;

import org.apache.rocketmq.client.producer.SendResult;
import org.apache.rocketmq.spring.core.RocketMQTemplate;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Author eternal
 * @Date 2021/7/22
 * @Version 1.0
 */
@FeignClient(value = "MQ-service")
public interface MQProducerApi {

 /**
  * 发送下单成功的通知消息
  * @param order
  * @return
  */
 @RequestMapping("/sendOrderNotice")
 public SendResult sendOrderNotice(String order);
}