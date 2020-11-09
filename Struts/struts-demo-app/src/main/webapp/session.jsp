<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Session Count</title>
</head>
<body>
	<h1>
		OldCount:
		<s:property value="#session.oldC" />
		<br> <br> NewCount:
		<s:property value="#session.newC" />

	</h1>
</body>
</html>