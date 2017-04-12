package com.online.cms.sys.role.service;

import java.util.List;

import com.online.cms.sys.rolePermission.domain.RolePermission;

/**
 * 角色Service
 * @author wangzewen
 *
 */
public interface RoleService {
	
	/**
	 * 根据角色id查权限
	 * @param roleId
	 * @return
	 */
	public List<RolePermission> getPermissionsByRoleId(Integer roleId);
	
	
}
