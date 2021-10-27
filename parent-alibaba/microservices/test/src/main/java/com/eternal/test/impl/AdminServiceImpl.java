package com.eternal.test.impl;


import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.eternal.api.userapi.model.Admin;
import com.eternal.api.userapi.service.AdminService;
import com.eternal.test.mapper.AdminMapper;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @ClassName AdminServiceImplements
 * @Description
 * @Author Innocence
 * @Date 2020/7/11
 * @Version 1.0
 */
@Service
@Transactional(rollbackFor=Exception.class)
public class AdminServiceImpl extends ServiceImpl<AdminMapper, Admin> implements AdminService {

}
