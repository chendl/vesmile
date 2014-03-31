package com.vesmile.framework.dao;

import org.apache.log4j.Logger;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.orm.ibatis.SqlMapClientTemplate;

public class BaseDao {
	private H3Support h3Support;
	private JdbcSupport jdbcSupport;
	private IBatisSupport iBatisSupport;
	private MyBatisSupport myBatisSupport;
	private Logger logger;

	public void setH3Support(H3Support h3Support) {
		this.h3Support = h3Support;
	}

	public void setJdbcSupport(JdbcSupport jdbcSupport) {
		this.jdbcSupport = jdbcSupport;
	}

	public void setiBatisSupport(IBatisSupport iBatisSupport) {
		this.iBatisSupport = iBatisSupport;
	}
	
	public void setMyBatisSupport(MyBatisSupport myBatisSupport) {
		this.myBatisSupport = myBatisSupport;
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
	
	protected SqlSessionTemplate getSqlSessionTemplate(){
		return myBatisSupport.getTemlate();
	}

	protected Logger getlogger() {
		if(logger == null)
			logger = Logger.getLogger(getClass());
		return logger;
	}

}
