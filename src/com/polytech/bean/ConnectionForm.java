package com.polytech.bean;

import javax.servlet.http.HttpServletRequest;

public class ConnectionForm {
	
	private String res;
	
	
	public void verifictionIdentifiants(HttpServletRequest request) {
		String login = request.getParameter("login");
		String pass = request.getParameter("password");
		
		if (pass.equals(login+"1234")) {
			res = "vous etes connectées";
		}else {
			res = "vous etes  pas connectés! désolé!!!!";
		}
	}

	public String getRes() {
		return res;
	}

	public void setRes(String res) {
		this.res = res;
	}
	
	
}
