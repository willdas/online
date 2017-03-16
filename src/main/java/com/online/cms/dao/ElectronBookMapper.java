package com.online.cms.dao;

import com.online.cms.domain.ElectronBook;

public interface ElectronBookMapper {

    int deleteByPrimaryKey(String id);

    int insert(ElectronBook record);

    int insertSelective(ElectronBook record);

    ElectronBook selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(ElectronBook record);

    int updateByPrimaryKey(ElectronBook record);
}