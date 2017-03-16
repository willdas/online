package com.online.cms.cms.web;

import java.text.ParseException;
import java.util.Date;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import com.online.cms.cms.domain.ElectronBook;
import com.online.cms.cms.service.ElectronBookService;
import com.online.commons.util.DateFormat;


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
	public String addEBook(HttpServletRequest request,ElectronBook eBook){
		try {
			String price = request.getParameter("price");
			String date = request.getParameter("publishDate");
			eBook.setPrice(Double.valueOf(price));
			eBook.setPublishDate(DateFormat.stringToDate(date));
			System.out.println("=="+eBook);
			electronBookService.save(eBook);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return "managePage/showEBook";
	}
	
	/**
	 * 删除电子书
	 * @param id
	 */
	@RequestMapping("/delEBook/{id}")
	@ResponseBody
	public void del(@PathVariable("id") String id){
		int count = electronBookService.delete(id);
		System.err.println(count);
	}
	
	/**
	 * 修改电子书
	 * @return
	 */
	@RequestMapping("/updateEBook")
	@ResponseBody
	public int update(){
		int count = 0;
		try {
			ElectronBook eBook4 = new ElectronBook();
			eBook4.setId("444");
			eBook4.setAuthor("KK55");
			eBook4.setBookName("mySQL");
			eBook4.setPrice(25.8);
			eBook4.setType("SQL");
			Date date = DateFormat.stringToDate("2013-03-22");
			eBook4.setPublishDate(date);
			count = electronBookService.update(eBook4);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return count;
	}

	/**
	 * 查找电子书
	 * @param id
	 * @return
	 */
	@RequestMapping("/getEBook/{id}")
	@ResponseBody
	public ElectronBook getEBookById(@PathVariable("id") String id){
		ElectronBook eBook = electronBookService.getEBookById(id);
		return eBook;
	}

}
