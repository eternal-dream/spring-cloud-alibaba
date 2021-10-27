package com.eternal.api.userapi.model.base;

import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import lombok.Data;

import java.io.Serializable;
import java.lang.reflect.Field;
import java.util.Date;

/**
 * @ClassName BaseModel
 * @Description 实体类公共字段
 *              1、注意字段名与数据库字段的对应，建议数据库采取java驼峰命名规则，尽量保持一致
 *              2、若使用下划线命名，需要在配置文件中开启db-column-underline: (false or true)(默认为true)
 *              3、当实体字段与数据库列名不对应，并且既定的规范（驼峰，下划线）不能满足映射关系时，使用@TableField(value="数据库列名")指定对应
 *              4、当前数据库采用下划线命名，开启了转化配置，所以不需要@TableFile指定映射关系
 *              5、为了后期构造sql条件方便性，当前类添加了@TableFile，同时，生成的实体类会自动加上该注解。
 * @Author Innocence
 * @Date 2020/7/11
 * @Version 1.0
 */
@Data
public abstract class BaseModel extends Model {

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
