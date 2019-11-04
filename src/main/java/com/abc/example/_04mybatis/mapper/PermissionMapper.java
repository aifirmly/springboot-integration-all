package com.abc.example._04mybatis.mapper;
import com.abc.example._04mybatis.domain.Permission;

import java.util.List;

public interface  PermissionMapper {
    List<Permission> selectAll();
    void insert(Permission permission);
}