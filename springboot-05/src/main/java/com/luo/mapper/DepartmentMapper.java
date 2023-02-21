package com.luo.mapper;

import com.luo.pojo.Department;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

//@Mapper : 表示本类是一个 MyBatis 的 Mapper
@Mapper
@Repository
public interface DepartmentMapper {
    //查询所有
    List<Department> getDepartments();
    //通过id查询
    Department getDepartment(Integer id);
    //增
    int add(Department department);
    //改
    int update(Department department);
    //删除
    int delete(Integer id);
}
