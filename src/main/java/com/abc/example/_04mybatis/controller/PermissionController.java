package com.abc.example._04mybatis.controller;

import com.abc.example._04mybatis.domain.Permission;
import com.abc.example._04mybatis.service.IPermissionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * Created by lihj on 2019/10/26.
 */
@Controller

public class PermissionController {
    @Autowired
    private IPermissionService permissionService;
    @RequestMapping("/list")
    @ResponseBody
    public List<Permission> list(){
        return permissionService.selectAll();
    }
    @RequestMapping("/add")
    public void add(Long id,String name,String resource){
        Permission permission= new Permission();
        permission.setId(id);
        permission.setName(name);
        permission.setResource(resource);
        permissionService.insert(permission);
    }
}
