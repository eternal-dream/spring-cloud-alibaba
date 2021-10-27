package com.eternal.common.generator.service.impl;

import com.baomidou.mybatisplus.annotation.DbType;
import com.baomidou.mybatisplus.generator.AutoGenerator;
import com.baomidou.mybatisplus.generator.engine.VelocityTemplateEngine;
import com.eternal.common.generator.constant.GeneratorType;
import com.eternal.common.generator.constant.MyDbType;
import com.eternal.common.generator.service.GeneratorService;

/**
 * @ClassName MysqlGenerator
 * @Description mysql代码生成
 * @Author Innocence
 * @Date 2021/1/6 9:56
 * @Version 1.0
 */
@GeneratorType(dbType = MyDbType.MYSQL)
public class MysqlGenerator extends GeneratorService {

    public static String[] superEntityColumns=new String[]{"id","create_time","modify_time"};

    @Override
    public void generator() {
        AutoGenerator mpg = new AutoGenerator();
        mpg.setGlobalConfig(setGlobal());
        mpg.setDataSource(setDataSource(DbType.MYSQL,null));
        mpg.setStrategy(setStrategy(superEntityColumns));
        mpg.setPackageInfo(setPackage());
        mpg.setCfg(setInjection());
        mpg.setTemplate(setTemplate());
        mpg.setTemplateEngine(new VelocityTemplateEngine());
        mpg.execute();
    }
}
