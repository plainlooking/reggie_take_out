package com.luo.Filter;

import javax.servlet.*;
import java.io.IOException;

public class CharacterEncodingFileter implements Filter {
//初始化 web服务器启动就已经初始化了，随时等待过滤对象出现
    public void init(FilterConfig filterConfig) throws ServletException {
        System.out.println("CharacterEncoding初始化");
    }
//链
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {

        servletRequest.setCharacterEncoding("utf-8");
        servletResponse.setCharacterEncoding("utf-8");
        servletResponse.setContentType("text/html;charset=UTF-8");
        System.out.println("CharacterEncoding执行前....");
        filterChain.doFilter(servletRequest,servletResponse);//让我们的请求继续，如果不写，程序到这里会被拦截
        System.out.println("CharacterEncoding执行后....");
    }
//销毁
    public void destroy() {
        System.out.println("CharacterEncoding销毁");

    }
}
