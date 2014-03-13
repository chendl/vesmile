package com.vesmile.framework.util;
import org.springframework.core.io.Resource;
import org.springframework.core.io.UrlResource;
import org.springframework.orm.ibatis.SqlMapClientFactoryBean;

public class WrapSqlMapClientFactoryBean extends SqlMapClientFactoryBean {
	public void setConfigLocation(String configLocation) {
		Resource rs = new UrlResource(ResourceLoader
				.getResource(configLocation));
		super.setConfigLocation(rs);
	}
}