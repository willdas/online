package com.commons.basemapper;

import java.io.Serializable;
import java.util.List;

/**
 * 公共Dao接口
 * @author willdas
 * @param <T>
 * @param <ID>
 */
public interface BaseMapper<T extends Serializable,ID extends Serializable> {
	int insert(T entity);
	int updateByPrimaryKey(T entity);
	T selectByPrimaryKey(ID id);
	List<T> findAll();
	int deleteByPrimaryKey(ID id);
	void deleteAll();
}
