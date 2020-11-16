package com.techlab.repository;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.springframework.stereotype.Repository;

import com.techlab.model.Student;

@Repository
public class StudentRepository {
	private List<Student> students;

	public StudentRepository() {
		students = new ArrayList<Student>();
		addStudent("murtaza", "mumbai", 23);
		addStudent("gaurav", "delhi", 21);
		addStudent("sagar", "pune", 25);
		addStudent("rahul", "bangalore", 31);
	}

	public List<Student> getStudents() {
		return students;
	}

	public Student getStudent(String rollNo) {
		for (Student student : students) {
			if (student.getRollNo().equals(rollNo))
				return student;
		}
		return null;
	}

	public void addStudent(String name, String address, int age) {
		students.add(new Student(UUID.randomUUID().toString(), name, address, age));
	}

	public void editStudent(String rollNo, String name, String address, int age) {
		Student student = getStudent(rollNo);
		student.setName(name);
		student.setAddress(address);
		student.setAge(age);
	}

	public void deleteStudent(String rollNo) {
		students.remove(getStudent(rollNo));
	}

	public List<Student> searchStudents(String name) {
		List<Student> searchList = new ArrayList<Student>();
		for (Student student : students) {
			if (student.getName().equals(name))
				searchList.add(student);
		}
		return searchList;
	}
}
