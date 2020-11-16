package com.techlab.model;

public class Employee {
	private String id, name, post;
	private int sal;

	public Employee() {
	}

	public Employee(String id, String name, String post, int sal) {
		this.id = id;
		this.name = name;
		this.post = post;
		this.sal = sal;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPost() {
		return post;
	}

	public void setPost(String post) {
		this.post = post;
	}

	public int getSal() {
		return sal;
	}

	public void setSal(int sal) {
		this.sal = sal;
	}

}
