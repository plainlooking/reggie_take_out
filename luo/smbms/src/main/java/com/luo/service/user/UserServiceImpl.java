package com.luo.service.user;

import com.luo.dao.BaseDao;
import com.luo.dao.user.UserDao;
import com.luo.dao.user.UserDaoImpl;
import com.luo.pojo.User;
import org.junit.jupiter.api.Test;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class UserServiceImpl implements UserService {
    //业务层会调用dao层，所以我们要引入Dao层
    private UserDao userDao;
    private Object List;

    public UserServiceImpl() {
        userDao = new UserDaoImpl();
    }

    @Override
    public User login(String userCode, String userPassword) {
        // TODO Auto-generated method stub
        Connection connection = null;
        User user = null;
        try {
            connection = BaseDao.getConnection();
            user = userDao.getLoginUser(connection, userCode);
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } finally {
            BaseDao.closeResource(connection, null, null);
        }

        //匹配密码
        if (null != user) {
            if (!user.getUserPassword().equals(userPassword)) {
                user = null;
            }
        }

        return user;
    }

    /**
     * 修改用户ID
     *
     * @param id
     * @param pwd
     * @return
     */
    @Override
    public boolean updatePwd(int id, String pwd) {
        boolean flag = false;
        Connection connection = null;
        try {
            connection = BaseDao.getConnection();
            if (userDao.updatePwd(connection, id, pwd) > 0) {
                flag = true;
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            BaseDao.closeResource(connection, null, null);
        }
        return flag;
    }

    /**
     * 查询记录
     *
     * @param userName
     * @param userRol
     * @return
     */
    @Override
    public int getUserCount(String userName, int userRol) {
        Connection connection = null;
        int count = 0;
        try {
            connection = BaseDao.getConnection();
            count = userDao.getUserCount(connection, userName, userRol);
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            BaseDao.closeResource(connection, null, null);
        }
        return count;
    }

    /**
     * 通过对象查询
     *
     * @param userName
     * @param userRole
     * @param currentPageNo
     * @param pageSize
     * @return
     */
    @Override
    public List<User> getUserList(String userName, int userRole, int currentPageNo, int pageSize) {
        Connection connection=null;
        List<User> list=null;
        System.out.println("------>"+userName);
        System.out.println("------>"+userRole);
        System.out.println("------>"+currentPageNo);
        System.out.println("------>"+pageSize);

        try {
            connection=BaseDao.getConnection();
            list=userDao.getUserList(connection,userName,userRole,currentPageNo,pageSize);
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            BaseDao.closeResource(connection,null,null);
        }
        return list;
    }
    /**
     * 通过对象查询
     *  @Test
     *     public void tset(){
     *         UserServiceImpl userService = new UserServiceImpl();
     *         List<User> userList=userService.getUserList(null,1,1,1);
     *         System.out.println(userList);
     *
     *     }
     */

    /**
     *用户Id修改
     * @Test public void test(){
     * UserServiceImpl userService = new UserServiceImpl();
     * U ser admin = userService.login("admin", "1234567 ");
     * System.out.println(admin.getUserPassword());
     * }
     */


    /**
     * 用户查询测试
     * @Test
     *     public void test() {
     *         UserServiceImpl userService = new UserServiceImpl();
     *         int userCount = userService.getUserCount(null, 0);
     *         System.out.println(userCount);
     *     }
     */

}
