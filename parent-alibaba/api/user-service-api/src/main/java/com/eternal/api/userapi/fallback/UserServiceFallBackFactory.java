package com.eternal.api.userapi.fallback;

import com.eternal.api.userapi.model.User;
import com.eternal.api.userapi.interfaces.UserServiceApi;
import io.seata.core.context.RootContext;
import io.seata.core.exception.TransactionException;
import io.seata.tm.api.GlobalTransactionContext;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

/**
 * 因为此类与服务启动类不在同一个项目，因此报错（No fallback instance）,须将此类添加到autoconfigure配置中
 * @Author eternal
 * @Date 2021/7/20
 * @Version 1.0
 */
@Slf4j
@Component
public class UserServiceFallBackFactory implements UserServiceApi {

 @Override
 public User userTest() {
  User user = new User();
  user.setName("降级");
  //降级时手动回滚事务
  try {
   GlobalTransactionContext.reload(RootContext.getXID()).rollback();
  } catch (TransactionException e) {
   e.printStackTrace();
  }
  return user;
 }
}