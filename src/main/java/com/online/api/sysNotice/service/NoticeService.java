package com.online.api.sysNotice.service;

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
	SysNotice getSysNotice(String type);
}
