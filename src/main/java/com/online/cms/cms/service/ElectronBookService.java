package com.online.cms.cms.service;

import java.util.List;

import org.springframework.web.multipart.MultipartFile;

import com.online.cms.cms.domain.ElectronBook;


/**
 * 电子书Service接口
 * @author willdas
 *
 */
public interface ElectronBookService{
	
	public ElectronBook getEBookById(String id);
	
	public List<ElectronBook> eBooksList();
	
	public int save(ElectronBook eBook,MultipartFile filePdf);
	
	public int update(ElectronBook eBook);
	
	public int delete(String id);
	
}
