package com.online.cms.sys.rolePermission.dao;

import java.util.List;

import com.online.cms.sys.rolePermission.domain.RolePermission;

/**
 * 角色-权限关系 Dao
 * @author wangzewen
 *
 */
public interface RolePermissionMapper {

    int insert(RolePermission record);

    int insertSelective(RolePermission record);
    
    List<RolePermission> getPermissionsByRoleId(Integer roleId);

}