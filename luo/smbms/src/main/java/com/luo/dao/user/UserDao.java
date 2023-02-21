package com.luo.dao.user;

import com.luo.pojo.Role;
import com.luo.pojo.User;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

public interface UserDao {
    /**
     * 通过userCode获取User
     * @param connection
     * @param userCode
     * @return
     * @throws Exception
     */
    public User getLoginUser(Connection connection, String userCode)throws Exception;

    /**
     * 修改当前用户密码
     * @param connection
     * @param id
     * @param pwd
     * @return
     * @throws Exception
     */
    public int updatePwd(Connection connection, int id, String pwd)throws Exception;

    /**
     * 查询登录用户
     * @param connection
     * @param userName
     * @param userRol
     * @return
     * @throws Exception
     */
    public int getUserCount(Connection connection,String userName,int userRol)throws Exception;

    /**
     * 通过条件查询userlist
     * @param connection
     * @param userName
     * @param userRole
     * @return
     * @throws Exception
     */
    public List<User> getUserList(Connection connection,String userName,int userRole,int currentPageNo,int pageSize) throws Exception;

}

