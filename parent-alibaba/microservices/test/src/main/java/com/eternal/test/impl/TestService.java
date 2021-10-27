package com.eternal.test.impl;

import com.eternal.api.userapi.interfaces.UserServiceApi;
import com.eternal.api.userapi.model.Admin;
import com.eternal.api.userapi.model.User;
import com.eternal.api.userapi.service.AdminService;
import io.seata.spring.annotation.GlobalTransactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author eternal
 * @Date 2021/7/30
 * @Version 1.0
 */
@Service
public class TestService {

 @Autowired
 private UserServiceApi userServiceApi;

 @Autowired
 private AdminService adminService;

 @GlobalTransactional
 public User getUser() {
  Admin admin = new Admin();
  admin.setName("尼古拉斯张三");
  admin.setPassWord("123");
  admin.setLocked(false);
  admin.setSalt("123");
  admin.setPhone("15341241247");
  admin.setRealName("张三");
  adminService.save(admin);
  User user = userServiceApi.userTest();
  return user;
 }
}