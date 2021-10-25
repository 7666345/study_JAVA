package com.twxiao.servlet;

import com.twxiao.util.Constant;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

public class SysLogOut extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //获取session，判断用户是否登录
        HttpSession session = req.getSession();
        Object onlineCount = session.getAttribute(Constant.USER_SESSION);
        if(onlineCount != null){
            //如果用户已经登录，则注销session
            session.removeAttribute(Constant.USER_SESSION);

            resp.sendRedirect("/login.jsp");
        }else{
            resp.sendRedirect("/login.jsp");
        }
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }
}
