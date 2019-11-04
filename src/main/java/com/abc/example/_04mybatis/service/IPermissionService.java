package com.abc.example._04mybatis.service;

import com.abc.example._04mybatis.domain.Permission;

import java.util.List;

/**
 * Created by lihj on 2019/10/26.
 */
public interface IPermissionService {
    List<Permission> selectAll();
    void insert(Permission permission);
}
