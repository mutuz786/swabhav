package com.techlab.action;

import com.opensymphony.xwork2.Action;

public class WelcomeAction implements Action {
	private String developer;

	
	@Override
	public String execute() throws Exception {
		return "success";
	}

	public String getDeveloper() {
		return developer;
	}

	public void setDeveloper(String developer) {
		this.developer = developer;
	}

}
