package com.techlabs.annotationtest;

public class StudentClass {
	private String name = "";
	private int id = 0;
	private float cgpa = 0f;
	
	@NeedToRefactor
	public void getData(int id, String name, float cgpa) {
		this.name=name;
		this.id=id;
		this.cgpa=cgpa;
	}
	
	public String getName() {
		return name;
	}
	
	@NeedToRefactor
	public int getid() {
		return id;
	}
	
	public float getCgpa() {
		return cgpa;
	}
}
