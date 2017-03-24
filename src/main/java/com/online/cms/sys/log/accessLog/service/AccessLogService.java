package com.online.cms.sys.log.accessLog.service;

import java.util.List;

import com.online.cms.sys.log.accessLog.domain.AccessLog;

/**
 * 访问日志记录Service
 * @author willdas
 *
 */
public interface AccessLogService {
	/**
	 * 查找所有日志
	 * @return
	 */
	List<AccessLog> findAll();
	
	/**
	 * 保存访问日志
	 * @param accessLog
	 */
	public void insertAccessLog(AccessLog accessLog);

	/**
	 * 修改访问记录
	 * @param accessLog
	 */
	public void updateAccessLog(AccessLog accessLog);
	
}
