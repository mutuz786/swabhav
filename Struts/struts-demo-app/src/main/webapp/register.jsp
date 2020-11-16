<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Register</title>
<style>
.errorMessage {
	color: red;
}
</style>
</head>
<body>
	<s:form action="registerData" method="post" autocomplete="off">
		<s:textfield name="name" label="Name" />
		<s:textfield name="email" label="Email" />
		<s:textfield name="username" label="Username" />
		<s:password name="password" label="Password" />
		<s:password name="passwordRepeat" label="Password Repeat" />
		<s:submit value="Register" />
	</s:form>
</body>
</html>