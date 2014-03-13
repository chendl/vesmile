package com.vesmile.framework.server;

import java.io.Serializable;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import com.vesmile.framework.model.IPersistentObject;
import com.vesmile.framework.model.QueryResult;


public interface IBaseServer {

	public abstract void save(IPersistentObject pojo);

	public abstract void merge(IPersistentObject pojo);

	public abstract <T> T load(Serializable id, Class<T> objectClass);

	public abstract <T> T load(Serializable id, Class<T> objectClass,
			boolean isCreate);

	public abstract void remove(IPersistentObject pojo);

	public abstract <T> void remove(List<T> list);

	public abstract <T> List<T> findAll(Class<T> objectClass);

	public abstract <T> T findById(Integer id, Class<T> objectClass);

	public abstract <T> T findById(Serializable id, Class<T> objectClass);

	public abstract void update(IPersistentObject pojo);

	public abstract <T> void update(List<T> list);

	public abstract <T> void save(List<T> list);

	public abstract void refresh(IPersistentObject pojo);

	public abstract <T> List<T> findAllWithOrder(Class<T> objectClass, String orderField);

	public abstract <T> List<T> findByProperty(Class<T> objectClass, String propertyName,
			Object propertyValue);

	public abstract <T> void saveListAndRemoveList(List<T> saveList, List<T> removeList);

	public <T> List<T> findByNamedQuery(String queryName, Map<String, Object> queryParams);

	public <T> QueryResult<T> findPageData(Class<T> entityClass, int firstIndex, int maxResult,
			String wherejpql, Object[] queryParams, LinkedHashMap<String, String> orderby);

	public <T> QueryResult<T> findPageData(Class<T> entityClass, int firstIndex, int maxResult,
			String wherejpql, Object[] queryParams);

	public <T> QueryResult<T> findPageData(Class<T> entityClass, int firstIndex, int maxResult,
			LinkedHashMap<String, String> orderby);

	public <T> QueryResult<T> findPageData(Class<T> entityClass, int firstIndex, int maxResult);

	public <T> QueryResult<T> findPageData(Class<T> entityClass);

}