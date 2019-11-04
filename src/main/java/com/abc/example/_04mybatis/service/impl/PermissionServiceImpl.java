package com.abc.example._04mybatis.service.impl;

import com.abc.example._04mybatis.domain.Permission;
import com.abc.example._04mybatis.mapper.PermissionMapper;
import com.abc.example._04mybatis.service.IPermissionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by lihj on 2019/10/26.
 */
@Service
public class PermissionServiceImpl implements IPermissionService {
    @Autowired
    private PermissionMapper permissionMapper;
    @Override
    public List<Permission> selectAll() {
        return permissionMapper.selectAll();
    }

    @Override
    public void insert(Permission permission) {
        permissionMapper.insert(permission);
    }
}
