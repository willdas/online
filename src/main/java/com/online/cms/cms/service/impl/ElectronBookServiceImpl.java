package com.online.cms.cms.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.online.cms.cms.dao.ElectronBookMapper;
import com.online.cms.cms.domain.ElectronBook;
import com.online.cms.cms.service.ElectronBookService;


@Service
@Transactional
public class ElectronBookServiceImpl implements ElectronBookService{

	@Autowired
	private ElectronBookMapper electronBookMapper;
	
	@Override
	public List<ElectronBook> eBooksList() {
		return null;
	}

	@Override
	public int save(ElectronBook eBook) {
		return electronBookMapper.insert(eBook);
	}

	@Override
	public int update(ElectronBook eBook) {
		return electronBookMapper.updateByPrimaryKey(eBook);
	}

	@Override
	public int delete(String id) {
		return electronBookMapper.deleteByPrimaryKey(id);
	}

	@Override
	public ElectronBook getEBookById(String id) {
		return electronBookMapper.selectByPrimaryKey(id);
	}
	
}
