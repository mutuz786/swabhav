<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>TaskList</title>
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/css/bootstrap.min.css"
	integrity="sha384-TX8t27EcRE3e/ihU7zmQxVncDAy5uIKz4rEkgIXeMed4M0jlfIDPvg6uqKI2xXr2"
	crossorigin="anonymous">
</head>
<body class="jumbotron">
	<h2 class="display-4">Edit User</h2>
	<hr class="my-4">
	<center>
		<br> <br> <br>
		<s:form action="editUser.do" method="post">
			<s:hidden name="id" value="%{editUserVM.id}" />
			<s:textfield name="firstName" value="%{editUserVM.firstName}"
				label="Enter First Name" class="form-control" />

			<s:textfield name="lastName" value="%{editUserVM.lastName}"
				label="Enter Last Name" class="form-control" />

			<s:textfield name="email" value="%{editUserVM.email}"
				label="Enter Email" class="form-control" />

			<s:textfield name="username" value="%{editUserVM.username}"
				label="Enter Username" class="form-control" />

			<s:password name="password" value="%{editUserVM.password}"
				label="Enter Password" class="form-control" />

			<s:submit value="Edit" class="btn btn-primary" />
		</s:form>
	</center>

</body>
</html>