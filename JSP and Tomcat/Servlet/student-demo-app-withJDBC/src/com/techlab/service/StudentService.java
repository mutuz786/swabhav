package com.techlab.service;

import java.util.ArrayList;
import java.util.UUID;
import com.techlab.model.Student;

public class StudentService {
	static DataBaseManager db = new DataBaseManager();

	public static void editStudent(Student student) {
		Integer rollNo = student.getRollNo();
		Integer age = student.getAge();
		db.update("name", student.getName(), student.getId());
		db.update("rollNo", rollNo.toString(), student.getId());
		db.update("age", age.toString(), student.getId());
	}

	public static void deleteStudent(Student student) {
		db.delete(student.getId());
	}

	public static void addStudent(Student student) {
		student.setId(UUID.randomUUID().toString());
		db.insert(student.getId(), student.getName(), student.getRollNo(), student.getAge());
	}

	public static ArrayList<Student> getStudents() {
		ArrayList<Student> students = new ArrayList<Student>();
		ArrayList<String[]> data = db.getData();
		for (String[] entry : data) {
			Student student = new Student();
			student.setId(entry[0]);
			student.setName(entry[1]);
			student.setRollNo(Integer.parseInt(entry[2]));
			student.setAge(Integer.parseInt(entry[3]));
			students.add(student);
		}
		return students;
	}

	public static Student getStud(String id) {
		for (Student student : getStudents()) {
			if (student.getId().equals(id)) {
				return student;
			}
		}
		return null;
	}
}
