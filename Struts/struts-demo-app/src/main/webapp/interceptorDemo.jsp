<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Interceptor Demo</title>
</head>
<body>
	<h1>Interceptor Demo</h1><br>
	<h3>Enter num between 0-100</h3>
	<s:form action="interceptDemo" method="post">
		<s:textfield name="num" label="number" />
		<s:submit value="Check" />
	</s:form>
	Valid Value:<s:property value="num" />

</body>
</html>