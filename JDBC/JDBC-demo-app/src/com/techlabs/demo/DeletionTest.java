package com.techlabs.demo;

import java.sql.*;
import java.sql.Connection;
import java.sql.Statement;


public class DeletionTest {


	public static void main(String[] args) throws Exception {
		Connection conn = null;
		ResultSet rs = null;
		Statement stmt = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/swabhav?user=root&password=root");
			stmt = conn.createStatement();
			rs = stmt.executeQuery("select * from intern");
			System.out.println("before");
			while (rs.next()) {
				System.out.println(rs.getInt(1) + " " + rs.getString(2) + " " + rs.getString(3));
			}
			
			int rows = stmt.executeUpdate("delete from intern where name='sagar'");
			
			rs = stmt.executeQuery("select * from intern");
			System.out.println("after");
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
