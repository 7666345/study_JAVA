package com.twxiao.response;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.FileInputStream;
import java.io.IOException;
import java.net.URLEncoder;

public class FileDownload extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

//1. 使用上下文对象ServletContext的 getRealPahth()方法获取下载路径
        ServletContext context = this.getServletContext();
        String filePath=context.getRealPath("/WEB-INF/classes/1你好.png");
        //System.out.println("文件的地址是："+filePath);
// 2. 截取的方式取得下载的文件名
        String fileName = filePath.substring(filePath.lastIndexOf("\\") + 1);
// 3. 设置，想办法让浏览器支持下载我们需要的东西（设置响应头等相关）
        resp.setHeader("Content-Disposition","attachment;filename="+ URLEncoder.encode(fileName,"utf-8"));
//4. 获取目标文件的输入流
        FileInputStream in = new FileInputStream(filePath);
//5. 创建缓冲区
        int len=0;
        byte[] buffer = new byte[1024];
//6. 获取OutputStream对象
        ServletOutputStream out = resp.getOutputStream();
//7. 将 FileOutputStream流写入缓冲区(buffer)，使用OutputStream将缓冲区中的数据输出到客户端
        while ((len=in.read(buffer))>0){
            out.write(buffer,0,len);
        }
//8.关闭输入、输出流
        in.close();
        out.close();

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }
}
