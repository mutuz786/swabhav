package com.techlabs.model;

public class Student {
	private int id;
	private String name;
	private float cgpa;
	private static int count;
	
	public Student(int id,String name,float cgpa) {
		this.id=id;
		this.name=name;
		this.cgpa=cgpa;
		count++;
	}
	
	public Student(int id,String name) {
		this(id,name,7.00f);
	}
	
	public int getId(){
		return id;
	}
	
	public String getName(){
		return name;
	}
	
	public float getCgpa(){
		return cgpa;
	}

	public static int getCount() {
		return count;
	}
	
}
