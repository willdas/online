package com.online.cms.sys.sysNotice.dao;

import java.util.List;

import com.online.cms.sys.sysNotice.domain.SysNotice;

/**
 * 网站公告Dao
 * @author willdas
 *
 */
public interface SysNoticeMapper{

    int deleteByPrimaryKey(Integer id);

    int insert(SysNotice record);

    int insertSelective(SysNotice record);

    SysNotice selectByPrimaryKey(Integer id);
    
    List<SysNotice> selectByType(String type);

    int updateByPrimaryKeySelective(SysNotice record);

    int updateByPrimaryKey(SysNotice record);

	List<SysNotice> selectAll();
}