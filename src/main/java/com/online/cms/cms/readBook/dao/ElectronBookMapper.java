package com.online.cms.cms.readBook.dao;

import java.util.List;
import com.commons.basemapper.BaseMapper;
import com.online.cms.cms.readBook.domain.ElectronBook;

/**
 * 电子书Dao
 * @author willdas
 *
 */
public interface ElectronBookMapper extends BaseMapper<ElectronBook, String>{
	List<ElectronBook> findBookByType(String type);  
}