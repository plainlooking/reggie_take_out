package com.luo.test;

import org.junit.Test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class TestJDBC3 {
    @Test
    public void test() throws Exception {
        //配置信息
        //?useUnicode=true&characterEncoding=utf-8 解决中文乱码
        String url="jdbc:mysql://localhost:3306/jdbc??useUnicode=true&characterEncoding=utf-8";
        String username="root";
        String password="123456";

        //加载驱动
        Class.forName("com.mysql.jdbc.Driver");
        //连接数据库
        Connection connection = DriverManager.getConnection(url, username, password);

        //通知数据库开启操作 false开启
        connection.setAutoCommit(false);
        String sql="update account set money=money-100 where name='a'";
        connection.prepareStatement(sql).executeUpdate();

        //制造错误
        int i=1/0;

        String sql2="update account set money=money+100 where name='b'";
        connection.prepareStatement(sql2).executeUpdate();

    }
}
