package com.eternal.api.userapi.interfaces;

import com.eternal.api.userapi.fallback.UserServiceFallBackFactory;
import com.eternal.api.userapi.model.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Author eternal
 * @Date 2021/7/22
 * @Version 1.0
 */
@FeignClient(value = "user-service",fallback = UserServiceFallBackFactory.class)
public interface UserServiceApi {

 @RequestMapping("/userTest")
 User userTest();
}