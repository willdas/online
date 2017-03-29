package com.online.cms.sys.sysNotice.service;

import java.util.List;
import com.online.cms.sys.sysNotice.domain.SysNotice;

/**
 * 网站公告Service接口
 * @author willdas
 *
 */
public interface SysNoticeService {
	
	/**
	 * 查找所有公告
	 * @return
	 */
	List<SysNotice> findAll();
	
	/**
	 * 查找单个公告
	 * @param id
	 * @return
	 */
	SysNotice findSysNoticeById(Integer id);
	
	/**
	 * 添加公告
	 * @param sysNotice
	 * @return
	 */
	public int addSysNotice(SysNotice sysNotice);
	
	/**
	 * 修改公告
	 * @param sysNotice
	 * @return
	 */
	public int updateSysNotice(SysNotice sysNotice);
	
	/**
	 * 删除公告
	 * @param id
	 * @return
	 */
	public int delSysNotice(Integer id);
}
