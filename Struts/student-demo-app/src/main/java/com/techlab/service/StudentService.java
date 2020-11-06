package com.techlab.service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import com.techlab.model.Student;

public class StudentService {
	private static StudentService studentService = null;
	private List<Student> students = new ArrayList<Student>();

	private StudentService() {
		students.add(new Student(UUID.randomUUID().toString(), "murtaza", 23, "mumbai", 7.4));
		students.add(new Student(UUID.randomUUID().toString(), "sagar", 12, "mumbai", 5.3));
		students.add(new Student(UUID.randomUUID().toString(), "gaurav", 34, "pune", 3.5));
		students.add(new Student(UUID.randomUUID().toString(), "rahul", 16, "mumbai", 6.5));
		students.add(new Student(UUID.randomUUID().toString(), "soham", 62, "delhi", 7.4));
		students.add(new Student(UUID.randomUUID().toString(), "saurabh", 53, "pune", 6.3));
	}

	public static StudentService getInstance() {
		if (studentService == null) {
			studentService = new StudentService();
		}
		return studentService;
	}

	public List<Student> getStudents() {
		return students;
	}

	public void add(Student student) {
		students.add(student);
	}

	public void edit(Student student) {
		int targetId = getStudentPosition(student.getId());
		students.get(targetId).setName(student.getName());
		students.get(targetId).setAge(student.getAge());
		students.get(targetId).setAddress(student.getAddress());
		students.get(targetId).setCgpa(student.getCgpa());
	}

	public void deleteStudent(Student student) {
		int targetId = getStudentPosition(student.getId());
		students.remove(targetId);
	}

	public Student getStudent(String id) {
		return students.get(getStudentPosition(id));
	}

	public int getStudentPosition(String id) {
		for (int i = 0; i < students.size(); i++) {
			if (students.get(i).getId().equals(id)) {
				return i;
			}
		}
		return -1;
	}
}
