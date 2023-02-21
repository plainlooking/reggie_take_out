package com.luo.filter;

import com.luo.pojo.User;
import com.luo.util.Constants;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class SysFilter implements Filter {

    public void init(FilterConfig filterConfig) throws ServletException {

    }

    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        HttpServletRequest request1 = (HttpServletRequest) request;
        HttpServletResponse response1 = (HttpServletResponse) response;
        User user = (User) request1.getSession().getAttribute(Constants.USER_SESSION);

        if (user==null){     //已经移除或者注销了，或者未登录
            response1.sendRedirect("/smbms/error.jsp");
        }else {
            chain.doFilter(request,response);
        }

    }

    public void destroy() {

    }
}
