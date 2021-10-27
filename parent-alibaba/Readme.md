#eternal SpringCloud Alibaba v1.0.0 (2021.08.2)
**本项目是基于SpringCloud Alibaba 搭建的微服务基础框架，不含任何业务代码**

#一、技术栈：
####
    1、注册中心/配置中心：nacos
    2、高可用流量防护组件：sentinel
    3、网关：SpringCloud Gateway
    4、链路追踪：Sleuth+ZipKin
    5、消息队列：RocketMQ
    6、分布式事务：seata
    7、服务调用：feign+ribbon
#二、项目结构
####
    ├─api                                   接口项目
    └─common                                通用工具项目(公用util/枚举等)
    └─gateway                               网关
    └─microservices                         微服务实现 
    └─sql                                   基础sql文件
#三、注意事项
####
    1、nacos/sentinel/zipkin/RocketMQ/seata 需要下载相应的软件
    2、seata1.0版本之后不包含创建undo_log等表的sql,可以在git上的seata项目里用0.9.0版本的sql,
       但只有mysql的sql文件,如果数据库不同,需自行修改
    3、user-service-api 和user-service等测试项目，需删除
    4、api接口项目的fallback类因为没有在实现项目里，因此无法注入，需在spring.factories里面添加相应类路径
    5、还没想到，想到再加
