package com.eternal.common.generator.factory;

import cn.hutool.core.util.ClassUtil;
import com.eternal.common.generator.constant.GeneratorType;
import com.eternal.common.generator.constant.MyDbType;
import com.eternal.common.generator.service.GeneratorService;

import java.util.Set;

/**
 * @ClassName GeneratorFactory
 * @Description Generator工厂
 * @Author Innocence
 * @Date 2020/10/28 13:30
 * @Version 1.0
 */
public class GeneratorFactory {

    public static final String PACKAGE_NAME = "com.cqvip.generator.service.impl";

    public GeneratorService getGenerator(MyDbType dbType){
        Class<?>[] classes;
        try {
            classes = ClassUtil.getClasses(PACKAGE_NAME);
            for (Class item:classes) {
                GeneratorType annotation = (GeneratorType)item.getAnnotation(GeneratorType.class);
                if (annotation==null){
                    return null;
                }
                MyDbType myDbType = annotation.dbType();
                if (myDbType.getValue().equals(dbType.getValue())){
                    return  (GeneratorService)Class.forName(item.getName()).newInstance();
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
