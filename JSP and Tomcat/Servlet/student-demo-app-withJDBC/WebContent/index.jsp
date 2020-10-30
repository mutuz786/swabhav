<%@page import="com.techlab.service.StudentService"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Student</title>
<style>
table, tr, td {
	border: 1px solid black;
	text-align: center;
}
</style>
</head>
<body>
	<h1>Students</h1>
	<a href="AddStudent">Add</a>
	<table>
		<tr>
			<td>id</td>
			<td>name</td>
			<td>rollNo</td>
			<td>age</td>
			<td>edit</td>
			<td>delete</td>
		</tr>
		<%
			ArrayList<String[]> students = new ArrayList<String[]>();
			for (String[] student : students) {
				out.print("<tr>");
				out.println("<td>" + student[0] + "</td>");
				out.println("<td>" + student[1] + "</td>");
				out.println("<td>" + student[2] + "</td>");
				out.println("<td>" + student[3] + "</td>");
				out.println("<td> <a href='editStud?id=" + student[0] + "'>edit</a></td>");
				out.println("<td> <a href='deleteStud?id=" + student[0] + "'>delet</a></td>");
				out.print("</tr>");
			}
		%>
	</table>
</body>
</html>