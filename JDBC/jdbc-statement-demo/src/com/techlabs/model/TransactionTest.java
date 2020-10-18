package com.techlabs.model;

import java.sql.*;

public class TransactionTest {
	static Connection connection = null;
	static Statement stmt = null;

	public static void main(String[] args) throws Exception {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/swabhav?user=root&password=root");
			connection.setAutoCommit(false);
			stmt = connection.createStatement();

			System.out.println("BEFORE TRANSACTION:\nmerchant table:");
			display("merchant");
			System.out.println("customer table:");
			display("customer1");

			DoCustTransaction(1, 123, 500);
			// DoCustTransaction(2, 123, 100);
			// DoCustTransaction(2, 123, 100);

			System.out.println("AFTER TRANSACTION:\nmerchant table:");
			display("merchant");
			System.out.println("customer table:");
			display("customer1");

		} catch (Exception e) {
			System.out.println(e);
		}

		finally {
			connection.close();

		}
	}

	private static void DoCustTransaction(int custId, int merchId, int amount) throws Exception {
		try {
			float custBal = getBalance(custId, "customer1");
			float merchBal = getBalance(merchId, "merchant");
			stmt.executeUpdate("update customer1 set balance=" + (custBal - amount) + " where id=" + custId);
			stmt.executeUpdate("update merchanw set balance=" + (merchBal + amount) + " where id=" + merchId);
			connection.commit();

		} catch (Exception e) {
			connection.rollback();
		}
	}

	private static float getBalance(int id, String tableName) throws Exception {
		ResultSet rs = stmt.executeQuery("select * from " + tableName);
		while (rs.next()) {
			if (rs.getInt(1) == id) {
				return rs.getFloat(3);
			}
		}
		return 0;
	}

	private static void display(String tableName) throws Exception {
		ResultSet rs = stmt.executeQuery("select * from " + tableName);
		while (rs.next()) {
			System.out.println(rs.getInt(1) + "\t" + rs.getString(2) + "\t" + rs.getString(3));
		}
	}
}