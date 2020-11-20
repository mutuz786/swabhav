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

</head>
<body>
	<div id="header"></div>
	<br>
	<ul class="nav nav-pills">
		<li class="nav-item"><a class="nav-link" href="task">Back</a></li>
		<%
			boolean isAdmin = (boolean) session.getAttribute("isAdmin");
			if (isAdmin) {
		%>
		<li class="nav-item"><a class="nav-link" href="addSubTask">Add</a></li>
		<%
			}
		%>
	</ul>
	<br>
	<table class="table table-dark">
		<tr>
			<th scope="col">TITLE</th>
			<th scope="col">DATE</th>
			<%
				if (isAdmin) {
			%>
			<th scope="col">EDIT</th>
			<th scope="col">DELETE</th>
			<%
				}
			%>
		</tr>
		<s:iterator value="subTasks">
			<tr class="hover-class">
				<td><s:form action="subTask.check" method="post">
						<s:hidden name="id" value="%{id}" />
						<s:checkbox theme="simple" name="done" fieldValue="%{done}"
							onChange="this.form.submit()" class="check" />

						<s:property value="title" />
					</s:form></td>
				<td><s:property value="date" /></td>
				<%
					if (isAdmin) {
				%>
				<td><s:form action="editSubTask" method="get">
						<s:hidden name="id" value="%{id}" />
						<s:submit value="Edit" class="btn btn-warning" />
					</s:form></td>
				<td><s:form action="deleteSubTask.do" method="post">
						<s:hidden name="id" value="%{id}" />
						<s:submit value="Delete" class="btn btn-danger" />
					</s:form></td>
				<%
					}
				%>
			</tr>
		</s:iterator>
	</table>
</body>
</html>