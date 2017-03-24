package com.online.cms.sys.log.accessLog.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.online.cms.sys.log.accessLog.dao.AccessLogMapper;
import com.online.cms.sys.log.accessLog.domain.AccessLog;
import com.online.cms.sys.log.accessLog.service.AccessLogService;

/**
 * 访问日志记录Service实现类
 */
@Service
public class AccessLogServiceImpl implements AccessLogService {

	@Autowired
	private AccessLogMapper accessLogMapper;

	/**
	 * 查找所有日志
	 * @return
	 */
	@Override
	public List<AccessLog> findAll() {
		return accessLogMapper.selectAll();
	}

	/**
	 * 保存访问日志
	 * @param accessLog
	 */
	@Override
	public void insertAccessLog(AccessLog accessLog) {
		accessLogMapper.insert(accessLog);
	}

	/**
	 * 修改访问记录
	 * @param accessLog
	 */
	@Override
	public void updateAccessLog(AccessLog accessLog) {
		accessLogMapper.updateByPrimaryKey(accessLog);
	}

}
