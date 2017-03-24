package com.online.api.readBook.web;

import java.util.Date;
import java.util.List;
import java.util.Random;

import javax.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.commons.util.IPUtil;
import com.online.api.readBook.service.ReadBookService;
import com.online.cms.cms.readBook.domain.ElectronBook;
import com.online.cms.sys.log.accessLog.domain.AccessLog;
import com.online.cms.sys.log.accessLog.service.AccessLogService;

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
	
	@Autowired
	private AccessLogService accessService;
	
	@RequestMapping("/read/EBooks.html")
	public String getBooks(HttpServletRequest request,String occupationName,Model model){
		// 转换成大写
		String occupation = occupationName.toUpperCase();
		//获取ip地址
		String ipAddress = IPUtil.getIpAddress(request);
		AccessLog accessLog = new AccessLog();
		accessLog.setId(2222);
		accessLog.setUserId(111);
		accessLog.setUser("admin");
		accessLog.setIpAddress(ipAddress);
		accessLog.setStartTime(new Date());
		
		accessService.insertAccessLog(accessLog);
		System.out.println("----"+accessLog);
		
		
		List<ElectronBook> EBooks = readBookService.findBookByType(occupation);
		model.addAttribute("listBooks", EBooks);
		return "html/index";
	}
}


