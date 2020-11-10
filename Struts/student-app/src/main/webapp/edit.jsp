<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Edit Students</title>
</head>
<body>
	<s:form action="editStudent" method="post">
		<s:hidden name="id" value="%{student.id}" />
		<s:textfield name="name" value="%{student.name}" label="Name" />
		<s:textfield name="age" value="%{student.age}" label="Age"></s:textfield>
		<s:textfield name="email" value="%{student.email}" label="Email"></s:textfield>
		<s:textfield name="cgpa" value="%{student.cgpa}" label="CGPA"></s:textfield>
		<s:submit value="Edit" />
	</s:form>

</body>
</html>