package com.luo.dao.user;

import com.luo.dao.BaseDao;
import com.luo.pojo.Role;
import com.luo.pojo.User;
import com.mysql.jdbc.StringUtils;
import com.sun.org.apache.bcel.internal.generic.ARETURN;

import java.sql.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class UserDaoImpl implements UserDao {
    /**
     * 通过userCode获取User
     *
     * @param connection
     * @param userCode
     * @return
     * @throws Exception
     */
    @Override
    public User getLoginUser(Connection connection, String userCode) throws Exception {
        // TODO Auto-generated method stub
        PreparedStatement pstm = null;
        ResultSet rs = null;
        User user = null;
        if (null != connection) {
            String sql = "select * from smbms_user where userCode=?";
            Object[] params = {userCode};
            rs = BaseDao.execute(connection, pstm, rs, sql, params);
            if (rs.next()) {
                user = new User();
                user.setId(rs.getInt("id"));
                user.setUserCode(rs.getString("userCode"));
                user.setUserName(rs.getString("userName"));
                user.setUserPassword(rs.getString("userPassword"));
                user.setGender(rs.getInt("gender"));
                user.setBirthday(rs.getDate("birthday"));
                user.setPhone(rs.getString("phone"));
                user.setAddress(rs.getString("address"));
                user.setUserRole(rs.getInt("userRole"));
                user.setCreatedBy(rs.getInt("createdBy"));
                user.setCreationDate(rs.getTimestamp("creationDate"));
                user.setModifyBy(rs.getInt("modifyBy"));
                user.setModifyDate(rs.getTimestamp("modifyDate"));
            }
            BaseDao.closeResource(null, pstm, rs);
        }
        return user;
    }

    /**
     * 修改用户密码
     *
     * @param connection
     * @param id
     * @param pwd
     * @return
     * @throws Exception
     */
    @Override
    public int updatePwd(Connection connection, int id, String pwd) throws Exception {
        // TODO Auto-generated method stub
        int flag = 0;
        PreparedStatement pstm = null;
        if (connection != null) {
            String sql = "update smbms_user set userPassword= ? where id = ?";
            Object[] params = {pwd, id};
            flag = BaseDao.execute(connection, pstm, sql, params);
            BaseDao.closeResource(null, pstm, null);
        }
        return flag;
    }

    /**
     * 根据用户名或者用户角色查询用户总数
     *
     * @param connection
     * @param userName
     * @param userRol
     * @return
     * @throws Exception
     */
    @Override
    public int getUserCount(Connection connection, String userName, int userRol) throws Exception {
        PreparedStatement pstm = null;
        ResultSet rs = null;
        int count = 0;

        if (connection != null) {
            StringBuffer sql = new StringBuffer();
            sql.append("select count(1) as count from smbms_user u,smbms_role r where u.userRole=r.id");
            ArrayList<Object> list = new ArrayList<Object>(); //存放我们的参数

            if (!StringUtils.isNullOrEmpty(userName)) {
                sql.append(" and u.userName like ?");
                list.add("%" + userName + "%"); //index:0

            }
            if (userRol > 0) {
                sql.append(" and u.userRole like ?");
                list.add(userRol); //index:1
            }
            //list转换为数组
            Object[] params = list.toArray();
            System.out.println("sql---->" + sql.toString());
            rs = BaseDao.execute(connection, pstm, rs, sql.toString(), params);
            if (rs.next()) {
                count = rs.getInt("count");
            }
            BaseDao.closeResource(connection, null, null);
        }

        return count;
    }

    /**
     * 分页查询
     *
     * @param connection
     * @param userName
     * @param userRole
     * @param currentPageNo
     * @param pageSize
     * @return
     * @throws Exception
     */
    @Override
    public List<User> getUserList(Connection connection, String userName, int userRole, int currentPageNo, int pageSize) throws Exception {
        PreparedStatement pstm = null;
        ResultSet rs = null;
        ArrayList<User> userList = new ArrayList<>();
        if (connection != null) {
            StringBuffer sql = new StringBuffer();
            sql.append("select u.*,r.roleName as userRoleName from smbms_user u,smbms_role r where u.userRole = r.id");
            ArrayList<Object> list = new ArrayList<>();
            if (!StringUtils.isNullOrEmpty(userName)) {
                sql.append(" and u.uerName like ?");
                list.add("%" + userName + "%");
            }
            if (userRole > 0) {
                sql.append(" and u.userRole like ?");
                list.add(userRole);
            }
            //在数据库中，分页使用 limit startIndex pageSize
            //当前页  （当前页-1）*页面大小
            //0,5    1   0    012345
            //6,5    2   5    26789
            //11,5   3   10
            sql.append(" order by creationDate DESC limit ?,?");
            currentPageNo = (currentPageNo - 1) * pageSize;
            list.add(currentPageNo);
            list.add(pageSize);

            Object[] params = list.toArray();
            System.out.println("sql ----> " + sql.toString());
            rs = BaseDao.execute(connection, pstm, rs, sql.toString(), params);
            while (rs.next()) {
                User _user = new User();
                _user.setId(rs.getInt("id"));
                _user.setUserCode(rs.getString("userCode"));
                _user.setUserName(rs.getString("userName"));
                _user.setGender(rs.getInt("gender"));
                _user.setBirthday(rs.getDate("birthday"));
                _user.setPhone(rs.getString("phone"));
                _user.setUserRole(rs.getInt("userRole"));
                _user.setUserRoleName(rs.getString("userRoleName"));
                userList.add(_user);
            }
            BaseDao.closeResource(null, pstm, rs);
        }
        return userList;
    }


}
