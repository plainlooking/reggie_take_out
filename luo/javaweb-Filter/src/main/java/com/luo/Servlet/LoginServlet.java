package com.luo.Servlet;

import com.luo.Null.constant;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class LoginServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //前端获取参数
        String username = req.getParameter("username");
        System.out.println(username);

        if (username.equals("admin")){
            req.getSession().setAttribute(constant.USER_SESSION,req.getSession().getId());
            resp.sendRedirect("/sys/sure.jsp");
        }
        else {
            resp.sendRedirect("/error.jsp");
        }
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }
}
