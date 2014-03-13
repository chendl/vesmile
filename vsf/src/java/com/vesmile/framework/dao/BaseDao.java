package com.vesmile.framework.dao;

import java.beans.IntrospectionException;
import java.beans.Introspector;
import java.beans.PropertyDescriptor;
import java.io.Serializable;
import java.lang.reflect.Method;
import java.sql.SQLException;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;

import org.apache.log4j.Logger;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.orm.hibernate3.HibernateCallback;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.orm.ibatis.SqlMapClientTemplate;

import com.vesmile.framework.model.IBaseScope;
import com.vesmile.framework.model.IPersistentObject;
import com.vesmile.framework.model.QueryResult;

public class BaseDao {
	private H3Support h3Support;
	private JdbcSupport jdbcSupport;
	private IBatisSupport iBatisSupport;

	public void setH3Support(H3Support h3Support) {
		this.h3Support = h3Support;
	}

	public void setJdbcSupport(JdbcSupport jdbcSupport) {
		this.jdbcSupport = jdbcSupport;
	}

	public void setiBatisSupport(IBatisSupport iBatisSupport) {
		this.iBatisSupport = iBatisSupport;
	}

	protected HibernateTemplate getH3Template() {
		return h3Support.getTemplate();
	}

	protected JdbcTemplate getJdbcTemplate() {
		return jdbcSupport.getTemplate();
	}

	protected SqlMapClientTemplate getSqlMapTemplate() {
		return iBatisSupport.getTemplate();
	}

	protected Logger getlog() {
		return Logger.getLogger(getClass());
	}

	public void merge(IPersistentObject object) {
		getlog().debug("merging object:" + object.getClass().getName());
		try {
			getH3Template().merge(object);

			getlog().debug("merging successful");
		} catch (RuntimeException re) {
			getlog().error("merging failed", re);
			throw re;
		}
	}

	public void refresh(IPersistentObject object) {

		getlog().debug("refresh object:" + object.getClass().getName());
		try {
			getH3Template().refresh(object);
			getlog().debug("refresh successful");
		} catch (RuntimeException re) {
			getlog().error("refresh failed", re);
			throw re;
		}
	}

	public void delete(IPersistentObject object) {
		getlog().debug("deleting object:" + object.getClass().getName());
		try {
			getH3Template().delete(object);
			getlog().debug("delete successful");
		} catch (RuntimeException re) {
			getlog().error("delete failed", re);
			throw re;
		}
	}

	@SuppressWarnings("unchecked")
	public <T> T load(Serializable id, Class<T> objClass) {
		getlog().debug("loading object with id: " + id);
		try {
			Object instance = getH3Template().load(objClass.getName(), id);
			return (T) instance;
		} catch (RuntimeException re) {
			getlog().error("load failed", re);
			throw re;
		}
	}

	@SuppressWarnings("unchecked")
	public <T> List<T> findAll(Class<T> objectClass) {
		getlog().debug("finding all " + objectClass.getName() + " instances");
		try {
			String queryString = "from " + objectClass.getName();
			List<T> list = getH3Template().find(queryString);
			return list;
		} catch (RuntimeException re) {
			getlog().error("find all failed", re);
			throw re;
		}
	}

	@SuppressWarnings("unchecked")
	public <T> List<T> findAllWithOrder(Class<T> objectClass, String orderField) {
		getlog().debug("finding all " + objectClass.getName() + " instances");
		try {
			String queryString = "from " + objectClass.getName()
					+ " model order by model." + orderField;
			return getH3Template().find(queryString);
		} catch (RuntimeException re) {
			getlog().error("find all failed", re);
			throw re;
		}
	}

	@SuppressWarnings("unchecked")
	public <T> T findById(Serializable id, Class<T> objectClass) {
		getlog().debug(
				"getting " + objectClass.getName() + " instance with id: " + id);
		try {
			return (T) getH3Template().get(objectClass.getName(), id);
		} catch (RuntimeException re) {
			getlog().error("get failed", re);
			throw re;
		}
	}

	public void save(IPersistentObject object) {
		getlog().debug("save object:" + object.getClass().getName());
		try {
			getH3Template().save(object);
			getlog().debug("save successful");
		} catch (RuntimeException re) {
			getlog().error("save failed", re);
			throw re;
		}
	}

	public void update(IPersistentObject object) {
		getlog().debug("update object:" + object.getClass().getName());
		try {
			getH3Template().update(object);
			getlog().debug("update successful");
		} catch (RuntimeException re) {
			getlog().error("update failed", re);
			throw re;
		}
	}

	@SuppressWarnings("unchecked")
	public <T> List<T> findByProperty(Class<T> objectClass,
			String propertyName, Object value) {
		getlog().debug(
				"finding object instance with property: " + propertyName
						+ ", value: " + value);
		try {
			String queryString = "from " + objectClass.getName()
					+ " as model where model." + propertyName + "= ?";
			List<T> list = getH3Template().find(queryString, value);
			return list;
		} catch (RuntimeException re) {
			getlog().error("find by property name failed", re);
			throw re;
		}
	}

	public <T> List<T> findByPropertyOrder(Class<T> objectClass,
			String propertyName, Object value, String orderby) {
		getlog().debug(
				"finding object instance with property: " + propertyName
						+ ", value: " + value);
		try {
			String queryString = "from " + objectClass.getName()
					+ " as model where model." + propertyName + "= ? "
					+ orderby;
			List<T> list = getH3Template().find(queryString, value);
			return list;
		} catch (RuntimeException re) {
			getlog().error("find by property name failed", re);
			throw re;
		}
	}

	@SuppressWarnings("unchecked")
	public <T> List<T> findByNamedQuery(String queryName,
			Map<String, Object> queryParams) {
		String[] params = new String[queryParams.size()];
		Object[] values = new Object[queryParams.size()];

		int index = 0;
		for (String s : queryParams.keySet()) {
			params[index] = s;
			values[index++] = queryParams.get(s);
		}

		return this.getH3Template().findByNamedQueryAndNamedParam(queryName,
				params, values);
	}

	public <T> QueryResult<T> findPageData(final Class<T> entityClass,
			final int firstIndex, final int maxResult, final String wherejpql,
			final Object[] queryParams,
			final LinkedHashMap<String, String> orderby) {
		final QueryResult<T> qr = new QueryResult<T>();
		final String entityname = getEntityName(entityClass);
		if (wherejpql == null || "".equals(wherejpql.trim())) {
			getH3Template().execute(new HibernateCallback() {
				public Object doInHibernate(Session session)
						throws HibernateException, SQLException {
					Query query = session.createQuery("select o from "
							+ entityname + " o " + buildOrderby(orderby));
					if (firstIndex != -1 && maxResult != -1)
						query.setFirstResult(firstIndex).setMaxResults(
								maxResult);
					qr.setResultList(query.list());
					query = session.createQuery("select count("
							+ getCountField(entityClass) + ") from "
							+ entityname + " o ");
					qr.setTotalRecord(Long.parseLong(query.list().get(0)
							.toString()));
					return null;
				}
			});

		} else {
			getH3Template().execute(new HibernateCallback() {
				public Object doInHibernate(Session session)
						throws HibernateException, SQLException {
					Query query = session.createQuery("select o from "
							+ entityname + " o " + "where 1=1 " + wherejpql
							+ buildOrderby(orderby));
					setQueryParams(query, queryParams);
					if (firstIndex != -1 && maxResult != -1)
						query.setFirstResult(firstIndex).setMaxResults(
								maxResult);
					qr.setResultList(query.list());
					query = session
							.createQuery("select count("
									+ getCountField(entityClass)
									+ ") from "
									+ entityname
									+ " o "
									+ (wherejpql == null ? "" : "where 1=1"
											+ wherejpql));
					setQueryParams(query, queryParams);
					qr.setTotalRecord(Long.parseLong(query.list().get(0)
							.toString()));
					return null;
				}
			});
		}

		return qr;
	}

	public <T> QueryResult<T> findPageData(Class<T> entityClass,
			int firstIndex, int maxResult, String wherejpql,
			Object[] queryParams) {
		return this.findPageData(entityClass, firstIndex, maxResult, wherejpql,
				queryParams, null);
	}

	public <T> QueryResult<T> findPageData(Class<T> entityClass,
			int firstIndex, int maxResult, LinkedHashMap<String, String> orderby) {
		return this.findPageData(entityClass, firstIndex, maxResult, null,
				null, orderby);
	}

	public <T> QueryResult<T> findPageData(Class<T> entityClass,
			int firstIndex, int maxResult) {
		return this.findPageData(entityClass, firstIndex, maxResult, null,
				null, null);
	}

	public <T> QueryResult<T> findPageData(Class<T> entityClass) {
		return this.findPageData(entityClass, -1, -1, null, null, null);
	}

	/**
	 * 获取统计字段名称
	 * 
	 * @param <T>
	 * @param clazz
	 * @return
	 */
	protected <T> String getCountField(Class<T> clazz) {
		String out = "o";
		try {
			PropertyDescriptor[] propertyDescriptors = Introspector
					.getBeanInfo(clazz).getPropertyDescriptors();
			for (PropertyDescriptor propertydesc : propertyDescriptors) {
				Method method = propertydesc.getReadMethod();
				if (method != null
						&& method.isAnnotationPresent(EmbeddedId.class)) {
					PropertyDescriptor[] ps = Introspector.getBeanInfo(
							propertydesc.getPropertyType())
							.getPropertyDescriptors();
					out = "o."
							+ propertydesc.getName()
							+ "."
							+ (ps[1].getName().equals("class") ? ps[1]
									.getName() : ps[0].getName());
					break;
				}
			}
		} catch (IntrospectionException e) {
			e.printStackTrace();
		}
		return out;
	}

	/**
	 * 获取实体名称
	 * 
	 * @param <T>
	 * @param entityClass
	 *            实体名称
	 * @return 实体名称
	 */
	protected <T> String getEntityName(Class<T> entityClass) {
		String entityname = entityClass.getSimpleName();
		/*
		 * Entity entity = entityClass.getAnnotation(Entity.class); if
		 * (entity.name() != null && !"".equals(entity.name())) { entityname =
		 * entity.name(); }
		 */
		return entityname;
	}

	/**
	 * 组装order by语句
	 * 
	 * @param orderby
	 * @return
	 */
	protected String buildOrderby(LinkedHashMap<String, String> orderby) {
		StringBuffer orderbyql = new StringBuffer("");
		if (orderby != null && orderby.size() > 0) {
			orderbyql.append(" order by ");
			for (String key : orderby.keySet()) {
				orderbyql.append("o.").append(key).append(" ")
						.append(orderby.get(key)).append(",");
			}
			orderbyql.deleteCharAt(orderbyql.length() - 1);
		}
		return orderbyql.toString();
	}

	/**
	 * 设置查询参数
	 * 
	 * @param query
	 * @param queryParams
	 */
	protected void setQueryParams(Query query, Object[] queryParams) {

		if (queryParams != null && queryParams.length > 0) {
			for (int i = 0; i < queryParams.length; i++) {
				query.setParameter(i, queryParams[i]);
			}
		}
	}

	private SessionFactory getSessionFactory() {
		return getH3Template().getSessionFactory();
	}

	public List findByScope(IBaseScope scope) {
		getlog().debug("finding by scope");
		try {
			String queryString = "from " + scope.getClazz().getName()
					+ " as model where " + scope.getWhereCondition("model")
					+ scope.getOrderHql("model");
			return getH3Template().find(queryString,
					scope.getParameter().toArray());
		} catch (RuntimeException re) {
			getlog().error("find by scope failed", re);
			throw re;
		}
	}

	public List findByScopeLinkClass(IBaseScope scope, Class objectClass) {
		getlog().debug("finding by scope");
		try {
			String queryString = "from " + scope.getClazz().getName()
					+ " as model," + objectClass.getName() + " as linkclass "
					+ " where " + scope.getWhereCondition("model")
					+ scope.getOrderHql("model");
			return getH3Template().find(queryString,
					scope.getParameter().toArray());
		} catch (RuntimeException re) {
			getlog().error("find by scope failed", re);
			throw re;
		}
	}
}
