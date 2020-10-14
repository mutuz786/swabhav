package com.techlabs.demo;

import java.sql.*;
import java.sql.Connection;
import java.sql.Statement;

import com.mysql.jdbc.*;

public class InsertionTest {
	public static void main(String[] args) throws Exception {
		Connection conn = null;
		ResultSet rs = null;
		Statement stmt = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/swabhav?user=root&password=root");
			stmt = conn.createStatement();
			int rows = stmt.executeUpdate("insert into intern(id,name,address)\r\n" + " values(2,'sagar','dubai')");
			rs = stmt.executeQuery("select * from intern");
			while (rs.next()) {
				System.out.println(rs.getInt(1) + " " + rs.getString(2) + " " + rs.getString(3));
			}

		} catch (Exception e) {
			System.out.println(e);
		} finally {
			conn.close();
		}
	}
}
