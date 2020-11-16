package com.techlab.repository;

import java.util.List;
import java.util.UUID;

import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

import com.techlab.model.Student;

@Repository
public class StudentRepository {
	private SessionFactory fact;

	public void setFact(SessionFactory fact) {
		this.fact = fact;
	}

	public void insert(String name, String address, int age) {
		fact.getCurrentSession().save(new Student(UUID.randomUUID().toString(), name, address, age));
	}

	public void update(String id, String name, String address, int age) {
		Student student = (Student) fact.getCurrentSession().load(Student.class, id);
		student.setName(name);
		student.setAddress(address);
		student.setAge(age);
		fact.getCurrentSession().update(student);
	}

	public void delete(String id) {
		Student student = (Student) fact.getCurrentSession().load(Student.class, id);
		fact.getCurrentSession().delete(student);
	}

	@SuppressWarnings("unchecked")
	public List<Student> select() {
		return fact.getCurrentSession().createQuery("from Student").list();
	}

}
