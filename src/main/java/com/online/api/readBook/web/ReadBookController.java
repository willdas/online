package com.online.api.readBook.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import com.online.api.readBook.service.ReadBookService;
import com.online.cms.cms.readBook.domain.ElectronBook;

/**
 * 在线阅读电子书Api
 * @author willdas
 *
 */
@Controller
@RequestMapping("/api")
public class ReadBookController {
	
	/**
	 * 查找所有电子书
	 * @return
	 */
	@Autowired
	private ReadBookService readBookService;
	@RequestMapping("/book/getAllBooks")
	public String getBooks(Model model){
		List<ElectronBook> listBooks = readBookService.findAll();
		model.addAttribute("listBooks", listBooks);
		return "html/index";
	}

}


