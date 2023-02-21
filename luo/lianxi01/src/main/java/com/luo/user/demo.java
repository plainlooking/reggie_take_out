package com.luo.user;

import com.luo.dao.Dao;
import com.luo.pojo.User;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class demo {
    public static void InsertDemo(Connection connection,User) throws Exception{
        PreparedStatement pstm=null;
       int flag=0;
        if (connection != null){
            String sql="insert into book values (?,?,?,?,?,?,?)";
            Object[] params={};
             flag = Dao.execute(connection, pstm, sql, params);
             Dao.closeResource(null,pstm,null);
        }
        return flag;
    }
}
