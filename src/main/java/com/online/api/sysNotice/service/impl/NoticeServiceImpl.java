package com.online.api.sysNotice.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.online.api.sysNotice.service.NoticeService;
import com.online.cms.sys.sysNotice.dao.SysNoticeMapper;
import com.online.cms.sys.sysNotice.domain.SysNotice;

/**
 * 系统公告实现类
 * @author wangzewen
 *
 */
@Service
public class NoticeServiceImpl implements NoticeService{
	
	@Autowired
	private SysNoticeMapper sysNoticeMapper;
	
	/**
	 * 查询系统公告
	 */
	@Override
	public SysNotice getSysNotice(String type){
		return sysNoticeMapper.selectByType(type);
	}

}
