package com.xiaoqu.weixin.repositories;

import com.xiaoqu.weixin.models.Department;

public interface DepartmentMapper {
    int insert(Department record);

    int insertSelective(Department record);
}