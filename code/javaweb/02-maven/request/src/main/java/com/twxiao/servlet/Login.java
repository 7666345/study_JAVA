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
