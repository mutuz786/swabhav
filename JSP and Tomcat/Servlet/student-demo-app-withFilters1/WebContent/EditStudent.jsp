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
	
	%>
		<form action='editStudC' method='post'>
		<input type='hidden' name='id' value='<%=student.getId()%>' >
		Name:
		<input type='text' name='name' value='<%=student.getName() %>'>
		<br>
		RollNo:
		<input type='text' name='rollNo' value='<%=student.getRollNo() %>'>
		<br>
		Age:
		<input type='text' name='age' value='<%=student.getAge() %>'>
		<br><input type='submit' value='submit'></form>
</body>
</html>