<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add Employee</title>
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/css/bootstrap.min.css"
	integrity="sha384-TX8t27EcRE3e/ihU7zmQxVncDAy5uIKz4rEkgIXeMed4M0jlfIDPvg6uqKI2xXr2"
	crossorigin="anonymous">
</head>
<body>
	<center>
		<br>
		<br>
		<br>
		<s:form action="editEmployee" method="post">
			<s:hidden name="id" value="%{employee.id}" />
			<s:textfield name="name" value="%{employee.name}" label="Name"
				class="form-control" />
			<s:textfield name="post" value="%{employee.post}" label="Post"
				class="form-control" />
			<s:textfield name="sal" value="%{employee.sal}" label="Salary"
				class="form-control" />
			<s:textfield name="doj" value="%{employee.doj}" label="Date"
				class="form-control" />
			<s:textfield name="dept" value="%{employee.dept}" label="Dept"
				class="form-control" />
			<s:submit value="Edit" class="btn btn-primary" />
		</s:form>
	</center>
</body>
</html>