package com.twxiao.servlet;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

public class CookieDemo1 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //操作cookie，显示客户端上一次访问的时间
        req.setCharacterEncoding("utf-8");
        resp.setCharacterEncoding("utf-8");

        PrintWriter out = resp.getWriter();//获取一个用于响应数据的实例对象。


        //从客户端的请求中获取cookie
        Cookie[] cookies = req.getCookies(); //返回的是一个数组，说明cookie可以有多个

        if (cookies != null){
            //取出cookie
            for (int i = 0; i < cookies.length; i++) {
                Cookie c=cookies[i];//遍历cookie数组
                if(c.getName().equals("loginTime")){
                    //里面如果有loginTime，就显示出来。
                    //loginTime存的是字符串类型的时间戳，要转成长整型，再用date函数转为时间。然后再变成字符串响应给浏览器。
                    Long loginTime=Long.parseLong(c.getValue());
                    Date date=new Date(loginTime);
                    out.write("您上次登录的时间是："+date.toLocaleString());
                }
            }

        }else{
            //cookie为空说明是第一次来。
            out.write("您是第一次访问本站。");
        }

        //给cookie赋值，记录访问的时间。System.currentTimeMillis()不是字符串格式，+“”转为字符串。
        Cookie loginTimeCookie = new Cookie("loginTime", System.currentTimeMillis()+"");
        loginTimeCookie.setMaxAge(24*60*60);//设置cookie有效期为1天（1分=60秒，1小时=60分，1天=24小时）
        //将cookie添加入响应中
        resp.addCookie(loginTimeCookie);

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }
}
