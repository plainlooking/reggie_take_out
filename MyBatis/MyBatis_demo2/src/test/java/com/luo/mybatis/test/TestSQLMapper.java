package com.luo.mybatis.test;

import com.luo.mybatis.mapper.SQLMapper;
import com.luo.mybatis.pojo.User;
import com.luo.mybatis.utils.SqlSessionUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

public class TestSQLMapper {
    @Test
    public void testInsert(){
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        SQLMapper mapper = sqlSession.getMapper(SQLMapper.class);
        User user = new User(null, "余斌", "123", 21, "男", "123@163.com");
        mapper.insert(user);
        System.out.println(user);
    }
    @Test
    public void testGetUserByTable(){
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        SQLMapper mapper = sqlSession.getMapper(SQLMapper.class);
        System.out.println(mapper.getUserByTable("t_user"));
    }
    @Test
    public void DeleteMore() {
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        SQLMapper mapper = sqlSession.getMapper(SQLMapper.class);
        System.out.println(mapper.deleteMore("6,5,7"));
    }

    @Test
    public void getUserByLike() {
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        SQLMapper mapper = sqlSession.getMapper(SQLMapper.class);
        System.out.println(mapper.getUserByLike("李四"));
    }
}
