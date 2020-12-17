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
