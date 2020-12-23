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
