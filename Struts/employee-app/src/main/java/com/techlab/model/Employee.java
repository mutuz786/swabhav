package com.techlab.model;


public class Employee {
	private String id, name, post, dept, doj;
	private int sal;

	public Employee() {

	}

	public Employee(String id, String name, String post, int sal, String doj, String dept) {
		this.id = id;
		this.name = name;
		this.post = post;
		this.sal = sal;
		this.doj = doj;
		this.dept = dept;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPost() {
		return post;
	}

	public void setPost(String post) {
		this.post = post;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	public int getSal() {
		return sal;
	}

	public void setSal(int sal) {
		this.sal = sal;
	}

	public String getDoj() {
		return doj;
	}

	public void setDoj(String doj) {
		this.doj = doj;
	}
}
