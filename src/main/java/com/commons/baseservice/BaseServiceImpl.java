package com.commons.baseservice;

import java.io.Serializable;
import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import com.commons.basemapper.BaseMapper;

/**
 * 抽象公共Service实现类
 * @author willdas
 * @param <T>
 * @param <ID>
 */
@Transactional
public abstract class BaseServiceImpl<T extends Serializable,ID extends Serializable> implements BaseService<T,ID>{
	protected abstract  BaseMapper<T,ID> baseMapper();
	
	@Override
	public int insert(T entity){
		return baseMapper().insert(entity);
	}
	@Override
	public int deleteByPrimaryKey(ID id){
		return baseMapper().deleteByPrimaryKey(id);
	}
	@Override
	public int updateByPrimaryKey(T entity){
		return baseMapper().updateByPrimaryKey(entity);
	}
	@Override
	public T selectByPrimaryKey(ID id){
		return baseMapper().selectByPrimaryKey(id);
	}
	@Override
	public List<T> findAll(){
		return baseMapper().findAll();
	}
	@Override
	public void deleteAll(){
		baseMapper().deleteAll();
	}
}
