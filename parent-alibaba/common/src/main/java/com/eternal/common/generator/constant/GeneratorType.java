package com.eternal.common.generator.constant;

import java.lang.annotation.*;

/**
 * @ClassName GenaratorType
 * @Description TODO
 * @Author Innocence
 * @Date 2021/1/6 14:28
 * @Version 1.0
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface GeneratorType {

    MyDbType dbType();
}
