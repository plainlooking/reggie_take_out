package com.luo.controller;

import com.luo.mapper.DepartmentMapper;
import com.luo.pojo.Department;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class DepartmentController {
    @Autowired
    private DepartmentMapper departmentMapper;

    @GetMapping("/getDepartments")
    public List<Department> getDepartments(){
        List<Department> departments = departmentMapper.getDepartments();
        for (Department department : departments) {
            System.out.println(department);
        }
        return departments;
    }
}
