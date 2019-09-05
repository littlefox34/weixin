package com.xiaoqu.weixin.repositories;

import com.xiaoqu.weixin.models.Permission;

import java.util.List;

public interface PermissionMapper {
    int insert(Permission record);

    int insertSelective(Permission record);

    List<Permission> selectByEmpno(String code);
}