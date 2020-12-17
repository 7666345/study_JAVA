# JAVA-WEB开发

##  一、 概述

### 1. 

静态web

动态web



### 2. Tomcat

#### 2.1 Tomcat安装

https://tomcat.apache.org/

![image-20201214183529640](C:\Users\h\Desktop\java\studyJAVA\笔记\img\image-20201214183529640.png)



#### 2.2 加压缩后直接使用，无需安装。

![image-20201214183815735](C:\Users\h\Desktop\java\studyJAVA\笔记\img\image-20201214183815735.png)

需要添加系统环境变量：

 1. 在'系统变量'中, 新建TOMCAT_HOME, 若已存在则点击编辑。变量值为 **解压的路径**

 2. #### 在'系统变量'中, 新建CATALINA_HOME, 若已存在则点击编辑.变量值为 解压的路径

 3. #### 在PATH中添加 %CATALINA_HOME%\bin

    

#### 2.3 启动、关闭Tomcat

![image-20201214183900070](C:\Users\h\Desktop\java\studyJAVA\笔记\img\image-20201214183900070.png)



启动测试： localhost:8080------Tomcat默认监听8080端口



![image-20201214184054101](C:\Users\h\Desktop\java\studyJAVA\笔记\img\image-20201214184054101.png)





#### 2.4 Tomcat配置

![image-20201214184244639](C:\Users\h\Desktop\java\studyJAVA\笔记\img\image-20201214184244639.png)

修改端口号：默认8080

![image-20201214185049157](C:\Users\h\Desktop\java\studyJAVA\笔记\img\image-20201214185049157.png)

修改主机名称： 默认localhost

![image-20201214204302202](C:\Users\h\Desktop\java\studyJAVA\笔记\img\image-20201214204302202.png)



#### 2.5 发布web项目

![image-20201214205732571](C:\Users\h\AppData\Roaming\Typora\typora-user-images\image-20201214205732571.png)

### 3 http

#### 3.1 http请求

![image-20201215110331878](C:\Users\h\Desktop\java\studyJAVA\笔记\img\image-20201215110331878.png)

![image-20201215110549336](C:\Users\h\Desktop\java\studyJAVA\笔记\img\image-20201215110549336.png)

![image-20201215110608806](C:\Users\h\Desktop\java\studyJAVA\笔记\img\image-20201215110608806.png)

#### 3.2 http响应

响应状态码：

200 ---请求响应成功

3** ---请求重定向相关

4** ---找不到资源

5** ---服务器相关错误



### 4. Maven

maven.apache.org官网下载解压后，即可使用。

![image-20201215141518880](C:\Users\h\Desktop\java\studyJAVA\笔记\img\image-20201215141518880.png)

#### 4.1 配置Maven

需要在系统环境变量中增加：

1. M2_HOME-------值是maven目录下的bin目录

2. MAVEN_HOME-----值是maven目录

3. 系统path变量中配置------值： %MAVEN_HOME%\bin

   

   ![image-20201215154056558](C:\Users\h\Desktop\java\studyJAVA\笔记\img\image-20201215154056558.png)

   ![image-20201215154131031](C:\Users\h\Desktop\java\studyJAVA\笔记\img\image-20201215154131031.png)

   

   

   

   配置完成后可以cmd输入 mvn -version 命令验证是否配置成功。

   ![image-20201215154206447](C:\Users\h\Desktop\java\studyJAVA\笔记\img\image-20201215154206447.png)



#### 4.2 配置阿里云镜像

​	默认使用国外服务器地址，配置阿里云镜像可以加速在国内使用的下载速度。

​    conf/settings.xml中找到并修改<mirrors>里面的子项

``` java
<mirror>
	<id>nexus-aliyun</id>
	<mirrorOf>central</mirrorOf>
	<name>Nexus aliyun</name>
	<url>http://maven.aliyun.com/nexus/content/groups/public</url> 
</mirror>
```

![image-20201215155320565](C:\Users\h\Desktop\java\studyJAVA\笔记\img\image-20201215155320565.png)

#### 4.3 配置本地仓库

 1. maven根目录下新建文件夹，maven_repo

 2. conf/settings.xml中找到<localRepository>，路径修改为刚才新建文件夹的路径

    ![image-20201215173538146](C:\Users\h\Desktop\java\studyJAVA\笔记\img\image-20201215173538146.png)

    

#### 4.4 在IDEA中使用Maven

1. 启动IDEA

2. 创建 Maven项目

   ![image-20201215180304643](C:\Users\h\Desktop\java\studyJAVA\笔记\img\image-20201215180304643.png)

   3. 设置Maven项目的GVA（组名、项目名等）

      ![image-20201215180918058](C:\Users\h\AppData\Roaming\Typora\typora-user-images\image-20201215180918058.png)

   4. ![image-20201215180626883](C:\Users\h\AppData\Roaming\Typora\typora-user-images\image-20201215180626883.png)

   5. 下一步，finish

   6. 等待IDEA构建完成

      ![image-20201215182124452](C:\Users\h\Desktop\java\studyJAVA\笔记\img\image-20201215182124452.png)

      

      7. 在IDEA中设置maven

         ![image-20201215183855173](C:\Users\h\Desktop\java\studyJAVA\笔记\img\image-20201215183855173.png)

      8.  IDEA目录 src-->main下，新建 java目录和resources目录，并标记功能。（文件夹右键弹出菜单）

         ![image-20201215184809939](C:\Users\h\AppData\Roaming\Typora\typora-user-images\image-20201215184809939.png)
         
         
         
#### 4.5 IDEA中配置tomcat

![image-20201216114919099](C:\Users\h\Desktop\java\studyJAVA\笔记\img\image-20201216114919099.png)

​		取消解决警告问题：

​		因为需要给网站手动配置一个名字

![image-20201216115232175](C:\Users\h\Desktop\java\studyJAVA\笔记\img\image-20201216115232175.png)

![image-20201216115446010](C:\Users\h\Desktop\java\studyJAVA\笔记\img\image-20201216115446010.png)

![image-20201216115602658](C:\Users\h\Desktop\java\studyJAVA\笔记\img\image-20201216115602658.png)

![image-20201216115727640](C:\Users\h\Desktop\java\studyJAVA\笔记\img\image-20201216115727640.png)

#### 4.6 Maven工具栏

![image-20201216120031338](C:\Users\h\Desktop\java\studyJAVA\笔记\img\image-20201216120031338.png)

### 5. Servlet

#### 5.0 准备

 	1. 新建一个空白（不用模板的）maven工程，作为主工程。
 	2. 删掉主工程的src目录
 	3. 以后学习一个小项，就在主工程中新建一个moudle。

	#### 5.1 Hello Servlet

 1. 在5.0新建的主工程中， 新建module--->maven--->选择webapp模板--->子工程命名。

 2. 在子工程的 src/main目录下，新建 java和resouces目录。

 3. 在新建的java目录下新建一个继承了 HttpServlet的类，并重写 doGet、doPost方法

    ``` java
    
    package com.twxiao.servlet;
    
    import javax.servlet.ServletException;
    import javax.servlet.http.HttpServlet;
    import javax.servlet.http.HttpServletRequest;
    import javax.servlet.http.HttpServletResponse;
    import java.awt.print.Printable;
    import java.io.IOException;
    import java.io.PrintWriter;
    
    public class HelloServlet extends HttpServlet {
    
        //get/post只是请求方式不同，内部业务逻辑相同。所以可以相互的调用。
    
        @Override
        protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
            PrintWriter writer=resp.getWriter(); //响应刘
            writer.write("Hello，Servlet！");//向浏览器返回一个字符串。
        }
    
        @Override
        protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
            doGet(req, resp);
        }
    }
    
    ```

6. 在web.xml中配置 Servlet类的映射

     Servlet是java程序，如果需要通过浏览器访问，就需要在web服务中映射Servlet的地址，给浏览器提供一个可以访问的路径。

   ``` xml
   <!-- 注册Servlet -->
     <servlet>
   <!-- 给Servlet起个名字，需要和下面mapping中的名字一致-->
       <servlet-name>hello</servlet-name>
   <!-- 名字和Servlet类绑定-->
       <servlet-class>com.twxiao.servlet.HelloServlet</servlet-class>
     </servlet>
   
     <servlet-mapping>
       <servlet-name>hello</servlet-name>
   <!--    在浏览器中的访问路径-->
       <url-pattern>/hello</url-pattern>
     </servlet-mapping>
   ```

7. 配置好tomcat

8. 启动测试

#### 5.2 Servlet 原理

![image-20201217143111184](C:\Users\h\Desktop\java\studyJAVA\笔记\img\image-20201217143111184.png)

#### 5.3 mapping映射问题

1. ​	一对一映射

   浏览器中输入服务器路径 + /hello  时，可以访问到servle所对应的Servlet类

   ``` xml
   <!-- 注册Servlet -->
     <servlet>
       <servlet-name>hello</servlet-name>
       <servlet-class>com.twxiao.servlet.HelloServlet</servlet-class>
     </servlet>
   
     <servlet-mapping>
       <servlet-name>hello</servlet-name>
       <url-pattern>/hello</url-pattern>
     </servlet-mapping>
   ```

   

   2. 一对多映射

      浏览器中输入服务器路径 + /hello2  hello3  时，都可以访问到servle所对应的Servlet类

      ``` 
      <!-- 注册Servlet -->
        <servlet>
          <servlet-name>hello</servlet-name>
          <servlet-class>com.twxiao.servlet.HelloServlet</servlet-class>
        </servlet>
      
        <servlet-mapping>
          <servlet-name>hello</servlet-name>
          <url-pattern>/hello</url-pattern>
        </servlet-mapping>
        
         <servlet-mapping>
          <servlet-name>hello</servlet-name>
          <url-pattern>/hello2</url-pattern>
        </servlet-mapping>
        
         <servlet-mapping>
          <servlet-name>hello</servlet-name>
          <url-pattern>/hello3</url-pattern>
        </servlet-mapping>
      ```

      

   3. 通配符

      浏览器中输入服务器路径 + /hello/+任意内容时，都可以访问到servle所对应的Servlet类

      ```
        <servlet>
          <servlet-name>hello</servlet-name>
          <servlet-class>com.twxiao.servlet.HelloServlet</servlet-class>
        </servlet>
      
        <servlet-mapping>
          <servlet-name>hello</servlet-name>
          <url-pattern>/hello/*</url-pattern>
        </servlet-mapping>
      ```

   4. 特殊后缀

      浏览器中输入服务器路径 + /hello/+任意内容以 .do 结尾，都可以访问到servle所对应的Servlet类

      ```
        <servlet>
          <servlet-name>hello</servlet-name>
          <servlet-class>com.twxiao.servlet.HelloServlet</servlet-class>
        </servlet>
      
        <servlet-mapping>
          <servlet-name>hello</servlet-name>
          <url-pattern>*.do</url-pattern>
        </servlet-mapping>
      ```

   5. 请求默认路径

      此时打开网页，就会默认打开这个映射对应的servlet。 一般不建议过多使用。

      ```
        <servlet>
          <servlet-name>hello</servlet-name>
          <servlet-class>com.twxiao.servlet.HelloServlet</servlet-class>
        </servlet>
      
        <servlet-mapping>
          <servlet-name>hello</servlet-name>
          <url-pattern>/*</url-pattern>
        </servlet-mapping>
      ```

   **映射的优先级：**

   ​	web.xml文件中已有映射的，直接访问映射对应的类。 没有指定时，走默认请求路径。

   ​	首页因为没有指定所以会走404，/hello有指定映射，会访问指定的servlet

   ```
   
     <servlet>
       <servlet-name>hello</servlet-name>
       <servlet-class>com.twxiao.servlet.HelloServlet</servlet-class>
     </servlet>
   
     <servlet-mapping>
       <servlet-name>hello</servlet-name>
       <url-pattern>/hello</url-pattern>
     </servlet-mapping>
   
   
   <!--404映射-->
       <servlet>
           <servlet-name>err</servlet-name>
           <servlet-class>com.twxiao.servlet.ErrorServlet</servlet-class>
       </servlet>
   
       <servlet-mapping>
           <servlet-name>err</servlet-name>
           <url-pattern>/*</url-pattern>
       </servlet-mapping>
   ```

   

#### 5.4 ServletContent上下文对象

web容器在启动时，会为每个web程序都创建一个servletcontent对象，他代表了当前的这个web应用。

ServletContent对象是所有servlet类的共用对象，可以实现servlet间的数据共享。



 1. 建立setServlet，向上下文中存入数据

    ```java
    package com.twxiao.servlet;
    
    
    import javax.servlet.ServletContext;
    import javax.servlet.ServletException;
    import javax.servlet.http.HttpServlet;
    import javax.servlet.http.HttpServletRequest;
    import javax.servlet.http.HttpServletResponse;
    import java.io.IOException;
    
    public class SetContentServlet extends HttpServlet {
    
        @Override
        protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
            //ServletContent----servlet的上下文对象。是所有servlet的上级，可以在servlet间共享数据。
            ServletContext content = this.getServletContext();//获取上下文对象
    
            String username="Andy";
    
            //以键值对的形式，向上下文中存入一个数据
            content.setAttribute("username",username);
        }
    
        @Override
        protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
            doGet(req, resp);
        }
    }
    
    ```



2. 建立getServlet，从上下文中取出set存入的数据

   ``` java
   package com.twxiao.servlet;
   
   import javax.servlet.ServletContext;
   import javax.servlet.ServletException;
   import javax.servlet.http.HttpServlet;
   import javax.servlet.http.HttpServletRequest;
   import javax.servlet.http.HttpServletResponse;
   import java.io.IOException;
   
   public class GetContentServlet  extends HttpServlet {
       @Override
       protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
           //此处this.getServletContent获取的对象和 SetContentServlet类中所获取的是同一个对象
           ServletContext content = this.getServletContext();
           //从上下文中获取set类存入的值
           String username=(String)content.getAttribute("username");
   
           //设置输入格式
           resp.setContentType("text/html");
           resp.setCharacterEncoding("utf-8");
   
           resp.getWriter().write("从set中获取的名字是："+username);
   
       }
   
       @Override
       protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
           doGet(req, resp);
       }
   }
   
   ```

   

3. 配置web.xml映射

   ``` xml
   <web-app xmlns="http://xmlns.jcp.org/xml/ns/javaee"
            xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
            xsi:schemaLocation="http://xmlns.jcp.org/xml/ns/javaee
                         http://xmlns.jcp.org/xml/ns/javaee/web-app_4_0.xsd"
            version="4.0"
            metadata-complete="true">
   
   <!--    SetCongtentServlet-->
   <servlet>
       <servlet-name>set</servlet-name>
       <servlet-class>com.twxiao.servlet.SetContentServlet</servlet-class>
   </servlet>
       <servlet-mapping>
           <servlet-name>set</servlet-name>
           <url-pattern>/set</url-pattern>
       </servlet-mapping>
   
   
   <!--    GetContentServlet-->
   <servlet>
       <servlet-name>get</servlet-name>
       <servlet-class>com.twxiao.servlet.GetContentServlet</servlet-class>
   </servlet>
       <servlet-mapping>
           <servlet-name>get</servlet-name>
           <url-pattern>/get</url-pattern>
       </servlet-mapping>
   
   
   </web-app>
   
   ```

   

4. 启动tomcat，测试。