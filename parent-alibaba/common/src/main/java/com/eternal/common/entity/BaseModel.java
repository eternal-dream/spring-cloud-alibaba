package com.eternal.common.entity;

import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import lombok.Data;

import java.io.Serializable;
import java.lang.reflect.Field;
import java.util.Date;

/**
 * @Author eternal
 * @Date 2021/8/2
 * @Version 1.0
 */
@Data
public class BaseModel extends Model {


 private static final long serialVersionUID = -7479388678300081113L;

 @TableField("id")
 protected Long id;

 @TableField(value = "create_time",fill = FieldFill.INSERT)
 protected Date createTime;

 @TableField(value = "modify_time",fill = FieldFill.INSERT_UPDATE)
 protected Date modifyTime;

 @TableField(exist = false)
 protected Long pageSize;

 @TableField(exist = false)
 protected Long pageNum;

 @Override
 protected Serializable pkVal() {
  return super.pkVal();
 }

 /**
  * 获取数据库映射的实体上TableField的值:
  *  首先获取本类的，如果没有获取到，会往父类寻找，如果子类父类都没有，则抛出反射异常
  * @author Innocence
  * @date 2020/8/17
  * @param name 需要获取的TableField值的属性
  * @return java.lang.String
  */
 public String getFieldValue(String name){
  Field field = null;
  try {
   field = this.getClass().getDeclaredField(name);
  } catch (NoSuchFieldException e) {
   try {
    field = this.getClass().getSuperclass().getDeclaredField(name);
   } catch (NoSuchFieldException ex) {
    ex.printStackTrace();
   }
  }
  TableField annotation = field.getAnnotation(TableField.class);
  if (annotation == null){
   return null;
  }else{
   return annotation.value();
  }
 }

}