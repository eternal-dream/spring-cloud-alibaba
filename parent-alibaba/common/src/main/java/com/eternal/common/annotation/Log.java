package com.eternal.common.annotation;

import com.eternal.common.enums.BusinessType;

import java.lang.annotation.*;

/**
 * 自定义操作日志记录注解
 * @author
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface Log {
 /**
  * 操作标题描述
  */
 String title() default "";

 /**
  * 功能
  */
 BusinessType businessType() default BusinessType.OTHER;

 /**
  * 是否保存请求的参数
  */
 boolean isSaveRequestData() default false;

 /**
  * 是否保存返回的结果
  */
 boolean isSaveResponseData() default true;
}