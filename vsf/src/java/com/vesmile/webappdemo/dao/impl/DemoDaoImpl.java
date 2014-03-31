package com.vesmile.webappdemo.dao.impl;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.orm.hibernate3.HibernateCallback;

import com.vesmile.framework.dao.BaseDao;
import com.vesmile.webappdemo.dao.DemoDao;


public class DemoDaoImpl extends BaseDao implements DemoDao {

	public String showMsg() {
		getlogger().info("Show Demo Begin");
		String ibatisRs = "[IbatisResult-"
				+ (String) getSqlMapTemplate().queryForObject("demo.showDemo")
				+ "]</br>";
		String hibernateRs = "[Hibernate-"
				+ (String) getH3Template().execute(new HibernateCallback() {

					public Object doInHibernate(Session session)
							throws HibernateException, SQLException {
						Connection con = null;
						Statement st = null;
						String sql = "select 'This is a Demo Page!' from dual";
						try {
							con = session.connection();
							st = con.createStatement();
							st.execute(sql);
							ResultSet rs = st.getResultSet();
							while (rs.next()) {
								return rs.getString(1);
							}
						} finally {
							if (st != null) {
								st.close();
							}
							if (con != null) {
								con.close();
							}
						}
						return null;
					}
				}) + "]<br/>";
		String jdbcResult = "[JdbcResult-"
				+ (String) (getJdbcTemplate().queryForObject("select 'This is a demo page!' msg from dual", new RowMapper() {
					
					public Object mapRow(ResultSet rs, int arg1) throws SQLException {
						return rs.getString("msg");
					}
				}))
				+ "]";
		getlogger().info("Show Demo End");
		return hibernateRs+ibatisRs+jdbcResult;
	}
	
}
