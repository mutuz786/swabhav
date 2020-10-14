package com.techlabs.crudtest;

import java.sql.*;

public class CRUDTest {
	static Statement stmt = null;

	public static void main(String[] args) throws Exception {
		Connection conn = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/swabhav?user=root&password=root");
			stmt=conn.createStatement();
			display();
			insert(4,"rahul","thane");
			System.out.println("after insertion");
			display();
			delete("id","1");
			System.out.println("after deletion");
			display();
			update("id","1","name","rahul");
			System.out.println("after updation");
			display();
			
		} catch (Exception e) {
			System.out.println(e);
		}
		finally {
			conn.close();
		}
		
	}

	private static void update(String set, String setValue, String cond, String condValue) throws Exception {
		int rows = stmt.executeUpdate("update intern set "+set+"='"+setValue+"' where "+cond+"='"+condValue+"'");
	}

	private static void delete(String cond, String condValue) throws Exception {
		int rows = stmt.executeUpdate("delete from intern where "+cond+"='"+condValue+"'");
	}

	private static void insert(int id,String name, String address) throws Exception {
		int rows = stmt.executeUpdate("insert into intern values("+id+",'"+name+"','"+address+"')");
	}

	private static void display() throws Exception {
		ResultSet rs = stmt.executeQuery("select * from intern");
		while (rs.next()) {
			System.out.println(rs.getInt(1) + " " + rs.getString(2) + " " + rs.getString(3));
		}
	}
}
