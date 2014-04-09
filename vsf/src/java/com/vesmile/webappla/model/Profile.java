package com.vesmile.webappla.model;

import java.util.List;

public class Profile {
	private User user;
	private List<Menu> menus;
	private List<Menu> navigations;

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public List<Menu> getMenus() {
		return menus;
	}

	public void setMenus(List<Menu> menus) {
		this.menus = menus;
	}

	public List<Menu> getNavigations() {
		return navigations;
	}

	public void setNavigations(List<Menu> navigations) {
		this.navigations = navigations;
	}

}
