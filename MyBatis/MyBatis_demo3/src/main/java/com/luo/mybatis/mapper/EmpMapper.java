package com.luo.mybatis.mapper;

import com.luo.mybatis.pojo.Emp;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface EmpMapper {
    /**
     * 通过分步查询，查询部门及对应的所有员工信息
     *  分步查询第一步：查询部门信息
     */
    List<Emp> getDeptAndEmpByStepTow1(@Param("did") Integer did);

    /**
     * 通过分布查询查询员工以及员工所对应的部门信息
     * 分页查询第一步；查询员工信息
     */
    Emp getEmpAndDeptByStepOne(@Param("eid") Integer eid);

    /**
     * 查询所有员工数据
     */
    List<Emp> getAllEmp();

    /**
     * 查询员工以及部门信息
     */
    Emp getEmpAndDept(@Param("eid") Integer eid);
}
