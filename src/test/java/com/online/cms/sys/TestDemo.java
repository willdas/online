package com.online.cms.sys;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.online.cms.sys.sysNotice.domain.SysNotice;
import com.online.cms.sys.sysNotice.service.SysNoticeService;


@RunWith(SpringJUnit4ClassRunner.class) //表示继承了SpringJUnit4ClassRunner类
@ContextConfiguration(locations = "classpath:spring-mybatis.xml")
public class TestDemo {
	
	@Autowired
	private SysNoticeService sysNoticeService;
	
	@Test	
	public void getAll(){
		
		List<SysNotice> findAll = sysNoticeService.findAll();
		System.out.println(findAll);
	}
}
