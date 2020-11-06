<%@page import="com.techlab.model.Student"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Edit</title>
</head>
<body>

	<%
		Student student = (Student) request.getAttribute("student");
	%>
<center>
<h2>Edit Data</h2>
	<form action="editCtrl" method="post">
		<input type="hidden" name="id" value='${student.getId()}'>
		Name: <input type="text" name="name" value='${student.getName()}'><br>
		<br> Age: <input type="number" name="age" value='${student.getAge()}'><br>
		<br> Address: <input type="text" name="address" value='${student.getAddress()}'><br>
		<br> cgpa: <input type="text" name="cgpa" value='${student.getCgpa()}'><br>
		<br>
		<input type="submit" value="Edit">
	</form>
</center>
</body>
</html>