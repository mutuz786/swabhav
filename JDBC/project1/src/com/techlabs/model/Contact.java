package com.techlabs.model;

import java.sql.*;

public class Contact {
	Connection connection = null;
	Statement statement = null;

	public Contact() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/swabhav?user=root&password=root");
			connection.setAutoCommit(false);
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	public String display() throws Exception {
		String data = "";
		ResultSet rs;
		try {
			statement = connection.createStatement();
			rs = statement.executeQuery("select * from contact");
			while (rs.next()) {
				data = data + rs.getString(1) + "\t\t" + rs.getString(2) + "\t\t" + rs.getBigDecimal(3) + "\t\t"
						+ rs.getString(4) + "\n";
			}
			connection.commit();
		} catch (SQLException e) {
			connection.rollback();
			e.printStackTrace();
		}
		return data;
	}

	public void add(Entry entry) throws Exception {
		try {
			statement.executeUpdate("insert into contact(fname,lname,number,email)\r\n" + " values('" + entry.getFname()
					+ "','" + entry.getLname() + "'," + entry.getNumber() + ",'" + entry.getEmail() + "')");
			connection.commit();
		} catch (SQLException e) {
			connection.rollback();
			e.printStackTrace();
		}
	}

	public void delete(Condition condition, String attribute) throws Exception {
		try {
			statement.executeUpdate("delete from contact where " + condition + "='" + attribute + "'");
			connection.commit();
		} catch (SQLException e) {
			connection.rollback();
			e.printStackTrace();
		}
	}

	public void close() {
		try {
			connection.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
