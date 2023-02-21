package com.luo.test;

import com.mysql.jdbc.Driver;

import java.sql.*;

public class TestJDBC2 {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        String url="jdbc:mysql://localhost:3306/jdbc??useUnicode=true&characterEncoding=utf-8";
        String username="root";
        String password="123456";

        Class.forName("com.mysql.jdbc.Driver");
        Connection connection = DriverManager.getConnection(url,username,password);
        String sql="insert into users(id, name, password, email, birthday) values(?,?,?,?,?)";

        //预编译
        PreparedStatement preparedStatement = connection.prepareStatement(sql);

        preparedStatement.setInt(1,2);//给第一个占位符？，的值赋值为1
        preparedStatement.setString(2,"一念逍遥");//给第二个占位符？，的值赋值为一念逍遥
        preparedStatement.setString(3,"12345ab");//给第三个占位符？，的值赋值为12345ab
        preparedStatement.setString(4,"***@163.com");//给第四个占位符？，的值赋值为***@163.com
        preparedStatement.setDate(5,new Date(System.currentTimeMillis()));//给第五个占位符？，的值赋值为new Date(System.currentTimeMillis())

        //执行sql
        int i = preparedStatement.executeUpdate();
        if (i>0){
            System.out.println("插入成功");
        }

        //关闭连接，释放资源、
        connection.close();
        preparedStatement.close();

    }
}
