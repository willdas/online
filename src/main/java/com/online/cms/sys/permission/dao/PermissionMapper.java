package com.online.cms.sys.permission.dao;

import com.online.cms.sys.permission.domain.Permission;

public interface PermissionMapper {
 
    int deleteByPrimaryKey(Integer id);

    int insert(Permission record);

    int insertSelective(Permission record);

    Permission selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Permission record);

    int updateByPrimaryKey(Permission record);
}