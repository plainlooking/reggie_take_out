package com.luo.service.user;

import com.luo.pojo.User;

import java.sql.Connection;
import java.util.List;

public interface UserService {
    /**
     * 用户登录
     * @param userCode
     * @param userPassword
     * @return
     */
    public User login(String userCode, String userPassword);

    /**
     * 根据userId修改密码
     *
     * @param id
     * @param pwd
     * @return
     */
    public boolean updatePwd(int id, String pwd);

    /**
     *根据条件用户查询
     * @param userName
     * @param userRol
     * @return
     */
    public int getUserCount(String userName,int userRol);

    /**
     * 通过对象查询
     *
     * @param userName
     * @param userRole
     * @param currentPageNo
     * @param pageSize
     * @return
     */
    public List<User> getUserList(String userName,int userRole,int currentPageNo,int pageSize);

}
