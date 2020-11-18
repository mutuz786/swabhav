package com.techlab.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.techlab.model.Student;
import com.techlab.service.StudentService;

@CrossOrigin(maxAge = 3600)
@RequestMapping("api/v1")
@RestController
public class StudentRestController {
	@Autowired
	private StudentService service;

	@CrossOrigin
	@GetMapping("/students")
	public List<Student> getStudents() {
		service = StudentService.getStudentService();
		return service.getStudents();
	}

	@GetMapping("/students/{rollNo}")
	public Student getStudent(@PathVariable String rollNo) {
		service = StudentService.getStudentService();
		return service.getStudent(rollNo);
	}

	@PostMapping("/students")
	public List<Student> addStudents(@RequestBody Student student) {
		service = StudentService.getStudentService();
		service.addStudent(student);
		return service.getStudents();
	}

	@DeleteMapping("/students/{rollNo}")
	public List<Student> deleteStudent(@PathVariable String rollNo) {
		service = StudentService.getStudentService();
		service.deleteStudent(rollNo);
		return service.getStudents();
	}

	@PutMapping("/students/{rollNo}")
	public List<Student> updateStudents(@RequestBody Student student, @PathVariable String rollNo) {
		service = StudentService.getStudentService();
		student.setRollNo(rollNo);
		service.updateStudent(student);
		return service.getStudents();
	}

}
