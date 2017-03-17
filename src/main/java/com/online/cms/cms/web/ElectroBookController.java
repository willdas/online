package com.online.cms.cms.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import com.online.cms.cms.domain.ElectronBook;
import com.online.cms.cms.service.ElectronBookService;


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
	 * 进入电子书展示页面
	 * @return
	 */
	@RequestMapping("/listEBook")
	public String listPage(){
		return "managePage/showEBook";
	}
	
	/**
	 * 添加电子书
	 * @return
	 */
	@RequestMapping("/addEBook")
	@ResponseBody
	public int addEBook(ElectronBook eBook){
		return electronBookService.save(eBook);
	}
	
	/**
	 * 删除电子书
	 * @param id
	 */
	@RequestMapping("/delEBook/{id}")
	@ResponseBody
	public void del(@PathVariable("id") String id){
		electronBookService.delete(id);
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

	/**
	 * 查找单个电子书
	 * @param id
	 * @return
	 */
	@RequestMapping("/getEBook/{id}")
	@ResponseBody
	public String getEBookById(@PathVariable("id") String id,Model model){
		ElectronBook eBook = electronBookService.getEBookById(id);
		model.addAttribute("eBook", eBook);
		return "mamager/details";
	}

	/**
	 * 分页电子书
	 * @param pageNum
	 * @param pageSize
	 * @param map
	 * @return
	 */
	/*
	@RequestMapping("/page/getEBooks")
	public String getEBook(Integer pageNum,Integer pageSize,Map<String,Object> map){
		System.out.println("sssss");
		pageNum = pageNum == null ? 1 : pageNum;
		pageSize = pageSize == null ? 10 : pageSize;
		PageHelper.startPage(pageNum,pageSize);
		List<ElectronBook> listEBooks = electroBookService.findAll();
		PageInfo<ElectronBook> eBookPage = UniversalPage.pageInfo(listEBooks);
		map.put("total",eBookPage.getPages());
		map.put("pageNum",eBookPage.getPageNum());
		map.put("eBookList",eBookPage.getList());
		
		return "jsp/managePage/showEBooks.jspmanagePage/showEBooks.jsp";
	}*/

}
