package com.vesmile.webappdemo.web.action;

import org.apache.struts.actions.DispatchAction;

import com.vesmile.webappdemo.server.ServerLocator;


public class DemoBaseAction extends DispatchAction {
	private ServerLocator locator;
	public String method=""; 
	public ServerLocator getLocator() {
		return locator;
	}

	public void setLocator(ServerLocator locator) {
		this.locator = locator;
	}

	public String getMethod() {
		return method;
	}

	public void setMethod(String method) {
		this.method = method;
	}

}
