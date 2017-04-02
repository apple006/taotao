 ### 模仿网上一个商城项目

 #### 1.整合Spring+Mybatis框架（3月27日）

 遇到的问题以及注意点：

  - 注意aspectjweaver包的导入
    - spring AOP就是用aspectj来实现的，是依赖关系！AspectJ是动态代理的一种实现！而spring默认使用的就是AspectJ来实搜索现的动态代理，spring自己的AOP就是使用AspectJ来实现的！当然你也可以使用其他的实现，如cglib!
------
 #### 2.整合Spring+Mybatis+SpringMVC框架（3月31日）

 遇到的问题以及注意点：

  - 注意SpringMVC配置文件的配置
    ```xml
    <bean id="multipartResolver"
		class="org.springframework.web.multipart.commons.CommonsMultipartResolver">
		<property name="defaultEncoding">
			<value>UTF-8</value>
		</property>
		<property name="maxUploadSize">
			<value>32505856</value>上传文件大小限制为31M，31*1024*1024
		</property>
		<property name="maxInMemorySize">
			<value>4096</value>
		</property>
	</bean>
  ```

-  其中需要加入的依赖是：

  ```xml
  <dependency>
			<groupId>commons-fileupload</groupId>
			<artifactId>commons-fileupload</artifactId>
			<version>1.3.2</version>
</dependency>
<dependency>
			<groupId>commons-io</groupId>
			<artifactId>commons-io</artifactId>
			<version>2.4</version>
</dependency>
  ```

  ```xml
  <bean id="mappingJacksonHttpMessageConverter"
		class="org.springframework.http.converter.json.MappingJackson2HttpMessageConverter">
		<property name="supportedMediaTypes">
			<list>
				<value>text/html;charset=UTF-8</value>
			</list>
		</property>
	</bean>
  ```

  org.springframework.http.converter.json.MappingJacksonHttpMessageConverter找不到的错误,需要导入:
  ```xml
  <dependency>
			<groupId>com.fasterxml.jackson.core</groupId>
			<artifactId>jackson-core</artifactId>
			<version>2.9.0.pr2</version>
		</dependency>
		<dependency>
			<groupId>com.fasterxml.jackson.core</groupId>
			<artifactId>jackson-databind</artifactId>
			<version>2.9.0.pr2</version>
		</dependency>
		<dependency>
			<groupId>com.fasterxml.jackson.core</groupId>
			<artifactId>jackson-annotations</artifactId>
			<version>2.9.0.pr2</version>
		</dependency>
		<dependency>
			<groupId>org.codehaus.jackson</groupId>
			<artifactId>jackson-mapper-asl</artifactId>
			<version>1.9.13</version>
		</dependency>
  ```
**<font color=red>还有需要注意的是版本有变化，应将配置文件中的**

```xml
org.springframework.http.converter.json.MappingJacksonHttpMessageConverter
```
修改为：
```xml
class="org.springframework.http.converter.json.MappingJackson2HttpMessageConverter"
```

-------

#### 3.初步实现列表的显示（分页的使用）（4月2日）

在这过程中出现了一个错误，让我郁闷了一会，感觉这是一个非常容易忘记的点，希望自己以后能够注意！

错误：No mapping found for HTTP request with URI [/taotao/userController/showUser.do] in DispatcherServlet

**<font color=red>错误原因：没有在SpringMVC的配置文件中添加<mvc:annotation-driven />**

```xml
<!-- 自动扫描controller包下的所有类，使其认为spring mvc的控制器 -->
	<context:component-scan base-package="com.taotao.controller" />
	<mvc:annotation-driven />
```
具体原因可以参考博客
- [使用@Controller注解为什么要配置<mvc:annotation-driven />](http://blog.csdn.net/jbgtwang/article/details/7359592)

- [mvc:annotation-driven>与context:annotation-config](http://www.cnblogs.com/dreamroute/p/4493346.html)

在这个过程中我也了解到了关于POJO对象的一些知识：

- [springmvc学习笔记（7）——传递对象作为参数（POJO）](http://blog.csdn.net/u010837612/article/details/45199919)

- [POJO式开发](http://blog.csdn.net/gaoqian19820731/article/details/6256544)

<font color=red>同时在这过程中使用了PageHelper插件进行分页操作！

- [Mybatis-PageHelper](https://github.com/pagehelper/Mybatis-PageHelper)

- [【MyBatis】MyBatis分页插件PageHelper的使用](http://blog.csdn.net/eson_15/article/details/52270046)
