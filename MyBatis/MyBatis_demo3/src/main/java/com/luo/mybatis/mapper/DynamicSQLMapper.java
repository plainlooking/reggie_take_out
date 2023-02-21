package com.luo.mybatis.mapper;

import com.luo.mybatis.pojo.Emp;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface DynamicSQLMapper {
    /**
     * 通过数组批量添加
     */
    int insertMoreList(@Param("emps") List<Emp> emp);

    /**
     * 通过数组批量删除
     */
    int deleteMoreByArray(@Param("eids") Integer[] eids);

    /**
     * 测试choose,when,otherwise
     */
    List<Emp> Choose(Emp emp);

    /**
     * 多条件查询
     */
    List<Emp> getEmpByCondition(Emp emp);

}
