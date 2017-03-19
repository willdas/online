package com.online.commons.util;

import java.util.List;
import com.github.pagehelper.PageInfo;


/**
 * 分页工具类
 * @author willdas
 *
 */
public class UniversalPage {
	
	public static <T> PageInfo<T> pageInfo(List<T> listInfo){
		/*
		 * 使用page 封装
		 */
		PageInfo<T> page = new PageInfo<T>(listInfo);
		return page;	
	}

}
