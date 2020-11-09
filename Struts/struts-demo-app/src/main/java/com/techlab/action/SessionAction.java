package com.techlab.action;

import java.util.Map;
import org.apache.struts2.dispatcher.SessionMap;
import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.Action;

public class SessionAction implements Action, SessionAware {
	private SessionMap<String, Object> session;

	@Override
	public String execute() throws Exception {
		if (session.get("oldC") == null) {
			session.put("oldC", new Integer(0));
			session.put("newC", new Integer(1));
		} else
			increamentCount();
		return "success";
	}

	private void increamentCount() {
		int oldCount = (int) session.get("oldC");
		int newCount = (int) session.get("newC");
		session.put("oldC", oldCount + 1);
		session.put("newC", newCount + 1);
	}

	public int getOldCount() {
		return 1;
	}

	public int getNewCount() {
		return 1;
	}

	@Override
	public void setSession(Map<String, Object> session) {
		this.session = (SessionMap) session;
	}

}
