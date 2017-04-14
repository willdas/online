package com.online.cms.cms.readBook.web;

import java.io.File;
import java.util.List;
import java.util.Map;
import javax.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.online.cms.cms.readBook.domain.ElectronBook;
import com.online.cms.cms.readBook.service.ElectronBookService;
import com.commons.util.DateFormat;
import com.commons.util.FileUtil;
import com.commons.util.UniversalPage;

	
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
	@RequestMapping("/intoAddEBookPage.do")
	public String addEBookPage(){
		return "jsp/managePage/addEBook";
	}
	
	/**
	 * 分页电子书
	 * @param pageNum
	 * @param pageSize
	 * @param map
	 * @return
	 */
	@RequestMapping("/page/getEBooks.do")
	public String getEBook(Integer pageNum,Integer pageSize,Map<String,Object> map,HttpServletRequest request){
		pageNum = pageNum == null ? 1 : pageNum;
		pageSize = pageSize == null ? 10 : pageSize;
		PageHelper.startPage(pageNum,pageSize);
		List<ElectronBook> listEBooks = electronBookService.findAll();
		PageInfo<ElectronBook> eBookPage = UniversalPage.pageInfo(listEBooks);
		Integer visiblePages = eBookPage.getPages() <= 3 ? eBookPage.getPages() : 3;
		request.setAttribute("pageNum", pageNum);
	    request.setAttribute("totalPages",eBookPage.getPages());
	    request.setAttribute("visiblePages",visiblePages);
	    request.setAttribute("firstPage", eBookPage.getFirstPage());
	    request.setAttribute("lastPage", eBookPage.getLastPage());
	    request.setAttribute("upPage",pageNum-1);
	    request.setAttribute("nextPage", eBookPage.getNextPage());
		map.put("eBookList",eBookPage.getList());
		return "jsp/managePage/showEBook";
	}

	/**
	 * 添加电子书
	 * @return
	 */
	@RequestMapping("/addEBook.do")
	public String addEBook(ElectronBook eBook,@RequestParam MultipartFile[] files,HttpServletRequest request){
		// 获取域名地址
		String ipAddress = request.getScheme()+"://"+ request.getServerName() + "/"; 
		electronBookService.save(eBook,files,ipAddress);
		return "redirect:/eBook/page/getEBooks.do";
	}
	
	/**
	 * 删除电子书
	 * @param id
	 */
	@SuppressWarnings("unused")
	@RequestMapping("/delEBook/{id}.do")
	public String delEBook(@PathVariable("id") String id){
		String filePath = electronBookService.getEBookById(id).getPdfPath();
		if(!filePath.equals(" ") || filePath != null || "null".equals(filePath)){
			FileUtil.deleteFile(new File("H:"+filePath));
			electronBookService.delete(id);
		}else{
			electronBookService.delete(id); 
		}
		return "redirect:/eBook/page/getEBooks.do";
	}
	
	/**
	 * 进入修改电子书页面
	 * @return
	 */
	@RequestMapping("/intoUpdateEBookPage/{id}.do")
	public String intoUpdateEBookPage(@PathVariable("id") String id,Model model){
		ElectronBook eBook = electronBookService.getEBookById(id);
		model.addAttribute("publishDate",DateFormat.dateToString(eBook.getPublishDate()));
		model.addAttribute("eBook",eBook);
		return "jsp/managePage/editEBook";
	}
	/**
	 * 修改电子书
	 * @return
	 */
	@RequestMapping("/updateEBook.do")
	@ResponseBody
	public int update(ElectronBook eBook){
		return electronBookService.update(eBook);
	}
}
