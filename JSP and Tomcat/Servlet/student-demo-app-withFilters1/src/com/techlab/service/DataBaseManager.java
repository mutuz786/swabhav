package com.techlab.service;

import java.sql.DriverManager;
import java.sql.*;
import java.util.ArrayList;

public class DataBaseManager {

	Statement stmt = null;
	Connection conn = null;

	public DataBaseManager() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			conn = (Connection) DriverManager
					.getConnection("jdbc:mysql://localhost:3306/swabhav?user=root&password=root");
			stmt = (Statement) conn.createStatement();
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	public void update(String set, Object setValue, String condValue) {
		try {
			int rows = stmt
					.executeUpdate("update Student set " + set + "='" + setValue + "' where id ='" + condValue + "'");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void delete(String condValue) {
		try {
			int rows = stmt.executeUpdate("delete from Student where id ='" + condValue + "'");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void insert(String id, String name, int rollNo, int age) {
		try {
			int rows = stmt.executeUpdate(
					"insert into Student values('" + id + "','" + name + "'," + rollNo + "," + age + ")");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public ArrayList<String[]> getData() {
		ArrayList<String[]> students = new ArrayList<String[]>();
		ResultSet rs = null;
		try {
			rs = (ResultSet) stmt.executeQuery("select * from Student");
			if (rs != null) {
				while (rs.next()) {
					String id = rs.getString(1);
					String name = rs.getString(2);
					Integer rollNo = rs.getInt(3);
					Integer age = rs.getInt(4);
					String[] student = { id, name, rollNo.toString(), age.toString() };
					students.add(student);
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return students;
	}
}
