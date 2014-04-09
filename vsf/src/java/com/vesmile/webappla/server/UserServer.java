package com.vesmile.webappla.server;

import java.util.List;

import com.vesmile.webappla.model.Menu;
import com.vesmile.webappla.model.User;

public interface UserServer {

	List<Menu> getMenusOfUser(User user);

	List<Menu> getNavigationsOfUser(User user);

	User validateUser(User user);

	String resetPassword(User user);

}
