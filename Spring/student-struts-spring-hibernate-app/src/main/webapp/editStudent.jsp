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
		<s:hidden name="id" value="%{editVM.id}" />
		<s:textfield name="name" value="%{editVM.name}" label="Name" />
		<s:textfield name="address" value="%{editVM.address}" label="Address"></s:textfield>
		<s:textfield name="age" value="%{editVM.age}" label="Age"></s:textfield>
		<s:submit value="Edit" />
	</s:form>

</body>
</html>