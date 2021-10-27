package com.eternal.common.config.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;


/**
 * 操作日志注解处理
 * @author eternal
 * @date 2021/8/2
 */
@Aspect
@Component
public class LogAspect {
    private static final Logger log = LoggerFactory.getLogger(LogAspect.class);


    /**
     * 配置织入点
     * @author Innocence
     * @date 2020/12/30
     */
    @Pointcut("@annotation(com.eternal.common.annotation.Log)")
    public void logPointCut() {
    }

    /**
     * 处理完请求后执行
     * @param joinPoint 切点
     */
    @AfterReturning(pointcut = "logPointCut()")
    public void doAfterReturning(JoinPoint joinPoint) {
        handleLog(joinPoint, null);
    }

    //处理日志的方法(未实现)
    protected void handleLog(final JoinPoint joinPoint, final Exception e) {
        System.out.println("123");
    }

}
