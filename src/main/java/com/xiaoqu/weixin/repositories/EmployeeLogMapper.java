package com.xiaoqu.weixin.repositories;

import com.xiaoqu.weixin.models.EmployeeLog;

public interface EmployeeLogMapper {
    int insert(EmployeeLog record);

    int insertSelective(EmployeeLog record);


}