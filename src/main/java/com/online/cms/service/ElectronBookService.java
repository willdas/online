package com.online.cms.service;

import java.util.List;

import com.online.cms.domain.ElectronBook;

public interface ElectronBookService {
	
	public ElectronBook getEBookById(String id);
	
	public List<ElectronBook> eBooksList();
	
	public int save(ElectronBook eBook);
	
	public int update(ElectronBook eBook);
	
	public int delete(String id);
	
	
}
