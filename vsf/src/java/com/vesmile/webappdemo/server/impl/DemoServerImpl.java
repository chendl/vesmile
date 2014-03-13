package com.vesmile.webappdemo.server.impl;

import com.vesmile.webappdemo.server.IDemoServer;

public class DemoServerImpl extends DemoBaseServer implements IDemoServer{

	public String showMsg() {
		return getDaoFacade().getDemoDao().showMsg();
	}

}
