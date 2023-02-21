package com.luo.mybatis.test;

import com.luo.mybatis.mapper.ParameterMapper;
import com.luo.mybatis.pojo.User;
import com.luo.mybatis.utils.SqlSessionUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TestParameterMapper {

    /**
     * mybatis获取参数值的两种方式: ${}和#{}
     * ${}本质是字符拼接
     * #{}站位赋值
     * mybatis获取参数的各种情况
     */

    /**
     * 登录验证@Param
     */
    @Test
    public void testCheckLoginByParam(){
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        ParameterMapper mapper = sqlSession.getMapper(ParameterMapper.class);
        User user = mapper.checkLoginByParam("admin", "123");
        System.out.println(user);
    }

    /**
     * 添加用户信息
     */
    @Test
    public void testInsert(){
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        ParameterMapper mapper = sqlSession.getMapper(ParameterMapper.class);
        int rs = mapper.insert(new User(null, "王五", "123456", 23, "男", "123@qq.com"));
        System.out.println(rs);
    }

    @Test
    public void testCheckLoginByMap(){
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        ParameterMapper mapper = sqlSession.getMapper(ParameterMapper.class);
        Map<String ,Object> map=new HashMap<>();
        map.put("username","admin");
        map.put("password","123 ");
        User user = mapper.checkLoginMByMap(map);
        System.out.println(user);
    }

    @Test
    public void testCheckLogin(){
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        ParameterMapper mapper = sqlSession.getMapper(ParameterMapper.class);
        User user = mapper.checkLogin("admin", "123");
        System.out.println(user);

    }
    @Test
    public void testGetUsername(){
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        ParameterMapper mapper = sqlSession.getMapper(ParameterMapper.class);
        User user = mapper.getUserUsername("admin");
        System.out.println(user);
    }

    @Test
    public void testSelect() {
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        ParameterMapper mapper = sqlSession.getMapper(ParameterMapper.class);
        List<User> list = mapper.getAllUser();
        list.forEach(user -> System.out.println(user));
    }

    @Test
    public void testJDBC() throws Exception {
        String username = "admin";
        Class.forName("");
        Connection connection = DriverManager.getConnection("", "", "");
        PreparedStatement ps = connection.prepareStatement("select * from t_user where username=?");
        ps.setString(1, username);
    }

}
