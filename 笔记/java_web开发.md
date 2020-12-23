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

#### 4.7 注意事项

使用maven打包的时候，有可能会出现问题，导致properties资源文件没有被打包，可以在pom文件中加入如下代码;

``` xml

<!--在<build>中配置resources,来防止资源导出失败问题-->
    <resources>
      <resource>
        <directory>src/main/resources</directory>
        <includes>
          <include>**/*.properties</include>
          <include>**/*.xml</include>
        </includes>
        <filtering>true</filtering>
      </resource>
      <resource>
        <directory>src/main/java</directory>
        <includes>
          <include>**/*.properties</include>
          <include>**/*.xml</include>
        </includes>
        <filtering>true</filtering>
      </resource>
    </resources>
```



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

   

#### 5.4 ServletContext上下文对象

web容器在启动时，会为每个web程序都创建一个servletcontent对象，他代表了当前的这个web应用。

##### 1. 共享数据

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



##### 2. 初始化参数



可以在web.xml中，通过 <context-param>来配置一些web的初始化参数：

``` xml
<context-param>
    <param-name>mysqlurl</param-name>
    <param-value>jdbc:mysql://localhost:3306/mybatis</param-value>
</context-param>

<!--配置路径映射，让外部可以访问servlet来获取mysqlurl-->
    <servlet>
        <servlet-name>geturl</servlet-name>
        <servlet-class>com.twxiao.servlet.ContextServletDemo3</servlet-class>
    </servlet>
    <servlet-mapping>
        <servlet-name>geturl</servlet-name>
        <url-pattern>/geturl</url-pattern>
    </servlet-mapping>
```

在servlet中可以通过ServletContent上下文对象的getInitParameter()方法来获取web.xml中的配置:

``` java
package com.twxiao.servlet;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class ContextServletDemo3 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //ServletContent----servlet的上下文对象。是所有servlet的上级，可以在servlet间共享数据。
        ServletContext content = this.getServletContext();//获取上下文对象

        String mysqlurl=content.getInitParameter("mysqlurl");
        resp.getWriter().println(mysqlurl);

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }
}
```

##### 3. 转发请求

可是用上下文对象的 getRequestDispatcher()转发请求到指定的目标

``` java
package com.twxiao.servlet;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class ContextServletDemo3 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //ServletContent----servlet的上下文对象。是所有servlet的上级，可以在servlet间共享数据。
        ServletContext content = this.getServletContext();//获取上下文对象
        content.getRequestDispatcher("/geturl").forward(req,resp);//将指向该servlet的请求转发到 /geturl

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }
}
```

##### 4. 读取资源文件

资源文件（ .propertis）一般位于main/resources文件夹中。打包后在classes文件夹下，通常这个路径也被称为类路径。

读取步骤：

 1. 上下文对象使用 getResourceAsStream()方法获取并转化成 InputStream 类型的流数据。

 2. 实例化一个 Properties类的实例来加载转化的流数据。

 3. 使用Properties类对象的getProperty()方法读取具体的值

    ``` java
    package com.twxiao.servlet;
    
    import javax.servlet.ServletContext;
    import javax.servlet.ServletException;
    import javax.servlet.http.HttpServlet;
    import javax.servlet.http.HttpServletRequest;
    import javax.servlet.http.HttpServletResponse;
    import java.io.IOException;
    import java.io.InputStream;
    import java.util.Properties;
    
    public class ServletContextDemo5 extends HttpServlet {
        @Override
        protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
            //ServletContent----servlet的上下文对象。是所有servlet的上级，可以在servlet间共享数据。
            ServletContext content = this.getServletContext();//获取上下文对象
            //通过getResourceAsStream()来读取资源文件并转为流
            InputStream is=content.getResourceAsStream("/WEB-INF/classes/db.properties");
            //用Properties类加载转的流
            Properties pp =new Properties();//实例化对象
            pp.load(is);//加载流
            //用getProperty()方法获取数据
            String username=pp.getProperty("user");
            String pwd=pp.getProperty("password");
    
            //输出到页面
            resp.getWriter().println(username+":"+pwd);
    
        }
    
        @Override
        protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
            doGet(req, resp);
        }
    }
    
    ```

    

#### 6. HttpServletRequest(请求)和HttpServletResponse(响应)

​	web服务器接收到客户端的请求，针对这个请求将分别创建一个代表请求的HttpServletRequest对象和代表响应的HttpServletResponse对象。

##### 6.1 HttpServletResponse



	###### 6.1.1 **简单的分类：**

   1. 负责向浏览器发送数据的方法：

      ``` java 
          ServletOutputStream getOutputStream() throws IOException; //处理流
      
          PrintWriter getWriter() throws IOException; //处理文字常用
      ```

      

   2. 负责向浏览器发送响应头的方法（部分）：

      ``` java
      void setCharacterEncoding(String var1);
      void setContentLength(int var1);
      void setContentType(String var1);
      void setBufferSize(int var1);
      void setDateHeader(String var1, long var2);
      void addDateHeader(String var1, long var2);
      void setHeader(String var1, String var2);
      void addHeader(String var1, String var2);
      void setIntHeader(String var1, int var2);
      void addIntHeader(String var1, int var2);
      void setStatus(int var1);
      ```

3. 响应状态码：

   ``` java
       int SC_CONTINUE = 100;
       int SC_SWITCHING_PROTOCOLS = 101;
       int SC_OK = 200;
       int SC_CREATED = 201;
       int SC_ACCEPTED = 202;
       int SC_NON_AUTHORITATIVE_INFORMATION = 203;
       int SC_NO_CONTENT = 204;
       int SC_RESET_CONTENT = 205;
       int SC_PARTIAL_CONTENT = 206;
       int SC_MULTIPLE_CHOICES = 300;
       int SC_MOVED_PERMANENTLY = 301;
       int SC_MOVED_TEMPORARILY = 302;
       int SC_FOUND = 302;
       int SC_SEE_OTHER = 303;
       int SC_NOT_MODIFIED = 304;
       int SC_USE_PROXY = 305;
       int SC_TEMPORARY_REDIRECT = 307;
       int SC_BAD_REQUEST = 400;
       int SC_UNAUTHORIZED = 401;
       int SC_PAYMENT_REQUIRED = 402;
       int SC_FORBIDDEN = 403;
       int SC_NOT_FOUND = 404;
       int SC_METHOD_NOT_ALLOWED = 405;
       int SC_NOT_ACCEPTABLE = 406;
       int SC_PROXY_AUTHENTICATION_REQUIRED = 407;
       int SC_REQUEST_TIMEOUT = 408;
       int SC_CONFLICT = 409;
       int SC_GONE = 410;
       int SC_LENGTH_REQUIRED = 411;
       int SC_PRECONDITION_FAILED = 412;
       int SC_REQUEST_ENTITY_TOO_LARGE = 413;
       int SC_REQUEST_URI_TOO_LONG = 414;
       int SC_UNSUPPORTED_MEDIA_TYPE = 415;
       int SC_REQUESTED_RANGE_NOT_SATISFIABLE = 416;
       int SC_EXPECTATION_FAILED = 417;
       int SC_INTERNAL_SERVER_ERROR = 500;
       int SC_NOT_IMPLEMENTED = 501;
       int SC_BAD_GATEWAY = 502;
       int SC_SERVICE_UNAVAILABLE = 503;
       int SC_GATEWAY_TIMEOUT = 504;
       int SC_HTTP_VERSION_NOT_SUPPORTED = 505;
   ```

   

###### 6.1.2 常见应用

###### （1）输出信息

 想浏览器输出信息： getWriter()、getOutputStream()等常见方法

一直在用，不再赘述。



###### （2）下载文件:

​	a. 获取下载路径---ServletContext上下文对象的getRealPath()方法。

​	b. 通过截取字符串的方式取得下载的文件名

​	c. 设置，想办法让浏览器支持下载我们需要的东西（设置享有头等相关），最好使用URLEncoder.encode()方法设置编码为utf-8

​	d. 获取目标文件的输入流

​	e. 创建缓冲区

​	f. 获取OutputStream对象

​	g. 将 FileOutputStream流写入缓冲区(buffer)，使用OutputStream将缓冲区中的数据输出到客户端

​	h.关闭输入、输出流

``` java
package com.twxiao.response;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.FileInputStream;
import java.io.IOException;
import java.net.URLEncoder;

public class FileDownload extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

//1. 使用上下文对象ServletContext的 getRealPahth()方法获取下载路径
        ServletContext context = this.getServletContext();
        String filePath=context.getRealPath("/WEB-INF/classes/1你好.png");
        //System.out.println("文件的地址是："+filePath);
// 2. 截取的方式取得下载的文件名
        String fileName = filePath.substring(filePath.lastIndexOf("\\") + 1);
// 3. 设置，想办法让浏览器支持下载我们需要的东西（设置响应头等相关）
        resp.setHeader("Content-Disposition","attachment;filename="+ URLEncoder.encode(fileName,"utf-8"));
//4. 获取目标文件的输入流
        FileInputStream in = new FileInputStream(filePath);
//5. 创建缓冲区
        int len=0;
        byte[] buffer = new byte[1024];
//6. 获取OutputStream对象
        ServletOutputStream out = resp.getOutputStream();
//7. 将 FileOutputStream流写入缓冲区(buffer)，使用OutputStream将缓冲区中的数据输出到客户端
        while ((len=in.read(buffer))>0){
            out.write(buffer,0,len);
        }
//8.关闭输入、输出流
        in.close();
        out.close();

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }
}

```



###### （3）验证码

验证码的后端实现方式（也可以在前端用js实现）

```java
package com.twxiao.response;

import javax.imageio.ImageIO;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.FileInputStream;
import java.io.IOException;
import java.net.URLEncoder;
import java.util.Random;

public class VerificationCode extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //生成验证码
        //1. 让浏览器定时请求一次
        resp.setHeader("refresh","5");//每五秒请求刷新一次验证码
        //2. 在内存中创建图片
        BufferedImage bufferedImage = new BufferedImage(120,40,BufferedImage.TYPE_INT_RGB);
        //3.得到图片
        //3-1. 得到画笔
        Graphics2D g= (Graphics2D) bufferedImage.getGraphics();
        //3-2. 给图片绘制背景颜色
        g.setColor(Color.GRAY);//给画笔设置颜色
        g.fillRect(0,0,120,40);//用画笔给图片填充颜色作为背景
        //4. 给图片写入随机数
        //4-1. 设置画笔颜色，在背景上写入随机数
        g.setColor(Color.white);
        //4-2. 设置字体样式
        g.setFont(new Font(null,Font.ITALIC,20));
        //4-3. 写入数据
        g.drawString(makeNum(),30,20);
        //5. 设置浏览器响应头
        //5-1. 让浏览器用图片方式打开这个请求
        resp.setContentType("image/jpeg");
        //5-2.  设置浏览器混村策略为不缓存
        resp.setDateHeader("expires",-1);
        resp.setHeader("cache-control","no-cache");
        resp.setHeader("pragma","no-cache");
        //6. 向浏览器输出图片
        ImageIO.write(bufferedImage,"jpg",resp.getOutputStream());
    }

    private String makeNum(){
        Random random = new Random();
        String num=random.nextInt(999999)+"";//生成一个6位，最大999999的随机数。（最后+“”，让int变成string类型）
        //如果生成的随机数不足6位数，用0补足位数
        StringBuffer sb=new StringBuffer();
        for (int i = 0; i < 6-num.length(); i++) {
            sb.append("0");
        }
        num=sb.toString()+num;
        return num;

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }
}

```



###### （4）实现重定向

``` java
package com.twxiao.response;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class UrlRedirect extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        /*
        resp.sendRedirect()方法的本质就是：
            resp.setHeader("Location","跳转的地址");
            resp.setStatus(302);
         */
        resp.sendRedirect("/response_war/vcode");//因为/指web项目根目录，但是本地有二级目录所以要加上
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }
}

```



##### 6.2 HttpSrvletRequest

接受参数一般最常用的只有两个:

​		 req.getParameter();--一个参数，用户名
​          req.getParameterValues();--一组参数，多选框



``` java
package com.twxiao.servlet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.Arrays;

public class Login extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        /*
        接受参数常用的就是
          req.getParameter();--一个参数，用户名
          req.getParameterValues();--一组参数，多选框
         */
        //设置编码,确保接受和响应的内容不会因为编码原因成为乱码
        req.setCharacterEncoding("utf-8");
        resp.setCharacterEncoding("utf-8");


        String username=req.getParameter("username");
        String pwd=req.getParameter("pwd");
        String[] hobbys=req.getParameterValues("hobbys");

        System.out.println(username+":"+pwd);
        System.out.println(Arrays.toString(hobbys));

        /*
        跳转到其他页面
         */
        resp.sendRedirect("./success.jsp");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }
}

```





#### 7. cookie 和 session

##### 7.1 会话



## 日积月累

### 单词

verification-----验证



### 面试题

1. 重定向与转发的区别有哪些?

   相同点： 页面都会发生跳转。

   不同点：请求转发的情况下url地址栏不会发生改变。307

   ​				重定向时url会变。 302

   原理如图：

   ![image-20201223124023442](C:\Users\h\Desktop\java\studyJAVA\笔记\img\image-20201223124023442.png)