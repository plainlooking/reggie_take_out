package com.luo.dao.role;

import com.luo.pojo.Role;

import java.sql.Connection;
import java.util.List;

public interface RoleDao {
    /**
     *获取角色列表
     * @param connection
     * @return
     * @throws Exception
     */
    public List<Role> getRoleList(Connection connection)throws Exception;
}
