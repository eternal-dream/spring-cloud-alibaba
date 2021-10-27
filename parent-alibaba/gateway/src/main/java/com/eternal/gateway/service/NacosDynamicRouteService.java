package com.eternal.gateway.service;

import org.springframework.cloud.gateway.route.RouteDefinition;
import org.springframework.stereotype.Service;

/**
 * @Author eternal
 * @Date 2021/7/20
 * @Version 1.0
 */
public interface NacosDynamicRouteService {

 /**
  * 更新路由信息
  * @param gatewayDefine
  * @return
  * @throws Exception
  */
 String update(RouteDefinition gatewayDefine);
}