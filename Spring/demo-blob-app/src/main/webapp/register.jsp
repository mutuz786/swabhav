<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Tasklist</title>
</head>
<body>
	<s:a href="display">display</s:a>

	<s:form action="add.do" method="POST" enctype="multipart/form-data">
		<s:textfield name="id" label="ID" />
		<s:textfield name="name" label="Name" />
		<s:file name="img" label="Enter Profile" />
		<s:submit value="Submit" />
	</s:form>

</body>
</html>