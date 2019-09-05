package com.xiaoqu.weixin.services.impl;

import com.xiaoqu.weixin.models.Employee;
import com.xiaoqu.weixin.repositories.EmployeeMapper;
import com.xiaoqu.weixin.services.IEmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService implements IEmployeeService {

    @Autowired
    private EmployeeMapper employeeMapper;

    @Override
    public Employee getInfoByEmpname(String username) {
        return employeeMapper.selectByEmpname(username);
    }

    @Override
    public Employee getInfoByEmpno(String code) {
        return employeeMapper.selectByEmpno(code);
    }



}
