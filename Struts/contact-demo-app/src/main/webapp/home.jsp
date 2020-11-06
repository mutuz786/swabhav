<%@page import="com.techlabs.model.Contact"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Home</title>
<style type="text/css">
table {
	border-collapse: collapse;
	width: 100%;
}

td, th {
	border: 1px solid #d7e4db;
	background-color: rgb(9, 214, 77);
	text-align: center;
	padding: 10px;
}

td {
	background-color: rgb(255, 255, 255);
}
</style>
</head>
<body>
	<center>
		<h2>Home Page</h2>
		<table>
			<tr>
				<td>Id</td>
				<td>First Name</td>
				<td>Middle Name</td>
				<td>Last Name</td>
				<td>Phone No</td>
				<td>Email</td>
				<td>Edit</td>
				<td>Delete</td>
			</tr>
			<%
				List<Contact> contacts = (List<Contact>) request.getAttribute("contacts");
				if (contacts != null) {
					for (Contact contact : contacts) {
						out.print("<tr>");
						out.print("<td>" + contact.getId() + "</td>");
						out.print("<td>" + contact.getFname() + "</td>");
						out.print("<td>" + contact.getMname() + "</td>");
						out.print("<td>" + contact.getLname() + "</td>");
						out.print("<td>" + contact.getPhoneNo() + "</td>");
						out.print("<td>" + contact.getEmail() + "</td>");
						out.print("<td><form action='edit' method='get'><input type='hidden'name='id' value='"
								+ contact.getId() + "'><input type='submit' value='Edit'></form></td>");
						out.print("<td><form action='deleteCtrl' method='post'><input type='hidden'name='id' value='"
								+ contact.getId() + "'><input type='submit' value='Delete'></form></td>");
						out.print("<tr>");
					}
				}
			%>
		</table>
		<a href="add">Add</a>
		<a href="logoutCtrl">LogOut</a>
	</center>
</body>
</html>