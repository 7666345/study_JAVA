package com.twxiao.servlet;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.util.Date;

public class CookieEncodeDemo extends HttpServlet {
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
                if(c.getName().equals("cookieencode")){
                    out.write("name是："+ URLDecoder.decode(c.getValue(),"utf-8"));
                }
            }

        }else{
            //cookie为空说明是第一次来。
            out.write("您是第一次访问本站。");
        }

        //给cookie赋值，记录访问的时间。System.currentTimeMillis()不是字符串格式，+“”转为字符串。
        Cookie cookieencode = new Cookie("cookieencode", URLEncoder.encode("中文可能会出乱码","utf-8"));

        //如果给cookie设置时效为0，则会立刻失效。
        cookieencode.setMaxAge(0);

        //将cookie添加入响应中
        resp.addCookie(cookieencode);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }
}
