package com.vesmile.webappla.web.form;

import org.apache.struts.action.ActionForm;

public class LoginForm extends ActionForm {
	private String userNo;
	private String uwsp;
	
	public String getUserNo() {
		return userNo;
	}
	public void setUserNo(String userNo) {
		this.userNo = userNo;
	}
	public String getUwsp() {
		return uwsp;
	}
	public void setUwsp(String uwsp) {
		this.uwsp = uwsp;
	}
}
