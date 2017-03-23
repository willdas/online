package com.online.api.readBook.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.online.api.readBook.service.ReadBookService;
import com.online.cms.cms.readBook.dao.ElectronBookMapper;
import com.online.cms.cms.readBook.domain.ElectronBook;

/**
 * 在线阅读电子书Service业务实现类
 * @author willdas
 *
 */
@Service
@Transactional
public class ReadBookServiceImpl implements ReadBookService{

	@Autowired
	private ElectronBookMapper electronBookMapper;
	
	/**
	 * 查找电子书
	 */
	@Override
	public List<ElectronBook> findAll() {
		return electronBookMapper.findAll();
	}
	/**
	 * 根据类型查找电子书
	 * @param name
	 */
	@Override
	public List<ElectronBook> findBookByType(String type) {
		return electronBookMapper.findBookByType(type);
	}
}
