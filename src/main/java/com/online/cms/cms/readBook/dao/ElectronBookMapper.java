package com.online.cms.cms.readBook.dao;

import java.util.List;

import com.online.cms.cms.readBook.domain.ElectronBook;

public interface ElectronBookMapper{

    int deleteByPrimaryKey(String id);

    int insert(ElectronBook record);

    int insertSelective(ElectronBook record);

    ElectronBook selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(ElectronBook record);

    int updateByPrimaryKey(ElectronBook record);

	List<ElectronBook> findAll();
}