<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Edit Students</title>
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/css/bootstrap.min.css"
	integrity="sha384-TX8t27EcRE3e/ihU7zmQxVncDAy5uIKz4rEkgIXeMed4M0jlfIDPvg6uqKI2xXr2"
	crossorigin="anonymous">
</head>
<body class="jumbotron">
	<h2 class="display-4">Edit Student</h2>
	<hr class="my-4">
	<center>
		<br> <br> <br>
		<s:form action="editStudent" method="post">
			<s:hidden name="id" value="%{student.id}" />
			<s:textfield name="name" value="%{student.name}" label="Name"
				class="form-control" />
			<s:textfield name="age" value="%{student.age}" label="Age"
				class="form-control" />
			<s:textfield name="email" value="%{student.email}" label="Email"
				class="form-control" />
			<s:textfield name="cgpa" value="%{student.cgpa}" label="CGPA"
				class="form-control" />
			<s:submit value="Edit" class="btn btn-primary" />
		</s:form>
	</center>

</body>
</html>