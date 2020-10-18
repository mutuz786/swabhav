package com.techlabs.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class StatementFilterTest {
	public static void main(String[] args) throws Exception {
		System.out.println("Enter Empno:");
		Scanner scan = new Scanner(System.in);
		String empno = scan.nextLine();
		Connection connection = null;
		String data = "";
		try {
			Class.forName("com.mysql.jdbc.Driver");
			connection = DriverManager.getConnection("jdbc:mysql://localhost:4040/swabhav?user=root&password=root");
			Statement stmt = connection.createStatement();
			
			ResultSet rs = stmt.executeQuery("select * from emp where empno=" + empno);
			
			while (rs.next()) {
				data = data + rs.getInt(1) + "," + rs.getString(2) + "," + rs.getString(3) + "," + rs.getString(4) + ","
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
