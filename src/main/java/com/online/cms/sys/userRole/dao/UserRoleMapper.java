package com.online.cms.sys.userRole.dao;

import com.online.cms.sys.userRole.domain.UserRole;
import java.util.List;

/**
 * 用户-角色 关系表Dao
 * @author wangzewen
 *
 */
public interface UserRoleMapper {

    int insert(UserRole record);

    int insertSelective(UserRole record);

    List<UserRole> getRoleNamesByUserName(String email);
}