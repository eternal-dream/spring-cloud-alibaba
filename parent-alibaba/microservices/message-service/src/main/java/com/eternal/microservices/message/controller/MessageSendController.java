package com.eternal.microservices.message.controller;

import com.eternal.api.message.interfaces.MessageApi;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author eternal
 * @Date 2021/7/22
 * @Version 1.0
 */
@RestController
public class MessageSendController implements MessageApi {
 @Override
 public void sendMessage(String message) {
  //To do发送消息的逻辑
 }
}