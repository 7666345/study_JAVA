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
