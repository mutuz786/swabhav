package com.techlab.action;

import com.opensymphony.xwork2.Action;

public class InterceptorAction implements Action {
	private int num;

	@Override
	public String execute() throws Exception {
		return "success";
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

}
