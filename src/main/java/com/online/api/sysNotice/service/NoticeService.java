package com.online.api.sysNotice.service;

import java.util.List;

import com.online.cms.sys.sysNotice.domain.SysNotice;

/**
 * 
 * @author wangzewen
 *
 */
public interface NoticeService {
	/**
	 * 系统公告
	 * @param type
	 * @return
	 * @throws Exception
	 */
	List<SysNotice> getSysNotice(String type);
}
