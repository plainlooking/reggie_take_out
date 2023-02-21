package com.luo.servlet.user;

import com.alibaba.fastjson.JSONArray;
import com.luo.pojo.Role;
import com.luo.pojo.User;
import com.luo.service.role.RoleServiceImpl;
import com.luo.service.user.UserService;
import com.luo.service.user.UserServiceImpl;
import com.luo.util.Constants;
import com.luo.util.PageSupport;
import com.mysql.jdbc.StringUtils;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

//Servlet复用
public class UserServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String method=req.getParameter("method");
        if (method.equals("savepwd")&&method!=null){
            this.updatePwd(req,resp);
        }else if (method.equals("pwdmodify")&&method!=null){
            this.pwdmodify(req,resp);
        }else if (method.equals("qurey")&&method!=null){
            this.qurey(req,resp);
        }
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }

    //修改密码
    public void updatePwd(HttpServletRequest req, HttpServletResponse resp){
        // Session里面拿id
        Object o = req.getSession().getAttribute(Constants.USER_SESSION);
        String newpassword = req.getParameter("newpassword");
        boolean flag=false;
        if (o != null && !StringUtils.isNullOrEmpty(newpassword)){
            UserService userService=new UserServiceImpl();
            flag = userService.updatePwd(((User)o).getId(),newpassword);
            if (flag){
                req.setAttribute("message","修改密码成功");
                //密码修改成功，移除session
                req.getSession().removeAttribute(Constants.USER_SESSION);
            }else {
                req.setAttribute("message","修改密码失败");
            }
        }else {
            req.setAttribute("message","新密码有问题");
        }

        try {
            req.getRequestDispatcher("pwdmodify.jsp").forward(req,resp);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    //验证旧密码 session中有用户密码
    public void pwdmodify(HttpServletRequest req, HttpServletResponse resp){
        //session中拿密码
        Object o=req.getSession().getAttribute(Constants.USER_SESSION);
        String oldpassword = req.getParameter("oldpassword");
        //定义一个HashMap
        HashMap<String, String> resultMap = new HashMap<String, String>();
        if (o==null){  //Session失效了，session过期

            resultMap.put("result","sessionerror");

        }else if (StringUtils.isNullOrEmpty(oldpassword)){   //输入密码为空
            resultMap.put("result","error");
        }else {
            String userPassword = ((User) o).getUserPassword(); //session中用户的密码
            if (oldpassword.equals(userPassword)){
                resultMap.put("result","true");
            }else {
                resultMap.put("result","false");
            }
        }

        try {
            resp.setContentType("application/json");
            PrintWriter writer = resp.getWriter();
            writer.write(JSONArray.toJSONString(resultMap));
            writer.flush();
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    //重点
    public void qurey(HttpServletRequest req, HttpServletResponse resp){
        //查询用户列表

        //前端获取数据
        String queryUserName = req.getParameter("queryname");
        String temp = req.getParameter("queryUserRole");
        String pageIndex = req.getParameter("pageIndex");
        int queryUserRole=0;

        //获取用户列表
        UserServiceImpl userService = new UserServiceImpl();
        List<User> userList=null;

        //第一次走这个请求，一定是第一页，页面大小固定
        int pageSize=5;  //把这个写到配置文件里，方便修改
        int currentPageNo=1;


        if (queryUserName==null){
            queryUserName="";
        }
        if (temp!=null && !temp.equals("")){
            queryUserRole = Integer.parseInt(temp); //给查询赋值！0，1，2，3
        }
        if (pageIndex!=null){
            currentPageNo=Integer.parseInt(pageIndex);
        }

        //获取用户总数(分页：上一页，下一页的情况)
        int totalCount = userService.getUserCount(queryUserName, queryUserRole);
        //总页支持
        PageSupport pageSupport = new PageSupport();
        pageSupport.setCurrentPageNo(currentPageNo);
        pageSupport.setPageSize(pageSize);
        pageSupport.setTotalCount(totalCount);

        int totalPageCount = pageSupport.getTotalCount();

        //控制页面与首页
        //如果页面小与1了，就显示第一页的东西
        if (currentPageNo<1){
            currentPageNo=1;
        }else if (currentPageNo>totalCount){ //当前页面大于最后一页
                currentPageNo=totalCount;
        }

        //获取用户列表展示
        userList = userService.getUserList(queryUserName, queryUserRole, currentPageNo, pageSize);
        req.setAttribute("userList",userList);
        RoleServiceImpl roleService = new RoleServiceImpl();
        List<Role> roleList = roleService.getRoleList();
        req.setAttribute("roleList",roleList);
        req.setAttribute("totalCount",totalCount);

    }
}
