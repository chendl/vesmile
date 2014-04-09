package com.vesmile.webappla.server.impl;

import com.vesmile.framework.server.impl.BaseServer;
import com.vesmile.webappla.dao.DaoFacade;

public class LaBaseServerImpl extends BaseServer {
	private DaoFacade daoFacade;

	public DaoFacade getDaoFacade() {
		return daoFacade;
	}

	public void setDaoFacade(DaoFacade daoFacade) {
		this.daoFacade = daoFacade;
	}
	
	protected <T> T  getMapper(Class<T> type){
		return getDaoFacade().getBaseDao().getMapper(type);
	}
}
