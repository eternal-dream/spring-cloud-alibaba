package com.eternal.api.userapi.model;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.eternal.api.userapi.model.base.BaseModel;
import io.swagger.annotations.ApiModel;
import lombok.Data;
import lombok.EqualsAndHashCode;


/**
 * @ClassName Admin
 * @Description
 * @Author Innocence
 * @Date 2020/7/11
 * @Version 1.0
 */
@Data
@EqualsAndHashCode(callSuper = true)
@TableName("admin")
@ApiModel(value="Admin对象", description="")
public class Admin extends BaseModel {

    private static final long serialVersionUID=1L;

    @TableField("name")
    private String name;

    @TableField("real_name")
    private String realName;

    @TableField("pass_word")
    private String passWord;

    @TableField("salt")
    private String salt;

    @TableField("locked")
    private Boolean locked;

    /**
     * 头像url
     */
    @TableField("avatar")
    private String avatar;

    @TableField("nick_name")
    private String nickName;

    @TableField("phone")
    private String phone;

    @TableField("remark")
    private String remark;

    @TableField("email")
    private String email;
}
