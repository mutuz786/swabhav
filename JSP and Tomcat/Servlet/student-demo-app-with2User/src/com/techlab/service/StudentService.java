package com.techlab.service;

import java.util.ArrayList;
import java.util.UUID;

import com.techlab.model.Student;

public class StudentService {
	private static ArrayList<Student> students = new ArrayList<Student>();

	public static void addStudent(Student student) {
		student.setId(UUID.randomUUID().toString());
		students.add(student);
	}

	public static void editStudent(Student student) {
		Student stud = getStud(student.getId());
		if (stud != null) {
			stud.setName(student.getName());
			stud.setRollNo(student.getRollNo());
			stud.setAge(student.getAge());
		}
	}

	public static ArrayList<Student> getStudents() {
		return students;
	}

	public static Student getStud(String id) {
		for (Student stud : students) {
			if (stud.getId().equals(id)) {
				return stud;
			}
		}
		return null;
	}

	public static void delete(Student student) {
		for (int i = 0; i < students.size(); i++) {
			if (students.get(i).getId().equals(student.getId())) {
				students.remove(i);
			}
		}
	}
}
