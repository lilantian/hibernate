hibernate
===========================
###### 程序定位
1. 熟悉idea开发工具
2. idea中使用maven创建hibernate项目
3. 学习hibernate的增删改查的简单操作
4. 学习编写规范的的READ.md文件
5. 完成IDEA配合GitHub管理本地代码，实现更新本地代码到GitHub
6. 代码为个人学习使用  

###### 环境依赖
1. JDK 1.8  
2. maven 3.3.9  
3. hibernate 5.3.2  
4. mysql 8.0.11  

###### V1.0.0 版本内容更新
1. 使用hibernate完成数据的插入操作
2. 使用hibernate完成数据的更新操作
3. 使用hibernate完成数据的查询造作
4. 使用hibernate完成数据的删除操作

###### TABLE
```mysql
CREATE TABLE `goods` (
  `sid` int(11) NOT NULL,
  `name` varchar(255) DEFAULT NULL,
  `price` double DEFAULT NULL,
  PRIMARY KEY (`sid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
```


