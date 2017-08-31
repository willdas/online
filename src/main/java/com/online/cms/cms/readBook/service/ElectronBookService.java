package com.online.cms.cms.readBook.service;

import org.springframework.web.multipart.MultipartFile;
import com.commons.baseservice.BaseService;
import com.online.cms.cms.readBook.domain.ElectronBook;


/**
 * 电子书Service接口
 * @author willdas
 *
 */
public interface ElectronBookService extends BaseService<ElectronBook, String>{
	
	public int insertElectronBook(ElectronBook eBook,MultipartFile[] files,String ipAddress);
}
