package com.luo.service.role;

import com.luo.dao.BaseDao;
import com.luo.dao.role.RoleDao;
import com.luo.dao.role.RoleDaoImpl;
import com.luo.pojo.Role;
import org.junit.jupiter.api.Test;

import java.sql.Connection;
import java.util.List;

public class RoleServiceImpl implements RoleService {
    /**
     * 应入Dao
     */
    private RoleDao roleDao;

    public RoleServiceImpl() {
        roleDao = new RoleDaoImpl();
    }

    /**
     * 获取角色列表
     * @return
     */
    @Override
    public List<Role> getRoleList() {
        Connection connection = null;
        List<Role> roleList=null;
        try {
            connection = BaseDao.getConnection();
            roleList = roleDao.getRoleList(connection);
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            BaseDao.closeResource(connection,null,null);
        }
        return roleList;
    }
//    @Test
//    public void test(){
//        RoleServiceImpl roleService = new RoleServiceImpl();
//        List<Role> roleList = roleService.getRoleList();
//        for (Role role : roleList){
//            System.out.println(role.getRoleName());
//        }
//    }
}
