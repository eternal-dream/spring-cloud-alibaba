package com.eternal.microservices.user.controller;

import com.eternal.api.userapi.model.User;
import com.eternal.api.userapi.interfaces.UserServiceApi;
import io.seata.spring.annotation.GlobalTransactional;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author eternal
 * @Date 2021/5/25
 * @Version 1.0
 */
@RestController
public class UserServiceApiController implements UserServiceApi {

 @Override
 public User userTest() {
  User user = new User();
  user.setPassword("11334");
//  try {
//   Thread.sleep(800);
//  } catch (InterruptedException e) {
//   e.printStackTrace();
//  }
  user.setName("张三");
//  int i=1/0;//测试回滚
  return user;
 }
}