package com.eternal.common.constants;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @Author eternal
 * @Date 2021/8/2
 * @Version 1.0
 */
@Component
public final class ConfigConstant {

 /**
  * yml配置文件名
  * @author Innocence
  * @date 2020/9/22
  * @param
  * @return
  */
 public static String YML_FILE_NAME;

 /**
  * 代码生成器配置文件
  * @author Innocence
  * @date 2020/10/28
  */
 public static final String GENERATOR_CONFIG_FILE = "generator.yml";

 /**
  * shiro配置文件
  * @author Innocence
  * @date 2020/12/25
  */
 public static final String SHIRO_CONFIG_FILE = "shiro.yml";

 @Value("${env}")
 public void setYMLFILENAME(String env){
  YML_FILE_NAME="application-"+env+".yml";
 }
}
