package com.xiaoqu.weixin.services;

import com.xiaoqu.weixin.models.Employee;

public interface IEmployeeService {

    /**
     * findbyusername 通用用户名查找用户
     * @param username 用户名
     * @return 用户信息
     */
    public Employee getInfoByEmpname(String username);

    public Employee getInfoByEmpno(String code);


}

