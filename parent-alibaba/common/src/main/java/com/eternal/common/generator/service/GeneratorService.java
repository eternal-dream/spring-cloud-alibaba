package com.eternal.common.generator.service;

import cn.hutool.core.util.StrUtil;
import com.baomidou.mybatisplus.annotation.DbType;
import com.baomidou.mybatisplus.core.exceptions.MybatisPlusException;
import com.baomidou.mybatisplus.core.toolkit.StringPool;
import com.baomidou.mybatisplus.generator.InjectionConfig;
import com.baomidou.mybatisplus.generator.config.*;
import com.baomidou.mybatisplus.generator.config.po.TableInfo;
import com.baomidou.mybatisplus.generator.config.rules.DateType;
import com.baomidou.mybatisplus.generator.config.rules.NamingStrategy;
import com.eternal.common.constants.ConfigConstant;
import com.eternal.common.entity.BaseModel;
import com.eternal.common.util.yml.YmlReadUtil;
import org.apache.commons.lang3.StringUtils;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


/**
 * 代码生成器工厂抽象类
 * @author Innocence
 * @date 2020/10/28
 */
public abstract class GeneratorService {

    public static final String URL = YmlReadUtil.getValueToString(ConfigConstant.YML_FILE_NAME,"spring.datasource.url");
    public static final String DRIVER_NAME = YmlReadUtil.getValueToString(ConfigConstant.YML_FILE_NAME,"spring.datasource.driver-class-name");
    public static final String USER_NAME =  YmlReadUtil.getValueToString(ConfigConstant.YML_FILE_NAME,"spring.datasource.username");
    public static final String PASS_WORD =  YmlReadUtil.getValueToString(ConfigConstant.YML_FILE_NAME,"spring.datasource.password");

    /**
     * 一些公共配置信息
     * @author Innocence
     * @date 2020/10/28
     */
    public static final String AUTHOR = YmlReadUtil.getValueToString(ConfigConstant.GENERATOR_CONFIG_FILE,"public.author");
    public static final String SERVICE_NAME = YmlReadUtil.getValueToString(ConfigConstant.GENERATOR_CONFIG_FILE,"public.serviceName");
    public static final String MODULE_NAME = YmlReadUtil.getValueToString(ConfigConstant.GENERATOR_CONFIG_FILE,"public.moduleName");
    public static final String PARENT = YmlReadUtil.getValueToString(ConfigConstant.GENERATOR_CONFIG_FILE,"public.parent");
    public static final String ENTITY = YmlReadUtil.getValueToString(ConfigConstant.GENERATOR_CONFIG_FILE,"public.entity");
    public static final String TEMPLATE_PATH = YmlReadUtil.getValueToString(ConfigConstant.GENERATOR_CONFIG_FILE,"public.templatePath");

    public static final String PROJECT_PATH = System.getProperty("user.dir");
    /**
     * 读取控制台内容
     * @param tip
     * @return
     */
    protected String scanner(String tip){
        Scanner scanner = new Scanner(System.in);
        StringBuilder help = new StringBuilder();
        help.append("请输入" + tip + "：");
        System.out.println(help.toString());
        if (scanner.hasNext()) {
            String ipt = scanner.next();
            if (StringUtils.isNotEmpty(ipt)) {
                return ipt;
            }
        }
        throw new MybatisPlusException("请输入正确的" + tip + "！");
    }

    /**
     * 全局配置
     * @author Innocence
     * @date 2021/1/4
     * @return com.baomidou.mybatisplus.generator.config.GlobalConfig
     */
    protected GlobalConfig setGlobal(){
        GlobalConfig gc = new GlobalConfig();
        gc.setOutputDir(PROJECT_PATH + "/src/main/java");
        gc.setAuthor(AUTHOR);
        gc.setServiceName(SERVICE_NAME);
        //开启Swagger2注解
        gc.setSwagger2(true);
        //关闭activeRecord模式
        gc.setActiveRecord(false);
        // XML 二级缓存(二级缓存不建议使用，不同的namespace操作同一个model时会出现脏读)
        gc.setEnableCache(false);
        // XML ResultMap
        gc.setBaseResultMap(false);
        gc.setDateType(DateType.ONLY_DATE);
        return gc;
    }

    /**
     * 全局数据配置
     * @author Innocence
     * @date 2021/1/4
     * @return com.baomidou.mybatisplus.generator.config.DataSourceConfig
     */
    protected DataSourceConfig setDataSource(DbType dbType, String schemaName){
        DataSourceConfig dsc = new DataSourceConfig();
        if (StrUtil.isNotBlank(schemaName)){
            dsc.setSchemaName(schemaName);
        }
        dsc.setDbType(dbType);
        dsc.setUrl(URL);
        dsc.setDriverName(DRIVER_NAME);
        dsc.setUsername(USER_NAME);
        dsc.setPassword(PASS_WORD);
        return dsc;
    }

    /**
     * 全局策略配置
     * @author Innocence
     * @date 2021/1/4
     * @return com.baomidou.mybatisplus.generator.config.StrategyConfig
     */
    protected StrategyConfig setStrategy(String[] superEntityColumns){
        StrategyConfig strategy = new StrategyConfig();
        // 表名生成策略
        strategy.setNaming(NamingStrategy.underline_to_camel);
        // 允许字段策略独立设置，默认为 naming 策略
        strategy.setColumnNaming(NamingStrategy.underline_to_camel);
        strategy.setEntityTableFieldAnnotationEnable(true);
        //自定义实体父类
        strategy.setSuperEntityClass(BaseModel.class);
//        strategy.setSuperControllerClass(AbstractController.class);
        //lombok
        strategy.setEntityLombokModel(true);
        //REST风格
        strategy.setRestControllerStyle(true);
        //写在父类中的公共字段
        //todo 这里写的是数据库的字段，不是实体类的字段
        strategy.setSuperEntityColumns(superEntityColumns);
        strategy.setInclude(scanner("表名，多个英文逗号分割").split(","));
        return strategy;
    }

    /**
     * 全局包配置
     * @author Innocence
     * @date 2021/1/4
     * @return com.baomidou.mybatisplus.generator.config.PackageConfig
     */
    protected PackageConfig setPackage(){
        PackageConfig pc = new PackageConfig();
        //模块名
        pc.setModuleName(MODULE_NAME);
        //包名
        pc.setParent(PARENT);
        pc.setEntity(ENTITY);
        return pc;
    }

    /**
     * 全局自定义配置
     * @author Innocence
     * @date 2021/1/4
     * @return com.baomidou.mybatisplus.generator.InjectionConfig
     * 如果模板引擎是 freemarker
     * String templatePath = "/templates/mapper.xml.ftl";
     * 如果模板引擎是 velocity
     * String templatePath = "/templates/mapper.xml.vm";
     */
    protected InjectionConfig setInjection(){
        InjectionConfig cfg = new InjectionConfig() {
            @Override
            public void initMap() {
                // to do nothing
            }
        };
        // 自定义输出配置
        List<FileOutConfig> focList = new ArrayList<>();
        // 自定义配置会被优先输出
        focList.add(new FileOutConfig(TEMPLATE_PATH) {
            @Override
            public String outputFile(TableInfo tableInfo) {
                // 自定义输出文件名 ， 如果你 Entity 设置了前后缀、此处注意 xml 的名称会跟着发生变化！！
                return PROJECT_PATH + "/src/main/resources/mybatis-plus/mapper/"
                        + tableInfo.getEntityName() + "Mapper" + StringPool.DOT_XML;
            }
        });
        cfg.setFileOutConfigList(focList);
        return cfg;
    }

    /**
     * 全局模板配置
     * @author Innocence
     * @date 2021/1/4
     * @return com.baomidou.mybatisplus.generator.config.TemplateConfig
     */
    protected TemplateConfig setTemplate(){
        TemplateConfig templateConfig = new TemplateConfig();
        //这里不设置为null，会在src/main/java/mapper下面生成xml文件夹和对应的mapper文件
        templateConfig.setXml(null);
        return templateConfig;
    }
    /**
     * 代码生成器主要方法，子类根据不同的数据库实现该方法
     * @author Innocence
     * @date 2020/10/28
     */
    public abstract void generator();
}
