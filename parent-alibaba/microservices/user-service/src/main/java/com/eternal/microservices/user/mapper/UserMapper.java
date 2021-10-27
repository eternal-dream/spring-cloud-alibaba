package com.eternal.microservices.user.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.eternal.api.userapi.model.User;
import org.apache.ibatis.annotations.Mapper;

/**
 * @Author eternal
 * @Date 2021/5/25
 * @Version 1.0
 */
@Mapper
public interface UserMapper extends BaseMapper<User> {
}
