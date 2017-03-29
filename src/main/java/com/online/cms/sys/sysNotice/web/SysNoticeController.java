package com.online.cms.sys.sysNotice.web;

import java.util.Date;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.commons.util.DateFormat;
import com.online.cms.sys.sysNotice.domain.SysNotice;
import com.online.cms.sys.sysNotice.service.SysNoticeService;

/**
 * 网站公告Controller
 * @author willdas
 *
 */
@Controller
@RequestMapping("/sys")
public class SysNoticeController {

	@Autowired
	private SysNoticeService sysNoticeService;
	
	
	/**
	 * 查找所有公告
	 * @return
	 */
	@RequestMapping("/showSysNotice.html")
	public String getSysNotice(Map<String,Object> map){
		List<SysNotice> sysNoticeList = sysNoticeService.findAll();
		map.put("sysNoticeList",sysNoticeList);
		return "jsp/sysNotice/showSysNotice";
	}
	
	@RequestMapping("/intoAddSysNotice.html")
	public String intoAddSysNotice(){
		return "jsp/sysNotice/addSysNotice";
	}
	
	/**
	 * 添加公告
	 * @param sysNotice
	 * @return
	 */
	@RequestMapping(value="/addSysNotice.html",method=RequestMethod.POST)
	public String addSysNotice(SysNotice sysNotice,HttpSession httpSession){
		Object user = httpSession.getAttribute("user");
		sysNotice.setReleaseTime(new Date());
		sysNotice.setPublisher(String.valueOf(user));
		sysNoticeService.addSysNotice(sysNotice);
		return "redirect:/sys/showSysNotice.html";
	}
	
	@RequestMapping("/intoUpdateSysNotice/{id}.html")
	public String intoUpdateSysNotice(@PathVariable("id") Integer id,Model model){
		SysNotice sysNotice = sysNoticeService.findSysNoticeById(id);
		model.addAttribute("sysNotice", sysNotice);
		model.addAttribute("releaseTime", DateFormat.dateToString(sysNotice.getReleaseTime()));
		return "jsp/sysNotice/editSysNotice";
	}
	
	/**
	 * 修改公告
	 * @param sysNotice
	 * @return
	 */
	@RequestMapping(value="/updateSysNotice.html",method=RequestMethod.POST)
	public String updateSysNotice(SysNotice sysNotice,HttpSession session){
		Object attribute = session.getAttribute("user");
		sysNotice.setPublisher(String.valueOf(attribute));
		sysNotice.setReleaseTime(new Date());
		sysNoticeService.updateSysNotice(sysNotice);
		return "redirect:/sys/showSysNotice.html";
	}
}
