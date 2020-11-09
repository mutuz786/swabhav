<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login</title>
</head>
<body>
	<h1>Login</h1>
	<s:form action="validate" method="post">
		<s:textfield name="username" label="username" />
		<s:password name="password" label="password" />
		<s:submit value="Login" />
	</s:form>
	<s:property value="message" />

</body>
</html>