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
	
<style type="text/css">
.errorMessage {
	color: red;
}
</style>
</head>
<body class="jumbotron">
	<h1 class="display-4">Welcome</h1>
	<hr class="my-4">
	<ul class="nav">
		<li class="nav-item"><a class="nav-link active" href="">Login</a>
		</li>
		<li class="nav-item"><a class="nav-link" href="register">Register</a></li>
	</ul>
	<hr class="my-4">

	<s:form action="login.do" method="post">
		<s:textfield name="username" label="Enter Username"
			class="form-control" />
		<s:password name="password" label="Enter Password"
			class="form-control" />
		<s:submit value="Login" class="btn btn-primary" />
	</s:form>

</body>
</html>