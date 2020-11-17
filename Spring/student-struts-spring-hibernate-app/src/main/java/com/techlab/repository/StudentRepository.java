package com.techlab.repository;

import java.util.List;
import java.util.UUID;

import javax.transaction.Transactional;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.techlab.model.Student;

@Repository
@Transactional
public class StudentRepository {
	@Autowired
	private SessionFactory fact;

	public void insert(String name, String address, int age) {
		fact.getCurrentSession().save(new Student(UUID.randomUUID().toString(), name, address, age));
	}

	public void update(String id, String name, String address, int age) {
		Student student = getRow(id);
		student.setName(name);
		student.setAddress(address);
		student.setAge(age);
		fact.getCurrentSession().update(student);
	}

	public void delete(String id) {
		Student student = getRow(id);
		fact.getCurrentSession().delete(student);
	}

	@SuppressWarnings("unchecked")
	public List<Student> select() {
		List<Student> students = fact.getCurrentSession().createQuery("from Student").list();
		return students;
	}

	public Student getRow(String id) {
		for (Student student : select()) {
			if (student.getId().equals(id))
				return student;
		}
		return null;
	}

}
