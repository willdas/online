package com.online.cms.sys.role.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.online.cms.sys.role.service.RoleService;
import com.online.cms.sys.rolePermission.dao.RolePermissionMapper;
import com.online.cms.sys.rolePermission.domain.RolePermission;

/**
 * 角色 Service实现类
 * @author wangzewen
 *
 */
@Service
@Transactional
public class RoleServiceImpl implements RoleService {

	@Autowired
	private RolePermissionMapper rolePermissionMapper;
	
	/**
	 * 根据角色id 查 权限
	 */
	@Override
	public List<RolePermission> getPermissionsByRoleId(Integer roleId) {
		return rolePermissionMapper.getPermissionsByRoleId(roleId);
	}

}
