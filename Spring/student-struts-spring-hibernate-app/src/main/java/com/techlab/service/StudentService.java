package com.techlab.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.techlab.model.Student;
import com.techlab.repository.StudentRepository;

@Service("studentsvc")
public class StudentService {
	@Autowired
	private StudentRepository repository;

	public void addStudent(String name, String address, int d) {
		repository.insert(name, address, d);
	}

	public void editStudent(String id, String name, String address, int age) {
		repository.update(id, name, address, age);
	}

	public void deleteStudent(String id) {
		repository.delete(id);
	}

	public List<Student> getStudents() {
		return repository.select();
	}

	public Student getStudent(String id) {
		return repository.getRow(id);
	}

}
