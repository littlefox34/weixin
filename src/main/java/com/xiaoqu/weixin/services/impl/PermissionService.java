package com.xiaoqu.weixin.services.impl;

import com.xiaoqu.weixin.models.Permission;
import com.xiaoqu.weixin.repositories.PermissionMapper;
import com.xiaoqu.weixin.services.IPermissionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class PermissionService implements IPermissionService {

    @Autowired
    private PermissionMapper permissionMapper;

    @Override
    public List<Permission> getListByEmpno(String code) {
        return permissionMapper.selectByEmpno(code);
    }
}
