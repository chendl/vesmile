package com.vesmile.framework.server.impl;

import java.io.Serializable;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import com.vesmile.framework.dao.BaseDao;
import com.vesmile.framework.model.IPersistentObject;
import com.vesmile.framework.model.QueryResult;
import com.vesmile.framework.server.IBaseServer;

public class BaseServer implements IBaseServer {
	private BaseDao baseDao;
	
	public void setBaseDao(BaseDao baseDao) {
		this.baseDao = baseDao;
	}

	/* (non-Javadoc)
	 * @see com.suncreate.emcgate.server.impl.IBaseServer#save(com.suncreate.emcgate.model.PersistentObject)
	 */
	public void save(IPersistentObject pojo) {
		if (pojo.getKey() == null)
			baseDao.save(pojo);
		else
			baseDao.merge(pojo);
	}

	/* (non-Javadoc)
	 * @see com.suncreate.emcgate.server.impl.IBaseServer#merge(com.suncreate.emcgate.model.PersistentObject)
	 */
	public void merge(IPersistentObject pojo) {
		baseDao.merge(pojo);
	}

	/* (non-Javadoc)
	 * @see com.suncreate.emcgate.server.impl.IBaseServer#load(java.io.Serializable, java.lang.Class)
	 */
	public <T> T load(Serializable id, Class<T> objectClass) {
		return load(id, objectClass, true);
	}

	/* (non-Javadoc)
	 * @see com.suncreate.emcgate.server.impl.IBaseServer#load(java.io.Serializable, java.lang.Class, boolean)
	 */
	public <T> T load(Serializable id, Class<T> objectClass,
			boolean isCreate) {
		if (id == null) {
			try {
				if (isCreate)
					return (T) objectClass.newInstance();
				else
					return null;
			} catch (InstantiationException e) {
				throw new RuntimeException(e.getCause());
			} catch (IllegalAccessException e) {
				throw new RuntimeException(e.getCause());
			}
		}
		return baseDao.load(id, objectClass);
	}

	/* (non-Javadoc)
	 * @see com.suncreate.emcgate.server.impl.IBaseServer#remove(com.suncreate.emcgate.model.PersistentObject)
	 */
	public void remove(IPersistentObject pojo) {
		baseDao.delete(pojo);
	}

	/* (non-Javadoc)
	 * @see com.suncreate.emcgate.server.impl.IBaseServer#remove(java.util.List)
	 */
	public <T> void remove(List<T> list) {
		for (int i = 0; i < list.size(); i++) {
			baseDao.delete((IPersistentObject) list.get(i));
		}
	}

	/* (non-Javadoc)
	 * @see com.suncreate.emcgate.server.impl.IBaseServer#findAll(java.lang.Class)
	 */
	public <T> List<T> findAll(Class<T> objectClass) {
		return baseDao.findAll(objectClass);
	}

	/* (non-Javadoc)
	 * @see com.suncreate.emcgate.server.impl.IBaseServer#findById(java.lang.Integer, java.lang.Class)
	 */
	public <T> T findById(Integer id, Class<T> objectClass) {
		if (id == null)
			return null;
		return baseDao.findById(id, objectClass);
	}

	/* (non-Javadoc)
	 * @see com.suncreate.emcgate.server.impl.IBaseServer#findById(java.io.Serializable, java.lang.Class)
	 */
	public <T> T findById(Serializable id, Class<T> objectClass) {
		if (id == null)
			return null;
		return baseDao.findById(id, objectClass);
	}

	/* (non-Javadoc)
	 * @see com.suncreate.emcgate.server.impl.IBaseServer#update(com.suncreate.emcgate.model.PersistentObject)
	 */
	public void update(IPersistentObject pojo) {
		baseDao.update(pojo);
	}

	/* (non-Javadoc)
	 * @see com.suncreate.emcgate.server.impl.IBaseServer#update(java.util.List)
	 */
	public <T> void update(List<T> list) {
		for (int i = 0; i < list.size(); i++) {
			baseDao.update((IPersistentObject) list.get(i));
		}
	}

	/* (non-Javadoc)
	 * @see com.suncreate.emcgate.server.impl.IBaseServer#save(java.util.List)
	 */
	public <T> void save(List<T> list) {
		for (int i = 0; i < list.size(); i++) {
			IPersistentObject pojo = (IPersistentObject) list.get(i);
			save(pojo);
		}
	}

	/* (non-Javadoc)
	 * @see com.suncreate.emcgate.server.impl.IBaseServer#refresh(com.suncreate.emcgate.model.PersistentObject)
	 */
	public void refresh(IPersistentObject pojo) {
		baseDao.refresh(pojo);
	}

	/* (non-Javadoc)
	 * @see com.suncreate.emcgate.server.impl.IBaseServer#findAllWithOrder(java.lang.Class, java.lang.String)
	 */
	public <T> List<T> findAllWithOrder(Class<T> objectClass, String orderField) {
		return baseDao.findAllWithOrder(objectClass,
				orderField);
	}

	/* (non-Javadoc)
	 * @see com.suncreate.emcgate.server.impl.IBaseServer#findByProperty(java.lang.Class, java.lang.String, java.lang.Object)
	 */
	public <T> List<T> findByProperty(Class<T> objectClass, String propertyName,
			Object propertyValue) {
		return baseDao.findByProperty(objectClass,
				propertyName, propertyValue);
	}

	/* (non-Javadoc)
	 * @see com.suncreate.emcgate.server.impl.IBaseServer#saveListAndRemoveList(java.util.List, java.util.List)
	 */
	public <T> void saveListAndRemoveList(List<T> saveList, List<T> removeList) {
		save(saveList);
		remove(removeList);
	}
	
	
	public <T> List<T> findByNamedQuery(String queryName, Map<String, Object> queryParams) {
       return baseDao.findByNamedQuery(queryName, queryParams);
    }

	public <T> QueryResult<T> findPageData(
			Class<T> entityClass, int firstIndex, int maxResult,
			String wherejpql, Object[] queryParams,
			LinkedHashMap<String, String> orderby) {
		return baseDao.findPageData(entityClass, firstIndex, maxResult, wherejpql, queryParams, orderby);
	}
	
	public <T> QueryResult<T> findPageData(
			Class<T> entityClass, int firstIndex, int maxResult,
			String wherejpql, Object[] queryParams) {
		return this.findPageData(entityClass, firstIndex, maxResult, wherejpql, queryParams, null);
	}

	public <T> QueryResult<T> findPageData(
			Class<T> entityClass, int firstIndex, int maxResult,
			LinkedHashMap<String, String> orderby) {
		return this.findPageData(entityClass, firstIndex, maxResult, null, null, orderby);
	}

	public <T> QueryResult<T> findPageData(
			Class<T> entityClass, int firstIndex, int maxResult) {
		return this.findPageData(entityClass, firstIndex, maxResult, null, null, null);
	}

	public <T> QueryResult<T> findPageData(
			Class<T> entityClass) {
		return this.findPageData(entityClass, -1, -1, null, null, null);
	}
	
	
	
}
