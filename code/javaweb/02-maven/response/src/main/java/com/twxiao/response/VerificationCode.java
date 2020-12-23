package com.twxiao.response;

import javax.imageio.ImageIO;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.FileInputStream;
import java.io.IOException;
import java.net.URLEncoder;
import java.util.Random;

public class VerificationCode extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //生成验证码
        //1. 让浏览器定时请求一次
        resp.setHeader("refresh","5");//每五秒请求刷新一次验证码
        //2. 在内存中创建图片
        BufferedImage bufferedImage = new BufferedImage(120,40,BufferedImage.TYPE_INT_RGB);
        //3.得到图片
        //3-1. 得到画笔
        Graphics2D g= (Graphics2D) bufferedImage.getGraphics();
        //3-2. 给图片绘制背景颜色
        g.setColor(Color.GRAY);//给画笔设置颜色
        g.fillRect(0,0,120,40);//用画笔给图片填充颜色作为背景
        //4. 给图片写入随机数
        //4-1. 设置画笔颜色，在背景上写入随机数
        g.setColor(Color.white);
        //4-2. 设置字体样式
        g.setFont(new Font(null,Font.ITALIC,20));
        //4-3. 写入数据
        g.drawString(makeNum(),30,20);
        //5. 设置浏览器响应头
        //5-1. 让浏览器用图片方式打开这个请求
        resp.setContentType("image/jpeg");
        //5-2.  设置浏览器混村策略为不缓存
        resp.setDateHeader("expires",-1);
        resp.setHeader("cache-control","no-cache");
        resp.setHeader("pragma","no-cache");
        //6. 向浏览器输出图片
        ImageIO.write(bufferedImage,"jpg",resp.getOutputStream());
    }

    private String makeNum(){
        Random random = new Random();
        String num=random.nextInt(999999)+"";//生成一个6位，最大999999的随机数。（最后+“”，让int变成string类型）
        //如果生成的随机数不足6位数，用0补足位数
        StringBuffer sb=new StringBuffer();
        for (int i = 0; i < 6-num.length(); i++) {
            sb.append("0");
        }
        num=sb.toString()+num;
        return num;

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }
}
