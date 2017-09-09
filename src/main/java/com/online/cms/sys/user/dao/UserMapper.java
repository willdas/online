package com.online.cms.sys.user.dao;

import org.apache.ibatis.annotations.Param;

import com.online.cms.sys.user.domain.User;

public interface UserMapper {
  
    int deleteByPrimaryKey(Integer id);

    int insert(User record);

    int insertSelective(User record);
    
    User login(@Param("email")String email,@Param("password")String password);

    User selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);
}