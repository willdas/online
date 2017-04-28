package com.online.api.sysNotice;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.online.api.sysNotice.service.NoticeService;
import com.online.cms.sys.sysNotice.domain.SysNotice;


@RunWith(SpringJUnit4ClassRunner.class) //表示继承了SpringJUnit4ClassRunner类
@ContextConfiguration(locations = "classpath:spring-servlet.xml")
//@ContextConfiguration(locations = {"classpath:spring-servlet.xml"})
public class TestSysNotice {
	
	@Autowired
	private NoticeService noticeService;
	
	@Test
	public void getSysNotice(){
		String noticeContent = noticeService.getSysNotice("通知").getNoticeContent();
		System.out.println(noticeContent);
	}
}
