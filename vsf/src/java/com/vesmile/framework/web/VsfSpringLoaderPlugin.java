package com.vesmile.framework.web;

import org.springframework.beans.BeansException;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.struts.ContextLoaderPlugIn;

public class VsfSpringLoaderPlugin extends ContextLoaderPlugIn {
	

	@Override
	protected WebApplicationContext initWebApplicationContext()
			throws BeansException, IllegalStateException {
		// TODO Auto-generated method stub
		WebApplicationContext c = super.initWebApplicationContext();
		getServletContext()
				.setAttribute(
						WebApplicationContext.ROOT_WEB_APPLICATION_CONTEXT_ATTRIBUTE,
						c);
		return c;
	}

}
