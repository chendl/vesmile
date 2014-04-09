package com.vesmile.framework.dao;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionTemplate;

import com.vesmile.webappla.dao.mybatis.client.HomeMapper;

public class MyBatisSupport {
	private SqlSessionFactory sqlSessionFactory;
	private SqlSessionTemplate sqlSessionTemplate;

	public SqlSessionFactory getSqlSessionFactory() {
		return sqlSessionFactory;
	}

	public void setSqlSessionFactory(SqlSessionFactory sqlSessionFactory) {
		this.sqlSessionFactory = sqlSessionFactory;
	}

	public SqlSessionTemplate getTemlate() {
		if(sqlSessionTemplate==null)
			sqlSessionTemplate = new SqlSessionTemplate(getSqlSessionFactory());
		return sqlSessionTemplate;
	}

}
