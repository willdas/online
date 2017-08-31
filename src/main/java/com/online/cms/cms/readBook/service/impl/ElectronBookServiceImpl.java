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
import com.commons.basemapper.BaseMapper;
import com.commons.baseservice.BaseServiceImpl;
import com.commons.util.FileUtil;

/**
 * 电子书Service实现类
 * @author willdas
 *
 */

@Service
@Transactional
public class ElectronBookServiceImpl extends BaseServiceImpl<ElectronBook, String> implements ElectronBookService{

	@Autowired
	private ElectronBookMapper electronBookMapper;

	@Override
	protected BaseMapper<ElectronBook, String> baseMapper() {
		return electronBookMapper;
	}
	
	/**
	 * 添加电子书
	 */
	@Override
	public int insertElectronBook(ElectronBook eBook,MultipartFile[] files,String ipAddress) {
		if(files != null && files.length > 0){
			for (int i = 0; i < files.length; i++) {
				MultipartFile file = files[i];
				if (!file.isEmpty()) {
					saveFile(eBook,file,ipAddress);
				}
			}
		}
		return electronBookMapper.insert(eBook);
	}

	/**
	 * 上传电子书
	 */
	public void saveFile(ElectronBook eBook,MultipartFile file,String ipAddress){
		// 获取文件名称
		String fileType = file.getContentType();
		String fileName = file.getOriginalFilename();
		String imageUrl = ipAddress + fileName;
		// 创建存储位置
		String filePath = "";
		// 存放文件的位置
		String path = "";
		if (fileType.startsWith("image")) {
			filePath =  File.separator + "files" + File.separator + "images" + File.separator;
			path = filePath + fileName;
			eBook.setImagePath(path);
			eBook.setImageUrl(imageUrl);
		}else if (fileType.startsWith("application")) {
			filePath = File.separator + "files" + File.separator + "pdfs" + File.separator;
			path = filePath + fileName;
			eBook.setPdfPath(path);
			eBook.setPdfUrl(imageUrl);
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

}
