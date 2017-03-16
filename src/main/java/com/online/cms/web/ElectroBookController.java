package com.online.cms.web;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.online.cms.domain.ElectronBook;
import com.online.cms.service.ElectronBookService;

@Controller
@RequestMapping("/eBook")
public class ElectroBookController {
		
	@Autowired
	private ElectronBookService electronBookService;
	
	@RequestMapping("/addEBook")
	public String addEBook() throws ParseException{
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
		ElectronBook eBook1 = new ElectronBook();
		eBook1.setId("1111");
		eBook1.setAuthor("KK1111");
		eBook1.setBookName("java");
		eBook1.setPrice(24.8);
		eBook1.setType("java");
		ElectronBook eBook2 = new ElectronBook();
		eBook2.setId("2222");
		eBook2.setAuthor("KK22");
		eBook2.setBookName("PHP");
		eBook2.setPrice(23.2);
		eBook2.setType("PHP");
		ElectronBook eBook3 = new ElectronBook();
		eBook3.setId("3333");
		eBook3.setAuthor("KK33");
		eBook3.setBookName("HTML");
		eBook3.setPrice(23.3);
		eBook3.setType("HTML");
		ElectronBook eBook4 = new ElectronBook();
		eBook4.setId("4444");
		eBook4.setAuthor("KK44");
		eBook4.setBookName("SQL");
		eBook4.setPrice(25.8);
		eBook4.setType("SQL");
		electronBookService.save(eBook1);
		electronBookService.save(eBook2);
		electronBookService.save(eBook3);
		electronBookService.save(eBook4);
		return "addSuccess";
	}
	
	/**
	 * 删除电子书
	 * @param id
	 */
	@RequestMapping("/delEBook/{id}")
	public void del(@PathVariable("id") String id){
		int count = electronBookService.delete(id);
		System.err.println(count);
	}
	
	@RequestMapping("/updateEBook")
	@ResponseBody
	public int update(){
		int count = 0;
		try {
			SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
			ElectronBook eBook4 = new ElectronBook();
			eBook4.setId("444");
			eBook4.setAuthor("KK55");
			eBook4.setBookName("mySQL");
			eBook4.setPrice(25.8);
			eBook4.setType("SQL");
			count = electronBookService.update(eBook4);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return count;
	}

	@RequestMapping("/getEBook/{id}")
	@ResponseBody
	public ElectronBook getEBookById(@PathVariable("id") String id){
		ElectronBook eBook = electronBookService.getEBookById(id);
		System.out.println(eBook);
		return eBook;
	}

}
