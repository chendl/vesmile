package com.vesmile.webappla.web.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import com.vesmile.webappla.model.Profile;
import com.vesmile.webappla.model.User;
import com.vesmile.webappla.web.WebConstant;
import com.vesmile.webappla.web.form.LoginForm;

public class LoginAction extends LaBaseAction {

	@Override
	public ActionForward execute(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		User user = transUser(request);
		String resCode = validateUser(user);
		request.setAttribute(WebConstant.ACTION_RESULT_CODE, resCode);
		if(WebConstant.ACTION_STATUS_OK.equals(resCode)){
			setProfile(request,user);
			return mapping.findForward("Login.Success");
		}else{
			return mapping.findForward("Login.Error");
		}
	}
	
	private void setProfile(HttpServletRequest request, User user) {
		Profile profile = new Profile();
		profile.setUser(user);
		profile.setMenus(getLocator().getUserServer().getMenusOfUser(user));
		profile.setNavigations(getLocator().getUserServer().getNavigationsOfUser(user));
		request.setAttribute(WebConstant.USER_PROFILE, profile);
		request.getSession().setAttribute(WebConstant.USER_PROFILE, profile);
	}

	private String validateUser(User user) {
		User vu = getLocator().getUserServer().validateUser(user);
		if(vu.getId() != null)
			return WebConstant.ACTION_STATUS_OK;
		else
			return WebConstant.ERROR_LOGIN_UNAME_OR_PSW_WRONG;
	}

	public User transUser(HttpServletRequest request){
		User user = new User();
		user.setNo(request.getParameter("userNo"));
		user.setPassword(request.getParameter("uwsp"));
		return user;
	}
	
}
