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
.check-with-label:checked+.label-for-check {
	text-decoration-line: line-through;
}

td, th {
	text-align: center;
}
.leftAlign {
	text-align: left;
}
</style>
</head>
<body>
	<div id="header"></div>
	<br>
	<ul class="nav nav-pills">
		<li class="nav-item"><a class="nav-link" href="task">Back</a></li>
		<li class="nav-item"><a class="nav-link" href="addSubTask">Add</a></li>
	</ul>
	<br>
	<table class="table table-dark">
		<tr>
			<th scope="col" class="leftAlign">TITLE</th>
			<th scope="col">DATE</th>
			<th scope="col" width="100px">EDIT</th>
			<th scope="col" width="100px">DELETE</th>
		</tr>
		<s:iterator value="subTasks">
			<tr>
				<td class="leftAlign"><s:form action="subTask.check" method="post">
						<s:hidden name="id" value="%{id}" />
						<input type="checkbox" class="check-with-label" id="exampleCheck1"
							onchange="this.form.submit()" name="done" value="true"
							<s:if test = "done"> checked="checked"</s:if>>
						<label class="label-for-check" for="exampleCheck1"> <s:property
								value="title" /></label>
					</s:form></td>
				<td><s:property value="date" /></td>
				<td width="100px"><s:form action="editSubTask" method="get">
						<s:hidden name="id" value="%{id}" />
						<s:submit value="Edit" class="btn btn-warning" theme="simple"/>
					</s:form></td>
				<td width="100px"><s:form action="deleteSubTask.do"
						method="post">
						<s:hidden name="id" value="%{id}" />
						<s:submit value="Delete" class="btn btn-danger" theme="simple"/>
					</s:form></td>
			</tr>
		</s:iterator>
	</table>
</body>
</html>