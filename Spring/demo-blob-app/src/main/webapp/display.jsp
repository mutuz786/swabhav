<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Tasklist</title>
<style>
table, th, td {
	border: 1px solid black;
	border-collapse: collapse;
}
</style>
</head>
<body>

	<table>
		<tr>
			<th>ID</th>
			<th>Name</th>
			<th>Image</th>
		</tr>
		<s:iterator value="persons">
			<tr>
				<td><s:property value="id" /></td>
				<td><s:property value="name" /></td>
				<td><img width="200px" height="200px" id="authorImg"
					src="<s:url action='imageFetch'><s:param name='id' value='%{id}'></s:param></s:url>" /></td>
			</tr>
		</s:iterator>
	</table>
	<s:a href="home">ADD</s:a>
</body>
</html>