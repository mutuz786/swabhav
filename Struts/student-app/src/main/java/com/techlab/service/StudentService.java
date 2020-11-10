package com.techlab.service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import com.techlab.model.Student;

public class StudentService {
	private List<Student> students;
	private static StudentService ss;

	private StudentService() {
		students = new ArrayList<Student>();
		students.add(new Student(UUID.randomUUID().toString(), "murtaza", 23, "abc@gmail.com", 6.7));
		students.add(new Student(UUID.randomUUID().toString(), "gaurav", 25, "def@gmail.com", 4.5));
		students.add(new Student(UUID.randomUUID().toString(), "rahul", 32, "ghi@gmail.com", 5.6));
		students.add(new Student(UUID.randomUUID().toString(), "sagar", 12, "jkl@gmail.com", 6.4));
	}

	public static StudentService getInstance() {
		if (ss == null)
			ss = new StudentService();
		return ss;
	}

	public void deleteStudent(String id) {
		for (int i = 0; i < students.size(); i++) {
			if (students.get(i).getId().equals(id))
				students.remove(i);
		}
	}

	public void updateStudent(Student student) {
		for (Student stud : students) {
			if (stud.getId().equals(student.getId())) {
				stud.setName(student.getName());
				stud.setAge(student.getAge());
				stud.setEmail(student.getEmail());
				stud.setCgpa(student.getCgpa());
			}
		}
	}

	public void addStudent(Student student) {
		students.add(student);
	}

	public List<Student> getStudents() {
		return students;
	}

	public Student searchStudent(String id) {
		for (Student stud : students) {
			if (stud.getId().equals(id)) {
				return stud;
			}
		}
		return null;
	}
}
