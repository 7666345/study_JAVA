package com.twxiao.filter;

import javax.servlet.*;
import java.io.IOException;

public class CharacterEncodingFilter implements Filter {

    @Override
    //初始化，web服务器启动后就已经开始等待过滤数据
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        //处理编码格式
        servletRequest.setCharacterEncoding("utf-8");
        servletResponse.setCharacterEncoding("utf-8");
        servletResponse.setContentType("text/html;charset=UTF-8");

        //过滤器中需要把请求放行，以便继续执行。否则请求会停在这里。
        filterChain.doFilter(servletRequest,servletResponse);
    }

    @Override
    //销毁
    public void destroy() {

    }
}
