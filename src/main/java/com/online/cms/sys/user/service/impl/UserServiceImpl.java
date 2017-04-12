package com.online.cms.sys.user.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.online.cms.sys.user.dao.UserMapper;
import com.online.cms.sys.user.domain.User;
import com.online.cms.sys.user.service.UserService;
import com.online.cms.sys.userRole.dao.UserRoleMapper;
import com.online.cms.sys.userRole.domain.UserRole;

/**
 * 用户管理Service实现类
 * @author wangzewen
 *
 */
@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserRoleMapper userRoleMapper;
	
	@Autowired
	private UserMapper userMapper;
	
	@Override
	public User selectByPrimaryKey(Integer id) {
		return null;
	}

	/**
	 * 查询用户所有角色
	 * @param userName
	 * @return
	 */
	@Override
	public List<UserRole> selectRolesByUserName(String email) {
		return userRoleMapper.getRoleNamesByUserName(email);
	}
	
	/**
	 * 查询用户信息
	 */
	@Override
	public User login(String eamil,String password) {
		return userMapper.login(eamil,password);
	}
	
	@Override
	public int deleteByPrimaryKey(Integer id) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int insert(User record) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int insertSelective(User record) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int updateByPrimaryKeySelective(User record) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int updateByPrimaryKey(User record) {
		// TODO Auto-generated method stub
		return 0;
	}

	


}
