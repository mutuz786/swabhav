package com.techlab.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.techlab.model.Student;

@Repository
public class StudentRepository {
	private List<Student> students;

	public StudentRepository() {
		System.out.println("student repository has been called");
		Student s1 = new Student();
		s1.setName("murtaza");
		s1.setRollNo(12);
		Student s2 = new Student();
		s2.setName("gaurav");
		s2.setRollNo(23);
		students = new ArrayList<Student>();
		students.add(s1);
		students.add(s2);
	}

	public List<Student> get() {
		return students;
	}
}
