package com.luo.mybatis.mapper;

import com.luo.mybatis.pojo.Dept;
import org.apache.ibatis.annotations.Param;

public interface DeptMapper {
    /**
     * 通过分步查询，查询部门及对应的所有员工信息
     *  分步查询第一步：查询部门信息
     */
    Dept getDeptAndEmpByStepTow(@Param("did") Integer did);

    /**
     * 获取部门员工所有信息
     * @param did
     * @return
     */
    Dept getDeptAndEmpByStepOne(@Param("did") Integer did);

    /**
     * 通过分步查询，员工及所对应的部门信息
     *   分步查询第二步：通过did查询员工对应的部门信息
     */
    Dept getEmpAndDeptByStepTow(@Param("did") Integer did);

}
