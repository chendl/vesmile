package com.vesmile.webappla.server;

import com.vesmile.framework.server.IBaseServer;

public class ServerLocator {
	private IBaseServer baseServer;
	private UserServer userServer;

	public UserServer getUserServer() {
		return userServer;
	}

	public void setUserServer(UserServer userServer) {
		this.userServer = userServer;
	}

	public IBaseServer getBaseServer() {
		return baseServer;
	}

	public void setBaseServer(IBaseServer baseServer) {
		this.baseServer = baseServer;
	}

}
