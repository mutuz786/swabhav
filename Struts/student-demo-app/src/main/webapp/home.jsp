<%@page import="com.techlab.model.Student"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Display</title>
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
				<td>Name</td>
				<td>Age</td>
				<td>Address</td>
				<td>Cgpa</td>
				<td>Edit</td>
				<td>Delete</td>
			</tr>
			<%
				List<Student> students = (List<Student>) request.getAttribute("students");
				if (students != null) {
					for (Student student : students) {
						out.print("<tr>");
						out.print("<td>" + student.getId() + "</td>");
						out.print("<td>" + student.getName() + "</td>");
						out.print("<td>" + student.getAge() + "</td>");
						out.print("<td>" + student.getAddress() + "</td>");
						out.print("<td>" + student.getCgpa() + "</td>");
						out.print("<td><form action='edit' method='post'><input type='hidden'name='id' value='"
								+ student.getId() + "'><input type='submit' value='Edit'></form></td>");
						out.print("<td><form action='deleteCtrl' method='post'><input type='hidden'name='id' value='"
								+ student.getId() + "'><input type='submit' value='Delete'></form></td>");
						out.print("<tr>");
					}
				}
			%>
		</table>
		<a href="add">Add</a>
	</center>
</body>
</html>