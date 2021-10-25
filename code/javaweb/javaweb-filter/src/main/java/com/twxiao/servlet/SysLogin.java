package com.twxiao.servlet;

import com.twxiao.util.Constant;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

public class SysLogin extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String username = req.getParameter(Constant.USER_SESSION);

        if(username.equals("admin")){

            //存入session
            HttpSession session = req.getSession();
            session.setAttribute(Constant.USER_SESSION,session.getId());

            resp.sendRedirect("/sys/sucess.jsp");
        }else{
            resp.sendRedirect("/error.jsp");
        }

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }
}
