<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Register</title>
</head>
<body>
	<h1>Welcome,</h1>
	<br> Registration successfull,
	<br> the following are the details:
	<br> Name:
	<s:property value="name" />
	<br> Email:
	<s:property value="email" />
	<br> Username
	<s:property value="username" />
	<br> Password:
	<s:property value="password" />
	<br>
	<s:a href="register">Register Form</s:a>
</body>
</html>