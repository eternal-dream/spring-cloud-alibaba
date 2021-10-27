package com.eternal.common.generator.service.impl;

import com.baomidou.mybatisplus.annotation.DbType;
import com.baomidou.mybatisplus.generator.AutoGenerator;
import com.baomidou.mybatisplus.generator.engine.VelocityTemplateEngine;
import com.eternal.common.generator.constant.GeneratorType;
import com.eternal.common.generator.constant.MyDbType;
import com.eternal.common.generator.service.GeneratorService;
import com.eternal.common.util.yml.YmlReadUtil;

import static com.eternal.common.constants.ConfigConstant.GENERATOR_CONFIG_FILE;

/**
 * @ClassName PostgresqlGenerator
 * @Description postgresql代码生成
 * @Author Innocence
 * @Date 2020/10/28 10:15
 * @Version 1.0
 */
@GeneratorType(dbType = MyDbType.POSTGRESQL)
public class PostgresqlGenerator extends GeneratorService {

    public static String[] superEntityColumns=new String[]{"id","create_time","modify_time"};

    public static final String SCHEMA_NAME = YmlReadUtil.getValueToString(GENERATOR_CONFIG_FILE,"postgresql.schemaName");

    @Override
    public void generator(){
        AutoGenerator mpg = new AutoGenerator();
        /**
         * 全局配置
         */
        mpg.setGlobalConfig(setGlobal());
        /**
         * 数据源配置
         */
        mpg.setDataSource(setDataSource(DbType.POSTGRE_SQL,SCHEMA_NAME));
        /**
         * 策略配置
         */
        mpg.setStrategy(setStrategy(superEntityColumns));
        /**
         * 包配置
         */
        mpg.setPackageInfo(setPackage());
        /**
         *自定义配置
         */
        mpg.setCfg(setInjection());
        /**
         * 模板设置
         */
        mpg.setTemplate(setTemplate());

        mpg.setTemplateEngine(new VelocityTemplateEngine());
        mpg.execute();
    }
}
