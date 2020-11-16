package com.techlab.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.techlab.model.Student;
import com.techlab.repository.StudentRepository;

@Service("studentssvc")
public class StudentService {
	@Autowired
	private StudentRepository repository;

	public List<Student> getStudents() {
		return repository.getStudents();
	}

	public Student getStudent(String rollNo) {
		return repository.getStudent(rollNo);
	}

	public void addStudent(String name, String address, int age) {
		repository.addStudent(name, address, age);
	}

	public void editStudent(String rollNo, String name, String address, int age) {
		repository.editStudent(rollNo, name, address, age);
	}

	public void deleteStudent(String rollNo) {
		repository.deleteStudent(rollNo);
	}

	public List<Student> searchStudents(String name) {
		return repository.searchStudents(name);
	}

}
