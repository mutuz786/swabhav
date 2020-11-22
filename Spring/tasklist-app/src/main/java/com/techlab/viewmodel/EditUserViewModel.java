package com.techlab.viewmodel;

public class EditUserViewModel extends AddUserViewModel{
	private String id;
	private boolean blocked;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public boolean isBlocked() {
		return blocked;
	}

	public void setBlocked(boolean blocked) {
		this.blocked = blocked;
	}

}
