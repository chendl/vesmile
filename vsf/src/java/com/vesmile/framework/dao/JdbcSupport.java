package com.vesmile.framework.dao;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;

public class JdbcSupport {
	private DataSource dataSource;
	private JdbcTemplate template;

	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
	}
	
	public JdbcTemplate getTemplate(){
		if(template == null)
			template = new JdbcTemplate(dataSource);
		return template;
	}
}
