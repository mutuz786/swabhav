package com.techlabs.model.test;

import com.techlabs.model.Student;

public class StudentTest {
	public static void main(String[] args) {
		Student s1=new Student(101,"abc");
		printInfo(s1);
		Student s2=new Student(102,"xyz");
		printInfo(s2);
		Student s3=new Student(103,"lmno",8.0f);
		printInfo(s3);
	}

	private static void printInfo(Student student) {
		System.out.println(student.getCount());
	}
}
