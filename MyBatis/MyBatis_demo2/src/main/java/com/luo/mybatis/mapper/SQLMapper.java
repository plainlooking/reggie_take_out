package com.luo.mybatis.mapper;

import com.luo.mybatis.pojo.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface SQLMapper {
    /**
     *添加用户信息
     */
    void insert(User user);
    /**
     * 查询指定表中的数据
     */
    List<User> getUserByTable(@Param("TableName") String TableName);
    /**
     * 批量删除
     */
    int deleteMore(@Param("ids") String ids);

    /**
     * 根据用户名进行模糊查询
     */
    List<User> getUserByLike(@Param("username")String username);


}
