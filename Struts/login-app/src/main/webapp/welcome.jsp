<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Welcome</title>
</head>
<body>
	<h2>
		Welcome
		<s:property value="username" />
	</h2>
	<a href="logoutDo" >logout</a>
</body>
</html>