package com.techlabs.overridingtest;

class College{
	void leader() {
		System.out.println("Principal");
	}
}

class Department extends College{
	void leader() {
		System.out.println("Head Of Department");
	}
}

class ClassRoom extends College{
	void leader() {
		System.out.println("Class Teacher");
	}
}

public class OverridingTest {
	public static void main(String[] args) {
		College college=new College();
		college.leader();
		Department department=new Department();
		department.leader();
		ClassRoom classroom=new ClassRoom();
		classroom.leader();
		College college1=new ClassRoom();
		college1.leader();
		
	}
}
