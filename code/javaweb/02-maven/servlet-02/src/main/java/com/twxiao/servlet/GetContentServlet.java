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
