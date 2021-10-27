package com.eternal.microservices.user.service;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.eternal.api.userapi.model.User;
import com.eternal.microservices.user.mapper.UserMapper;
import org.springframework.stereotype.Service;

/**
 * @Author eternal
 * @Date 2021/5/25
 * @Version 1.0
 */
@Service
public class UserService extends ServiceImpl<UserMapper, User> {

}