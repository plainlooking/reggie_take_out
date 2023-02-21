package com.luo.mybatis.mapper;

import com.luo.mybatis.pojo.User;
import org.apache.ibatis.annotations.MapKey;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface SelectMapper {

    /**
     * 查询所有用户信息为map集合
     * 将表中的数据以map集合的方式查询，一条数据对应一个map；若有多条数据，就会产生多个map集合，
     * 并且最终要以一个map的方式返回数据，此时需要通过@MapKey注解设置map集合的键，
     * 值是每条数据所对应的map集合
     */
//    List<Map<String,Object>> getAllUserToMa();
    @MapKey("id")//以id为键,id是唯一的，不会重复
    Map<String ,Object> getAllUserToMa();

    /**
     * 根据用户id查询用户信息为一个mapp合集
     */
    Map<String, Object> getUserByIdToMap(@Param("id") Integer id);

    /**
     * ID查询用户信息
     */
    List<User> getUserByID(@Param("id") Integer id);

    /**
     * 查询所有用户
     */
    List<User> getAllUser();

    /**
     * 查询用户数量
     */
    Integer getCount();

}
