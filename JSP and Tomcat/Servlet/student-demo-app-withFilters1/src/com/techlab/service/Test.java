package com.techlab.service;

import java.util.ArrayList;

import com.techlab.model.Student;

public class Test {
	public static void main(String[] args) {
		ArrayList<Student> students;
		StudentService ss = StudentService.getInstance();
		students = ss.getStudents();
		for (Student student : students) {
			System.out.println(student.getId());
		}
		Student s = ss.getStud("24e621b1-b1dc-411d-acff-e3f863565638");
		System.out.println(s.getName() + "\t" + s.getRollNo() + "\t" + s.getAge());
	}
}
