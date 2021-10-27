package com.eternal.common.generator.constant;

/**
 * @ClassName DbType
 * @Description 常用数据库
 * @Author Innocence
 * @Date 2020/10/28 10:55
 * @Version 1.0
 */

public enum MyDbType {

    POSTGRESQL("POSTGRESQL"),

    MYSQL("MYSQL"),

    KINGBASE("KINGBASE");


    private String value;

    MyDbType(String value){
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
