package com.techlab.model;

public class Contact {
	private String id;
	private String fname;
	private String mname;
	private String lname;
	private String phoneNo;
	private String email;

	public Contact(String id, String fname, String mname, String lname, String phoneNo, String email) {
		this.id = id;
		this.fname = fname;
		this.mname = mname;
		this.lname = lname;
		this.phoneNo = phoneNo;
		this.email = email;
	}

	public String getFname() {
		return fname;
	}

	public String getMname() {
		return mname;
	}

	public String getLname() {
		return lname;
	}

	public String getPhoneNo() {
		return phoneNo;
	}

	public String getEmail() {
		return email;
	}

	public String getId() {
		return id;
	}
}
