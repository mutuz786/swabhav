package com.techlabs.model;

import java.io.File;
import java.io.FileWriter;
import java.io.Writer;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ReadWriteIntoFileFromDB {
	public static void main(String[] args) throws Exception {
		Connection connection = null;
		String data = "";
		try {
			Class.forName("com.mysql.jdbc.Driver");
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/swabhav?user=root&password=root");
			Statement stmt = connection.createStatement();
			ResultSet rs = stmt.executeQuery("select * from emp");
			while (rs.next()) {
				data = data + rs.getInt(1) + "," + rs.getString(2) + "," + rs.getString(3) + "," + rs.getString(4) + ","
						+ rs.getString(5) + "," + rs.getString(6) + "," + isNullInt(rs.getString(7)) + "\n";
			}
		} catch (Exception e) {
			System.out.println(e);
		} finally {
			connection.close();
		}
		System.out.println(data);
		File file = new File("person.txt");
		Writer writer = new FileWriter(file);
		writer.write(data);
		writer.close();

	}

	private static String isNullInt(String data) {
		if (data == null)
			return "0";
		else
			return data;
	}
	private static String isNullStr(String data) {
		if (data == null)
			return "empty";
		else
			return data;
	}
}
