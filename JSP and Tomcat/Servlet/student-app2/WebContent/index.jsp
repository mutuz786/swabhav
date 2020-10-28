<%@page import="java.util.ArrayList"%>
<%@page import="com.techlab.model.RegisterDB"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add Data</title>
<style>
#addForm {
	display: none;
}
</style>
</head>

<body>
	<div id="addForm">
		<form action="studAdd" method="post">
			Id: <input type="text" name="id"><br> First Name:<input
				type="text" name="fname"><br> Last Name: <input
				type="text" name="lname"><br> Address: <input
				type="text" name="address"><br> Email: <input
				type="text" name="email"><br> <input type="submit">
		</form>
	</div>
	<button onclick="add()">ADD</button>

	<%
		ArrayList<String[]> entries = RegisterDB.getData();
			out.print("<style> table, tr, td { border: 1px solid black; } </style>");
			out.print("<table>");
			for (String[] entry : entries) {
		out.print("<tr>");
		for (String item : entry) {
			out.println("<td>" + item + "</td>");
		}
		out.print("</tr>");
			}
			out.print("</table>");
	%>
	<script>
		function add() {
			var display = document.getElementById("addForm").style.display;
			if (display == "none") {
				document.getElementById("addForm").style.display = "block";
			} else {
				document.getElementById("addForm").style.display = "none";
			}
		}
	</script>
</body>

</html>