package com.online.cms.cms.web;

import java.io.File;
import java.util.Date;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.online.cms.cms.domain.ElectronBook;
import com.online.cms.cms.service.ElectronBookService;
import com.online.commons.util.DateFormat;
import com.online.commons.util.FileUtil;
import com.online.commons.util.UniversalPage;


/**
 * 电子书后台管理
 * @author willdas
 *
 */
@Controller
@RequestMapping("/eBook")
public class ElectroBookController {
		
	@Autowired
	private ElectronBookService electronBookService;
	
	/**
	 * 进入添加电子书页面
	 * @return
	 */
	@RequestMapping("/intoAddEBookPage")
	public String addEBookPage(){
		return "managePage/addEBook";
	}
	
	/**
	 * 分页电子书
	 * @param pageNum
	 * @param pageSize
	 * @param map
	 * @return
	 */
	@RequestMapping("/page/getEBooks")
	public String getEBook(Integer pageNum,Integer pageSize,Map<String,Object> map){
		pageNum = pageNum == null ? 1 : pageNum;
		pageSize = pageSize == null ? 10 : pageSize;
		PageHelper.startPage(pageNum,pageSize);
		List<ElectronBook> listEBooks = electronBookService.findAll();
		PageInfo<ElectronBook> eBookPage = UniversalPage.pageInfo(listEBooks);
		map.put("total",eBookPage.getPages());
		map.put("pageNum",eBookPage.getPageNum());
		map.put("eBookList",eBookPage.getList());
		map.put("listEBooks", listEBooks);
		return "managePage/showEBook";
	}

	/**
	 * 添加电子书
	 * @return
	 */
	@RequestMapping("/addEBook")
	public String addEBook(ElectronBook eBook,MultipartFile filePdf){
		electronBookService.save(eBook,filePdf);
		return "redirect:/eBook/page/getEBooks";
	}
	
	/**
	 * 删除电子书
	 * @param id
	 */
	@RequestMapping("/delEBook/{id}")
	public String delEBook(@PathVariable("id") String id){
		String filePath = electronBookService.getEBookById(id).getFilePath();
		if(!filePath.equals(" ") || filePath != null || "null".equals(filePath)){
			FileUtil.deleteFile(new File("H:"+filePath));
			electronBookService.delete(id);
		}
		return "redirect:/eBook/page/getEBooks";
	}
	
	/**
	 * 进入修改电子书页面
	 * @return
	 */
	@RequestMapping("/intoUpdateEBookPage/{id}")
	public String intoUpdateEBookPage(@PathVariable("id") String id,Model model,HttpServletRequest request){
		ElectronBook eBook = electronBookService.getEBookById(id);
		model.addAttribute("publishDate",DateFormat.dateToString(eBook.getPublishDate()));
		model.addAttribute("eBook",eBook);
		return "managePage/editEBook";
	}
	/**
	 * 修改电子书
	 * @return
	 */
	@RequestMapping("/updateEBook")
	@ResponseBody
	public int update(ElectronBook eBook){
		return electronBookService.update(eBook);
	}
}
