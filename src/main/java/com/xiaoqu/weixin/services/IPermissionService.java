package com.xiaoqu.weixin.services;

import com.xiaoqu.weixin.models.Permission;

import java.util.List;

public interface IPermissionService {

    List<Permission> getListByEmpno(String code);
}
