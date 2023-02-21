package com.luo.dao;

import java.io.IOException;
import java.io.InputStream;
import java.sql.*;
import java.util.Properties;

public class Dao {
    /**
     * 加载驱动
     */
    static {
        init();
    }

    private static String driver;
    private static String url;
    private static String username;
    private static String password;

    public static void init() {
        Properties properties = new Properties();
        String configFile = "db.properties";
        InputStream inputStream = Dao.class.getClassLoader().getResourceAsStream(configFile);
        try {
            properties.load(inputStream);
        } catch (IOException e) {
            e.printStackTrace();
        }
        driver = properties.getProperty("driver");
        url = properties.getProperty("url");
        username = properties.getProperty("username");
        password = properties.getProperty("password");
    }

    /**
     * 获取连接
     *
     * @return
     */
    public static Connection getConnection() {
        Connection connection = null;
        try {
            Class.forName(driver);
            connection = DriverManager.getConnection(url, username, password);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return connection;
    }

    /**
     * 查询
     * @param connection
     * @param pstm
     * @param rs
     * @param sql
     * @param params
     * @return
     * @throws Exception
     */

    public static ResultSet execute(Connection connection, PreparedStatement pstm,ResultSet rs, String sql, Object[] params) throws Exception {
        pstm=connection.prepareStatement(sql);
        for (int i=0;i<params.length;i++){
            pstm.setObject(i+1,params[i]);
        }
        rs = pstm.executeQuery();
        return rs;
    }

    /**
     * 增删改查
     * @param connection
     * @param pstm
     * @param sql
     * @param params
     * @return
     * @throws Exception
     */
    public static int execute(Connection connection,PreparedStatement pstm,String sql,Object[] params)throws Exception{
        int updateRow=0;
        pstm=connection.prepareStatement(sql);
        for (int i=0;i<params.length;i++){
            pstm.setObject(i+1,params[i]);
        }
        updateRow=pstm.executeUpdate();
        return updateRow;
    }

    /**
     * 关闭资源
     * @param connection
     * @param pstm
     * @param rs
     * @return
     */
    public static boolean closeResource(Connection connection,PreparedStatement pstm,ResultSet rs){

        boolean flag=true;
        if (connection != null){
            try {
                connection.close();
                connection=null;
            } catch (SQLException e) {
                e.printStackTrace();
                flag=false;
            }
        }
        if (pstm != null){
            try {
                pstm.close();
                pstm=null;
            } catch (SQLException e) {
                e.printStackTrace();
                flag=false;
            }
        }
        if (rs != null){
            try {
                rs.close();
                rs=null;
            } catch (SQLException e) {
                e.printStackTrace();
                flag=false;
            }
        }
        return flag;
    }

}
