package com.commons.baseservice;

import java.io.Serializable;
import java.util.List;


/**
 * 公共Service接口
 * @author willdas
 * @param <T>
 * @param <ID>
 */
public interface BaseService<T extends Serializable,ID extends Serializable> {
	int insert(T entity);
	int updateByPrimaryKey(T entity);
	List<T> findAll();
	T selectByPrimaryKey(ID id);
	int deleteByPrimaryKey(ID id);
	void deleteAll();
}
