package com.vesmile.framework.dao;

import org.springframework.orm.ibatis.SqlMapClientTemplate;

import com.ibatis.sqlmap.client.SqlMapClient;

public class IBatisSupport {
	private SqlMapClientTemplate template;
	private SqlMapClient sqlMapClient;

	private SqlMapClient getSqlMapClient() {
		return sqlMapClient;
	}

	public void setSqlMapClient(SqlMapClient sqlMapClient) {
		this.sqlMapClient = sqlMapClient;
	}

	public SqlMapClientTemplate getTemplate() {
		if(template == null)
			template = new SqlMapClientTemplate(getSqlMapClient());
		return template;
	}
}
