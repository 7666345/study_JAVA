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
        resp.setContentType("text/html"); //设置返回的响应是html类型的
        resp.setCharacterEncoding("utf-8");//设置返回的响应编码格式为utf8
        PrintWriter writer=resp.getWriter(); //响应刘

        writer.write("Hello，Servlet！");//向浏览器返回一个字符串。
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }
}
