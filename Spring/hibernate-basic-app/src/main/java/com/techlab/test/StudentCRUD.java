package com.techlab.test;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;

import com.techlab.entity.Student;

public class StudentCRUD {
	public List<Student> readAll(Session session) {
		List<Student> students = new ArrayList<Student>();
		try {
			students = session.createQuery("from Student").list();
		} catch (Exception e) {
			System.out.println(e);
		}
		return students;
	}

	public void delete(Session session, String id) {
		try {
			Student stud = (Student) session.load(Student.class, id);
			session.delete(stud);
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	public void update(Session session, String id, String name, double cgpa) {
		try {
			Student stud = (Student) session.load(Student.class, id);
			stud.setName(name);
			stud.setCgpa(cgpa);
			session.update(stud);
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
