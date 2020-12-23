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
