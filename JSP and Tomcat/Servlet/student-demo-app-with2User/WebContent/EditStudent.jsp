<%@page import="com.techlab.model.Student"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Edit Student</title>
</head>
<body>
	<%
		Student student = (Student) request.getAttribute("student");
		out.print("<form action='editStud' method='post'>");
		out.print("<input type='hidden' name='id' value='" + student.getId() + "' >");
		out.print("Name:<input type='text' name='name' value='" + student.getName() + "'>");
		out.print("<br>RollNo:<input type='text' name='rollNo' value='" + student.getRollNo() + "'>");
		out.print("<br>Age:<input type='text' name='age' value='" + student.getAge() + "'>");
		out.print("<br><input type='submit' value='submit'></form>");
	%>

</body>
</html>