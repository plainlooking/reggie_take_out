package com.luo.mybatis.mapper;

import com.luo.mybatis.pojo.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;


public interface ParameterMapper {

    /**
     * 登录验证@Param
     */
    User  checkLoginByParam(@Param("username") String username,@Param("password") String password);

    /**
     * 添加用户信息
     */
    int insert(User user);

    /**
     * 查询所有信息
     */
    List<User> getAllUser();

    /**
     * 根据用户名查询用户信息
     */
    User getUserUsername(String username);

    /**
     * 登录验证
     */
    User checkLogin(String username,String password);

    /**
     * 登录验证
     */
    User checkLoginMByMap(Map<String,Object>map);
}
