package com.techlab.test;

import java.util.List;
import java.util.UUID;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.techlab.entity.Student;

public class StudentTest {
	public static void main(String[] args) {
		Configuration config = new Configuration();
		SessionFactory fact = (SessionFactory) config.configure("hibernate.cfg.xml").buildSessionFactory();

		Student stud1 = new Student();
		stud1.setId(UUID.randomUUID().toString());
		stud1.setName("murtaza");
		stud1.setCgpa(8.3);

		Student stud2 = new Student();
		stud2.setId(UUID.randomUUID().toString());
		stud2.setName("sagar");
		stud2.setCgpa(7.4);

		Student stud3 = new Student();
		stud3.setId(UUID.randomUUID().toString());
		stud3.setName("gaurav");
		stud3.setCgpa(6.8);

		Session session = fact.openSession();
		Transaction transaction = null;
		try {
			transaction = session.beginTransaction();
//			session.save(stud1);
//			session.save(stud2);
//			session.save(stud3);
			List<Student> studList = new StudentCRUD().readAll(session);
			printInfo(studList);
			transaction.commit();

		} catch (Exception e) {
			transaction.rollback();
		} finally {
			session.close();
		}
	}

	private static void printInfo(List<Student> studList) {
		String output = "------------------------------\n";
		for (Student stud : studList) {
			output += "\nname: " + stud.getName() + "\tcgpa:" + stud.getCgpa();
		}
		System.out.println(output);
	}
}
