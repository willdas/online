package com.online.cms.cms.service.impl;

import java.io.File;
import java.io.IOException;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.multipart.MultipartFile;
import com.online.cms.cms.dao.ElectronBookMapper;
import com.online.cms.cms.domain.ElectronBook;
import com.online.cms.cms.service.ElectronBookService;
import com.online.commons.util.FileUtil;

/**
 * 电子书Service实现类
 * @author willdas
 *
 */

@Service
@Transactional
public class ElectronBookServiceImpl implements ElectronBookService{

	@Autowired
	private ElectronBookMapper electronBookMapper;
	
	/**
	 * 查看所有电子书(分页)
	 */
	@Override
	public List<ElectronBook> eBooksList() {
		return null;
	}

	/**
	 * 添加电子书
	 */
	@Override
	public int save(ElectronBook eBook,MultipartFile filePdf) {
		if(!filePdf.isEmpty()){
			saveFile(eBook,filePdf);
		}
		System.out.println("====="+eBook);
		return electronBookMapper.insert(eBook);
	}

	/**
	 * 上传电子书
	 */
	public void saveFile(ElectronBook eBook,MultipartFile filePdf){
		// 获取文件名称
		String fileName = filePdf.getOriginalFilename();
		// 创建存储位置
		String filePath = File.separator + "root" + File.separator + "file" + File.separator + "pdf" + File.separator;
		System.out.println(filePath);
		// 存放文件的位置
		String pdfPath = filePath + fileName;
		try {
			// 创建文件夹
			FileUtil.createDir(pdfPath);
			// 上传文件
			filePdf.transferTo(new File(pdfPath));
		} catch (IllegalStateException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		eBook.setFilePath(pdfPath);
		eBook.setFileUrl("http://127.0.0.1:8080/" + pdfPath);
	}
	
	/**
	 * 更新电子书
	 */
	@Override
	public int update(ElectronBook eBook) {
		return electronBookMapper.updateByPrimaryKey(eBook);
	}

	/**
	 * 删除电子书
	 */
	@Override
	public int delete(String id) {
		return electronBookMapper.deleteByPrimaryKey(id);
	}

	/**
	 * 查找单个电子书
	 */
	@Override
	public ElectronBook getEBookById(String id) {
		return electronBookMapper.selectByPrimaryKey(id);
	}

	
}
