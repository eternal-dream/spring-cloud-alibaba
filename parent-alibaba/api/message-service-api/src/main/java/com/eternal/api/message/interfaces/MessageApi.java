package com.eternal.api.message.interfaces;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Author eternal
 * @Date 2021/7/22
 * @Version 1.0
 */
@FeignClient("message-service")
public interface MessageApi {

 @RequestMapping("/message/sendMessage")
 void sendMessage(String message);

}