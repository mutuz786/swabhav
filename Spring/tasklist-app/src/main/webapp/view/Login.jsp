<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>TaskList</title>
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/css/bootstrap.min.css">
<script src="http://code.jquery.com/jquery-3.5.1.min.js"></script>
<script src="headerScript"></script>
<link rel="stylesheet" href="style">

</head>
<body>
	<div id="header"></div>
	<br>
	<div align="center">
		<h3>Login</h3>
		<hr class="my-4">
		<br>
		<s:actionerror class="alert alert-danger"/>
		<s:form action="login.do" method="post">
			<s:textfield name="username" label="Enter Username"
				class="form-control" />
			<s:password name="password" label="Enter Password"
				class="form-control" />
			<s:checkbox name="admin" label="Login As Admin" />
			<s:submit value="Login" class="btn btn-primary" />
		</s:form>
	</div>
</body>
</html>