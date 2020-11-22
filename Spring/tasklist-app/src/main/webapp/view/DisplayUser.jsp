<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>TaskList</title>
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/css/bootstrap.min.css">
<script src="http://code.jquery.com/jquery-3.5.1.min.js"></script>
<script src="headerScript"></script>
<link rel="stylesheet" href="style">
<style type="text/css">
td, th {
	text-align: center;
}
</style>
</head>
<body>
	<div id="header"></div>

	<br>
	<%
		boolean isAdmin = (boolean) session.getAttribute("isAdmin");
		if (isAdmin) {
	%>
	<a class="nav-link active" href="register">Add</a>
	<%
		}
	%>
	<br>
	<table class="table table-dark">
		<tr>
			<th scope="col">ID</th>
			<th scope="col">FIRST NAME</th>
			<th scope="col">LAST NAME</th>
			<th scope="col">EMAIL</th>
			<th scope="col">USERNAME</th>
			<th scope="col">PASSWORD</th>
			<th scope="col">TASK COUNT</th>
			<th scope="col" width="100px">TASKS</th>
			<th scope="col" width="100px">EDIT</th>
			<th scope="col" width="100px">DELETE</th>
			<%
				if (isAdmin) {
			%>
			<th scope="col" width="100px">BLOCKED</th>
			<%
				}
			%>
		</tr>
		<s:iterator status="status" value="users">
			<tr class="hover-class">
				<td><s:property value="id" /></td>
				<td><s:property value="firstName" /></td>
				<td><s:property value="lastName" /></td>
				<td><s:property value="email" /></td>
				<td><s:property value="username" /></td>
				<td><s:property value="password" /></td>
				<td><s:property value="lengths[#status.index]" /></td>
				<td width="100px"><s:form action="task" method="post">
						<s:hidden name="id" value="%{id}" />
						<s:submit value="Tasks" class="btn btn-success" />
					</s:form></td>
				<td width="100px"><s:form action="editUser" method="get">
						<s:hidden name="id" value="%{id}" />
						<s:submit value="Edit" class="btn btn-warning" />
					</s:form></td>
				<td width="100px"><s:form action="deleteUser.do" method="post">
						<s:hidden name="id" value="%{id}" />
						<s:submit value="Delete" class="btn btn-danger" />
					</s:form></td>
				<%
					if (isAdmin) {
				%>
				<td width="100px"><s:form action="setBlocked.do" method="post">
						<s:hidden name="id" value="%{id}" />
						<s:checkbox name="blocked" fieldValue="%{bloocked}"
							onChange="this.form.submit()" />
						<s:property value="title" />
					</s:form></td>
				<%
					}
				%>

			</tr>
		</s:iterator>
	</table>

</body>
</html>