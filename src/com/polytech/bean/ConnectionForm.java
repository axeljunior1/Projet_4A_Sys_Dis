package com.polytech.bean;

import javax.servlet.http.HttpServletRequest;

public class ConnectionForm {
	
	private String res;
	
	
	public void verifictionIdentifiants(HttpServletRequest request) {
		String login = request.getParameter("login");
		String pass = request.getParameter("password");
		
		if (pass.equals(login+"1234")) {
			res = "vous etes connect�es";
		}else {
			res = "vous etes  pas connect�s! d�sol�!!!!";
		}
	}

	public String getRes() {
		return res;
	}

	public void setRes(String res) {
		this.res = res;
	}
	
	
}
