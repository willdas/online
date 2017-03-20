package com.online.cms.cms;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.online.cms.cms.domain.ElectronBook;
import com.online.cms.cms.service.ElectronBookService;

import java.io.File;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;

import org.apache.log4j.Logger;

@RunWith(SpringJUnit4ClassRunner.class) //表示继承了SpringJUnit4ClassRunner类
@ContextConfiguration(locations = "classpath:spring-mybatis.xml")
public class TestDemo {
	
	private static Logger logger = Logger.getLogger(TestDemo.class);
	
	@Autowired
	private ElectronBookService electronBookService;
	
	
	@Test
	public void eBookPage(){
		PageHelper.startPage(1,10);
		List<ElectronBook> eBookList = electronBookService.findAll();
		PageInfo<ElectronBook> info = new PageInfo<ElectronBook>(eBookList);
		System.out.println(info.getList());
	}
	
	
	@Test
	public void addEBook() throws ParseException{
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
		ElectronBook eBook = new ElectronBook();
		eBook.setId("343424");
		eBook.setAuthor("sssSSSS");
		eBook.setBookName("HTML");
		eBook.setPrice(23.7);
		eBook.setType("HTML");
		eBook.setPublishDate(dateFormat.parse("2014-03-22"));
		//electronBookService.save(eBook,filePdf);
	}
	
	@Test
	public void del(){
		int count = electronBookService.delete("76563634");
		System.err.println(count);
	}
	
	@Test
	public void update() throws ParseException{
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
		ElectronBook eBook = new ElectronBook();
		eBook.setId("1111111111");
		eBook.setAuthor("AAAAAAAAA");
		eBook.setBookName("HTML");
		eBook.setPrice(23.7);
		eBook.setType("HTML");
		eBook.setPublishDate(dateFormat.parse("2014-03-22"));
		electronBookService.update(eBook);
	}
	
	@Test
	public void getEBookById(){
		ElectronBook eBook = electronBookService.getEBookById("241422421");
		System.out.println(eBook);
	}
	
}
