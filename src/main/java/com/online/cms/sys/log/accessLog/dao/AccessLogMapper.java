package com.online.cms.sys.log.accessLog.dao;

import java.util.List;

import com.online.cms.sys.log.accessLog.domain.AccessLog;

/**
 * 访问日志记录Service实现类
 * @author willdas
 */
public interface AccessLogMapper {
    
	List<AccessLog> selectAll();
 	
	int deleteByPrimaryKey(Integer id);

    int insert(AccessLog record);

    int insertSelective(AccessLog record);

    AccessLog selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(AccessLog record);

    int updateByPrimaryKey(AccessLog record);
}