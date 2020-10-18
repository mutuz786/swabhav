package com.techlabs.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.util.Scanner;
import com.mysql.jdbc.PreparedStatement;

public class PreparedStatementFilterTest {
	public static void main(String[] args) throws Exception {
		System.out.println("Enter Empno:");
		Scanner scan = new Scanner(System.in);
		String empno = scan.nextLine();
		Connection connection = null;
		String data = "empty";
		try {
			Class.forName("com.mysql.jdbc.Driver");
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3036/swabhav?user=root&password=root");
			PreparedStatement stmt = (PreparedStatement) connection.prepareStatement("select * from emp where empno=?");
			stmt.setString(1, empno);
			ResultSet rs = stmt.executeQuery();
			
			while (rs.next()) {
				data = rs.getInt(1) + "," + rs.getString(2) + "," + rs.getString(3) + "," + rs.getString(4) + ","
						+ rs.getString(5) + "," + rs.getString(6) + "," + rs.getString(7) + "\n";
			}
		} catch (Exception e) {
			System.out.println(e);
		} finally {
			connection.close();
		}
		System.out.println(data);
	}
}