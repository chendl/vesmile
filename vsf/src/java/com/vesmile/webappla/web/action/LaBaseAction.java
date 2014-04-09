package com.vesmile.webappla.web.action;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts.actions.DispatchAction;

import com.vesmile.webappla.model.Profile;
import com.vesmile.webappla.server.ServerLocator;
import com.vesmile.webappla.web.WebConstant;

public class LaBaseAction extends DispatchAction {
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
	
	public Profile getProfile(HttpServletRequest request){
		return (Profile) request.getSession().getAttribute(
				WebConstant.USER_PROFILE);
	}

}
