package com.techlabs.service;

import java.util.ArrayList;
import java.util.List;

public class SessionService {
	private List<String> sessionIdList = new ArrayList<String>();
	private static SessionService ss = null;

	private SessionService() {

	}

	public static SessionService getInstance() {
		if (ss == null)
			ss = new SessionService();
		return ss;
	}

	public void addSession(String sessionId) {
		sessionIdList.add(sessionId);
	}
	
	public void removeSession(String sessionId) {
		sessionIdList.remove(sessionId);
	}
	
	public boolean isSessionPresent(String sessionId) {
		return sessionIdList.contains(sessionId);
	}
}
