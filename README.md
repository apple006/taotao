 ### 模仿网上一个商城项目
 
 #### 1.整合Spring+Mybatis框架（3月27日）
 
 遇到的问题以及注意点：
 
  - 注意aspectjweaver包的导入
    - spring AOP就是用aspectj来实现的，是依赖关系！AspectJ是动态代理的一种实现！而spring默认使用的就是AspectJ来实搜索现的动态代理，spring自己的AOP就是使用AspectJ来实现的！当然你也可以使用其他的实现，如cglib!
 
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
