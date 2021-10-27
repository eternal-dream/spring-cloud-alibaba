package com.eternal.gateway.filter;

import org.springframework.cloud.gateway.filter.GatewayFilterChain;
import org.springframework.cloud.gateway.filter.GlobalFilter;
import org.springframework.core.Ordered;
import org.springframework.stereotype.Component;
import org.springframework.web.server.ServerWebExchange;
import reactor.core.publisher.Mono;

/**
 * 鉴权过滤器
 * @Author eternal
 * @Date 2021/7/20
 * @Version 1.0
 */
@Component
public class GlobalAuthFilter implements GlobalFilter, Ordered {
 @Override
 public Mono<Void> filter(ServerWebExchange exchange, GatewayFilterChain chain) {

  if(!"鉴权成功".isEmpty()){
   return chain.filter(exchange);
  }else{
   return exchange.getResponse().setComplete();
  }
 }

 @Override
 public int getOrder() {
  return 0;
 }
}