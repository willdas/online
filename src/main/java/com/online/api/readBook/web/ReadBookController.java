package com.online.api.readBook.web;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import com.online.api.readBook.service.ReadBookService;
import com.online.cms.cms.readBook.domain.ElectronBook;

/**
 * 在线阅读电子书Api
 * @author willdas
 *
 */
@Controller
@RequestMapping("/book")
public class ReadBookController {
	
	/**
	 * 查找所有电子书
	 * @return
	 */
	@Autowired
	private ReadBookService readBookService;
	
	@RequestMapping("/read/EBooks.html")
	public String getBooks(String occupationName,Model model){
		String occupation = occupationName.toUpperCase();
		List<ElectronBook> EBooks = readBookService.findBookByType(occupation);
		model.addAttribute("listBooks", EBooks);
		return "html/index";
	}
}


