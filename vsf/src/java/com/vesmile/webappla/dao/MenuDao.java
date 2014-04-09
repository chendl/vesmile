package com.vesmile.webappla.dao;

import java.util.List;

import com.vesmile.framework.dao.BaseDao;
import com.vesmile.webappla.dao.mybatis.client.MenuMapper;
import com.vesmile.webappla.dao.mybatis.example.MenuExample;
import com.vesmile.webappla.model.Menu;
import com.vesmile.webappla.model.User;

public class MenuDao extends BaseDao {
	private List<Menu> getMenusByUser(User user,Integer menuType) {
		MenuExample mexp = new MenuExample();
		mexp.addInnerJoinTable("LA_User_Right").addJoinCritera("laur_mid = lam_id");
		mexp.getJoinClause().addWhereCritera("laur_uid =", user.getId());
		mexp.createCriteria().andTypeEqualTo(menuType);
		mexp.setOrderByClause("lam_lvl , lam_order");
		return getMapper(MenuMapper.class).selectByExample(mexp);
	}
	
	public List<Menu> getMenus(User user){
		return getMenusByUser(user,Menu.MENU_TYPE_MENU);
	}
	
	public List<Menu> getNavigations(User user){
		return getMenusByUser(user,Menu.MENU_TYPE_NAVIGATION);
	}
}
