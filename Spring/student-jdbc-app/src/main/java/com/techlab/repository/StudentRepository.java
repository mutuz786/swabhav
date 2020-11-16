package com.techlab.repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.springframework.stereotype.Repository;

import com.techlab.model.Student;

@Repository
public class StudentRepository {
	Connection conn = null;
	Statement stmt = null;

	public StudentRepository() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn = (Connection) DriverManager
					.getConnection("jdbc:mysql://localhost:3306/swabhav?user=root&password=root");
			stmt = (Statement) conn.createStatement();
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	public List<Student> getStudents() {
		List<Student> students = new ArrayList<Student>();
		ResultSet rs = null;
		try {
			rs = (ResultSet) stmt.executeQuery("select * from student");
			if (rs != null) {
				while (rs.next()) {
					Student student = new Student(rs.getString(1), rs.getString(2), rs.getString(3), rs.getInt(4));
					students.add(student);
				}
			}
		} catch (Exception e) {
			System.out.println(e);
		}
		return students;
	}

	public Student getStudent(String rollNo) {
		for (Student student : getStudents()) {
			if (student.getRollNo().equals(rollNo))
				return student;
		}
		return null;
	}

	public void addStudent(String name, String address, int age) {
		try {
			stmt.executeUpdate("insert into student values('" + UUID.randomUUID().toString() + "','" + name + "','"
					+ address + "'," + age + ")");
		} catch (Exception e) {
			System.out.println(e);
		}

	}

	public void editStudent(String rollNo, String name, String address, int age) {
		try {
			stmt.executeUpdate("update student set name='" + name + "',address='" + address + "',age=" + age
					+ " where rollNo='" + rollNo + "'");
		} catch (Exception e) {
			System.out.println(e);
		}

	}

	public void deleteStudent(String rollNo) {
		try {
			stmt.executeUpdate("delete from student where rollNo='" + rollNo + "'");
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	public List<Student> searchStudents(String name) {
		List<Student> searchList = new ArrayList<Student>();
		for (Student student : getStudents()) {
			if (student.getName().equals(name))
				searchList.add(student);
		}
		return searchList;
	}
}
