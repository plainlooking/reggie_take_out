package com.luo.mybatis.mapper;

import com.luo.mybatis.pojo.Emp;
import org.apache.ibatis.annotations.Param;

public interface CacheMapper {
    Emp EmpByEid(@Param("eid") Integer eid);

    int EmpByEid2(Emp emp);
}
