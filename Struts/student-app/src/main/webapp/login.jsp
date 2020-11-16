<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login</title>
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/css/bootstrap.min.css"
	integrity="sha384-TX8t27EcRE3e/ihU7zmQxVncDAy5uIKz4rEkgIXeMed4M0jlfIDPvg6uqKI2xXr2"
	crossorigin="anonymous">
</head>
</head>
<body>
	<center>
		<br> <br> <br>
		<s:form action="login" method="post">
			<s:textfield name="username" label="Username" class="form-control" />
			<s:password name="password" label="Password" class="form-control" />
			<s:submit value="Login" class="btn btn-primary" />
		</s:form>
	</center>
</body>
</html>