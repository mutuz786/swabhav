package com.techlabs.model.test;

import com.techlabs.model.Student;

public class StudentCase1 {
	public static void main(String[] args) {
		Student s1 = new Student(101, "abc");
		System.out.println(s1.getCount());
		Student s2 = new Student(102, "");
		System.out.println(s1.getCount());
		Student s3 = new Student(103, "lmno", 8.0f);
		System.out.println(s1.getCount());
	}
}