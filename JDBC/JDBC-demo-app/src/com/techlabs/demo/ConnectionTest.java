package com.techlabs.demo;

import java.sql.*;

public class ConnectionTest {
	public static void main(String[] args) throws Exception {
		Connection connection=null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/swabhav?user=root&password=root");
			Statement stmt=connection.createStatement();
			ResultSet rs=stmt.executeQuery("select * from emp");
			while(rs.next()) {
				System.out.println(rs.getInt(1)+"\t"+rs.getString(2)+"\t"+rs.getString(3));
			}
		}
		catch(Exception e) {
			System.out.println(e);
		}
		finally {
			connection.close();
		}
	}
}