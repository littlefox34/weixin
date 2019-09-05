package com.xiaoqu.weixin.repositories;

import com.xiaoqu.weixin.models.Employee;

public interface EmployeeMapper {
    int insert(Employee record);

    int insertSelective(Employee record);

    Employee selectByEmpname(String username);

    Employee selectByEmpno(String code);
}