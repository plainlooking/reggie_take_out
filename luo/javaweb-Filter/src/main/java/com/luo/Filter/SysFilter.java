package com.luo.Filter;

import com.luo.Null.constant;

import javax.servlet.*;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class SysFilter implements Filter {
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        HttpServletRequest request=(HttpServletRequest) servletRequest;
        HttpServletResponse response=(HttpServletResponse) servletResponse;
        if (request.getSession().getAttribute(constant.USER_SESSION)==null){
            response.sendRedirect("/error.jsp");
        }




        filterChain.doFilter(servletRequest,servletResponse);

    }

    public void destroy() {

    }
}
