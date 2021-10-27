package com.eternal.test.controller;

import com.eternal.api.userapi.model.Admin;
import com.eternal.api.userapi.model.User;
import com.eternal.api.userapi.interfaces.UserServiceApi;
import com.eternal.api.userapi.service.AdminService;
import com.eternal.common.annotation.Log;
import com.eternal.common.util.yml.YmlReadUtil;
import com.eternal.test.impl.TestService;
import io.seata.spring.annotation.GlobalTransactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author eternal
 * @Date 2021/7/19
 * @Version 1.0
 */
@RestController
public class testController {

 @Autowired
 TestService testService;

 @Value("${spring.profiles.active}")
 private String activeEnv;

 @Autowired
 YmlReadUtil ymlReadUtil;

 @RequestMapping("test")
 @GlobalTransactional
 @Log
 public User userTest(){
  User user =testService.getUser();
  return user;
 }

 @RequestMapping("sendMessage")
 public void sendMessage(String message){
//  DefaultMQProducer producer = MQUtil.getProducer("myTestGroup", MQUtil.NAMESRVADDR);
//  producer.send()

 }

}