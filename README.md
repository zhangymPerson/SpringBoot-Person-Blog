# SpringBoot-Person-Blog
Person-Blog

- druid数据源

    引入安全框架需要放行/durid的路由
    
    com.danao.config.WebSecurityConfig类
    
    http://127.0.0.1:8080/druid/datasource.html
    
    页面没有内容(*) property for user to setup
    
    com.danao.config.DruidConfig中添加注解
    
    你持久层如果使用的是Jpa，在druidDataSource方法上添加@Bean("duridDatasource")；
    
    你持久层使用的是mybatis，在druidDataSource方法上添加@Bean(destroyMethod = "close", initMethod = "init")； 



- mybatis

    的逆向工程生成的mapper会生成多余的result,需要去掉mapper.xml中的部分多余配置

- 引入权限控制框架
    ```xml
    <!--用户权限管理-->
    <dependency>
        <groupId>org.springframework.boot</groupId>
        <artifactId>spring-boot-starter-security</artifactId>
    </dependency>
    ```
 - 打开web页面需要登陆
 
    默认用户名:user
    
    默认密码:查看启动日志
    
- springboot 整合redis

    添加maven包 然后编写config文件 注意：序列化方式不同
    
- springboot 整合日志

    - 方式一 创建logger
    ```java
    private Logger logger = LoggerFactory.getLogger(当前类名.class);
    ```
    - 方式二
    
    使用注解@Slf4j
    
    需要添加jar包
    ```xml
    <!--使用日志注解-->
    <dependency>
        <groupId>org.projectlombok</groupId>
        <artifactId>lombok</artifactId>
    </dependency>
    ```
   
