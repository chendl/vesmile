package com.vesmile.webappdemo.server;

import com.vesmile.framework.server.IBaseServer;

public class ServerLocator {
	private IDemoServer demoServer;
	private IBaseServer baseServer;

	public IBaseServer getBaseServer() {
		return baseServer;
	}

	public void setBaseServer(IBaseServer baseServer) {
		this.baseServer = baseServer;
	}

	public IDemoServer getDemoServer() {
		return demoServer;
	}

	public void setDemoServer(IDemoServer demoServer) {
		this.demoServer = demoServer;
	}

}
