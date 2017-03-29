package com.online.cms.sys.sysNotice.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.online.cms.sys.sysNotice.dao.SysNoticeMapper;
import com.online.cms.sys.sysNotice.domain.SysNotice;
import com.online.cms.sys.sysNotice.service.SysNoticeService;

/**
 * 网站公告实现类
 * @author willdas
 */
@Service
public class SysNoticeServiceImpl implements SysNoticeService {

	@Autowired
	private SysNoticeMapper sysNoticeMapper;
	
	/**
	 * 查找所有公告
	 * @return
	 */
	@Override
	public List<SysNotice> findAll() {
		return sysNoticeMapper.selectAll();
	}
	
	/**
	 * 查找单个公告
	 * @param id
	 * @return
	 */
	@Override
	public SysNotice findSysNoticeById(Integer id) {
		return sysNoticeMapper.selectByPrimaryKey(id);
	}

	/**
	 * 修改公告
	 * @param sysNotice
	 * @return
	 */
	@Override
	public int updateSysNotice(SysNotice sysNotice) {
		return sysNoticeMapper.updateByPrimaryKey(sysNotice);
	}

	/**
	 * 删除公告
	 * @param id
	 * @return
	 */
	@Override
	public int delSysNotice(Integer id) {
		return sysNoticeMapper.deleteByPrimaryKey(id);
	}

	@Override
	public int addSysNotice(SysNotice sysNotice) {
		return sysNoticeMapper.insert(sysNotice);
	}

}
