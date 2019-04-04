# 配置文件说明
application.properties      默认配置文件
application-dev.properties  开发环境配置
application-test.properties 测试环境配置
application-prod.properties 生产环境配置

- 主配置文件

    application.properties
     
    添加配置
    #后面添加要选择得配置文件
    spring.profiles.active=default
    spring.profiles.active=dev
    spring.profiles.active=test
    spring.profiles.active=prod

