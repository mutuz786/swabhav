package com.techlabs.crudtest;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.Reader;
import java.sql.*;
import java.sql.Connection;
import java.sql.Statement;
import java.util.ArrayList;


public class TxtFileInsertionTest {
	public static void main(String[] args) throws Exception {
		Connection conn = null;
		ResultSet rs = null;
		Statement stmt = null;

		ArrayList<String> data = getData();

		try {
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/swabhav?user=root&password=root");
			stmt = conn.createStatement();
			rs = stmt.executeQuery("select * from intern");
			while (rs.next()) {
				System.out.println(rs.getInt(1) + " " + rs.getString(2) + " " + rs.getString(3));
			}
			for (String line : data) {
				String[] items=line.split(",");
				int rows = stmt.executeUpdate("insert into intern(id,name,address)\r\n" + " values(" + items[0] + ",'" + items[1]
						+ "','" + items[2] + "')");
			}

			rs = stmt.executeQuery("select * from intern");
			System.out.println("after insertion");
			while (rs.next()) {
				System.out.println(rs.getInt(1) + " " + rs.getString(2) + " " + rs.getString(3));
			}

		} catch (Exception e) {
			System.out.println(e);
		} finally {
			conn.close();
		}
	}

	private static ArrayList<String> getData() {
		ArrayList<String> lines = new ArrayList<String>();
		try {
			File file = new File("candidate.txt");
			Reader reader = new FileReader(file);
			BufferedReader buffer = new BufferedReader(reader);
			String line;
			while ((line = buffer.readLine()) != null) {
				lines.add(line);
			}
			buffer.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return lines;
	}
}
