package com.online.cms.sys.user.service;

import java.util.List;

import com.online.cms.sys.role.domain.Role;
import com.online.cms.sys.user.domain.User;
import com.online.cms.sys.userRole.domain.UserRole;

/**
 * 用户管理Service接口
 * @author wangzewen
 *
 */
public interface UserService {
	int deleteByPrimaryKey(Integer id);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(Integer id);

    List<UserRole> selectRolesByUserName(String email);
    
    User login(String email,String password);
    
    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);
}
