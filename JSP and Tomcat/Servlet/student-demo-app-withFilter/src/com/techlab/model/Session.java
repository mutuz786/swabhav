package com.techlab.model;

import java.util.ArrayList;

public class Session {
	private static Session sc = null;
	private ArrayList<String> sessionsId = new ArrayList<String>();

	private Session() {

	}

	public static Session getInstance() {
		if (sc == null)
			sc = new Session();
		return sc;
	}

	public boolean getStatus(String id) {
		for (String sId : sessionsId) {
			if (sId.equals(id))
				return true;
		}
		return false;
	}

	public void addSession(String id) {
		sessionsId.add(id);
	}

	public void removeSession(String id) {
		for (int i = 0; i < sessionsId.size(); i++) {
			if (sessionsId.get(i).equals(id))
				sessionsId.remove(i);
		}

	}
}