package com.techlab.test;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.techlab.entity.Department;
import com.techlab.entity.Employee;

public class Test {
	public static void main(String[] args) {
		Configuration config = new Configuration();
		SessionFactory fact = config.configure("hibernate.cfg.xml").buildSessionFactory();

		Department dept1 = new Department();
		dept1.setId(1);
		dept1.setName("IT");

		Department dept2 = new Department();
		dept2.setId(2);
		dept2.setName("HR");

		Employee emp1 = new Employee();
		emp1.setId(1);
		emp1.setName("murtaza");
		emp1.setDept(dept1);

		Employee emp2 = new Employee();
		emp2.setId(2);
		emp2.setName("sagar");
		emp2.setDept(dept1);

		Employee emp3 = new Employee();
		emp3.setId(3);
		emp3.setName("gaurav");
		emp3.setDept(dept2);

		Set<Employee> emps1 = new HashSet<Employee>();
		emps1.add(emp1);
		emps1.add(emp2);

		Set<Employee> emps2 = new HashSet<Employee>();
		emps2.add(emp3);

		dept1.setEmployees(emps1);
		dept2.setEmployees(emps2);

		Session session = fact.openSession();
		Transaction trans = session.beginTransaction();
//		session.persist(dept1);
//		session.persist(dept2);
		System.out.println("Display Dept:");
		readAll(session);
		trans.commit();
		session.close();
		System.out.println("end");
	}

	private static void readAll(Session session) {
		List<Department> depts = new ArrayList<Department>();
		try {
			depts = session.createQuery("from Department").list();
		} catch (Exception e) {
			e.printStackTrace();
		}
		for (Department dept : depts)
			System.out.println("dept:" + dept.getName());
	}
}
