package com.vesmile.framework.dao;

import org.hibernate.SessionFactory;
import org.springframework.orm.hibernate3.HibernateTemplate;

public class H3Support {
	private SessionFactory sessionFactory;
	private HibernateTemplate template;

	private SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	
	public HibernateTemplate getTemplate(){
		if(template == null){
			template = new HibernateTemplate(getSessionFactory());
		}
		return template;
	}
}
