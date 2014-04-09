package com.vesmile.webappla.server.impl;

import java.util.List;

import com.vesmile.webappla.dao.mybatis.client.UserMapper;
import com.vesmile.webappla.dao.mybatis.client.UserRightMapper;
import com.vesmile.webappla.dao.mybatis.example.MenuExample;
import com.vesmile.webappla.dao.mybatis.example.UserExample;
import com.vesmile.webappla.dao.mybatis.example.UserRightExample;
import com.vesmile.webappla.model.Menu;
import com.vesmile.webappla.model.User;
import com.vesmile.webappla.server.UserServer;
import com.vesmile.webappla.util.PsUtil;

public class UserServerImpl extends LaBaseServerImpl implements UserServer {

	@Override
	public List<Menu> getMenusOfUser(User user) {
		return getDaoFacade().getMenuDao().getMenus(user);
	}

	@Override
	public List<Menu> getNavigationsOfUser(User user) {
		return getDaoFacade().getMenuDao().getNavigations(user);
	}

	@Override
	public User validateUser(User user) {
		User activeUser = getDaoFacade().getUserDao().getUserByNo(user.getNo());
		if(activeUser.getId() == null)
			return activeUser;
		if(PsUtil.encryptPsw(user.getPassword()).equals(activeUser.getPassword()))
			return activeUser;
		return new User();
	}

	@Override
	public String resetPassword(User user) {
		String psw = PsUtil.generatePsw(8);
		user.setPassword(PsUtil.encryptPsw(psw));
		getMapper(UserMapper.class).updateByPrimaryKeySelective(user);
		return psw;
	}

}
