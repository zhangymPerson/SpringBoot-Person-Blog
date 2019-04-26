目前Spring官方已经不推荐使用JSP来开发WEB了，而是推荐使用如下几种模板引擎来开发：

Thymeleaf(Spring官方推荐)
FreeMarker
Velocity
Groovy
Mustache
目前业界使用最广泛的还是FreeMaker和Velocity。 

```xml
<dependency> 
    <groupId>org.springframework.boot</groupId> 
    <artifactId>spring-boot-starter-freemarker</artifactId> 
</dependency>


<dependency>
    <groupId>org.springframework.boot</groupId>
    <artifactId>spring-boot-starter-thymeleaf</artifactId>
</dependency>
```

在src/main/resources下新建一个templates的文件夹（spring boot默认存放模板的路径）； 


- 静态资源位置

Spring Boot 默认将 /** 所有访问映射到以下目录：
classpath:/static
classpath:/public
classpath:/resources
classpath:/META-INF/resources

