package com.techlab.service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.springframework.stereotype.Service;

import com.techlab.model.Student;

@Service
public class StudentService {
	private static StudentService service = null;
	private List<Student> students;

	public static StudentService getStudentService() {
		if (service == null)
			service = new StudentService();
		return service;
	}

	private StudentService() {
		students = new ArrayList<Student>();
		addStudent(new Student(null, "murtaza", "mumbai", 23));
		addStudent(new Student(null, "sagar", "pune", 21));
		addStudent(new Student(null, "gaurav", "pune", 22));
		addStudent(new Student(null, "rahul", "delhi", 25));
	}

	public List<Student> getStudents() {
		return students;
	}

	public void addStudent(Student student) {
		student.setRollNo(UUID.randomUUID().toString());
		students.add(student);
	}

	public void updateStudent(Student student) {
		Student stud = getStudent(student.getRollNo());
		stud.setName(student.getName());
		stud.setAddress(student.getAddress());
		stud.setAge(student.getAge());
	}

	public Student getStudent(String rollNo) {
		for (Student stud : students) {
			System.out.println(rollNo + "|" + stud.getRollNo());
			if (stud.getRollNo().equals(rollNo)) {
				return stud;
			}
		}
		return null;
	}

	public void deleteStudent(String rollNo) {
		students.remove(getStudent(rollNo));
	}
}
