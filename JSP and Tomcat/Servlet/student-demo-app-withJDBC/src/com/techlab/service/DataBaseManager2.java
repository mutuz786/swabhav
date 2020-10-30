package com.techlab.service;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import com.techlab.model.Student;

public class DataBaseManager2 {
	public static List<Student> getAllStudents() {
		List<Student> students = new ArrayList<Student>();
		Connection conn = null;
		Statement stmt = null;
		ResultSet res = null;

		try {

			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/swabhav?user=root&password=root");
			stmt = conn.createStatement();
			res = stmt.executeQuery("Select * from student");

			while (res.next()) {
				Student s = new Student();
				s.setId(res.getString(1));
				s.setName(res.getString(2));
				s.setRollNo(res.getInt(3));
				s.setAge(res.getInt(4));
				students.add(s);
			}
			conn.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

		return students;
	}
}
