package com.vesmile.framework.server.impl;

import com.vesmile.framework.dao.BaseDao;
import com.vesmile.framework.server.IBaseServer;

public abstract class BaseServer implements IBaseServer {
	private BaseDao baseDao;
	
	public void setBaseDao(BaseDao baseDao) {
		this.baseDao = baseDao;
	}

}
