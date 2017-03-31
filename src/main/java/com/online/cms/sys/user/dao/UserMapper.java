package com.online.cms.sys.user.dao;

import com.online.cms.sys.user.domain.User;

public interface UserMapper {
  
    int deleteByPrimaryKey(Integer id);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);
}