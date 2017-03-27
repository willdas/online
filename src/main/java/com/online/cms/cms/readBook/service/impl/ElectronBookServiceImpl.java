package com.online.cms.cms.readBook.service.impl;

import java.io.File;
import java.io.IOException;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.multipart.MultipartFile;
import com.online.cms.cms.readBook.dao.ElectronBookMapper;
import com.online.cms.cms.readBook.domain.ElectronBook;
import com.online.cms.cms.readBook.service.ElectronBookService;
import com.commons.util.FileUtil;

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
	public int save(ElectronBook eBook,MultipartFile[] files) {
		if(files != null && files.length > 0){
			for (int i = 0; i < files.length; i++) {
				MultipartFile file = files[i];
				if (!file.isEmpty()) {
					saveFile(eBook,file);
				}
			}
		}
		return electronBookMapper.insert(eBook);
	}

	/**
	 * 上传电子书
	 */
	public void saveFile(ElectronBook eBook,MultipartFile file){
		// 获取文件名称
		String fileType = file.getContentType();
		String fileName = file.getOriginalFilename();
		// 创建存储位置
		String filePath = "";
		// 存放文件的位置
		String path = "";
		if (fileType.startsWith("image")) {
			filePath = File.separator + "root" + File.separator + "file" + File.separator + "images" + File.separator;
			path = filePath + fileName;
			eBook.setImagePath(path);
			eBook.setImageUrl("http://127.0.0.1:8080" + path);
		}else if (fileType.startsWith("application")) {
			filePath = File.separator + "root" + File.separator + "file" + File.separator + "pdfs" + File.separator;
			path = filePath + fileName;
			eBook.setPdfPath(path);
			eBook.setPdfUrl("http://127.0.0.1:8080" + path);
		}
		try {
			// 创建文件夹
			FileUtil.createDir(path);
			// 上传文件
			file.transferTo(new File(path));
		} catch (IllegalStateException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
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

	/**
	 * 查找所有电子书
	 */
	@Override
	public List<ElectronBook> findAll(){
		return electronBookMapper.findAll();
	}

	
}
