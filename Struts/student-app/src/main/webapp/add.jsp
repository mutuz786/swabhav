<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add Students</title>
</head>
<body>
	<s:form action="addStudent" method="post">
		<s:textfield name="name" label="Name"></s:textfield>
		<s:textfield name="age" label="Age"></s:textfield>
		<s:textfield name="email" label="Email"></s:textfield>
		<s:textfield name="cgpa" label="CGPA"></s:textfield>
		<s:submit value="Add" />
	</s:form>

</body>
</html>