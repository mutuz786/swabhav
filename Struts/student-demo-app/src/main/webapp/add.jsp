<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add</title>
</head>
<body>
<center>
<h2>Add  Data</h2>
	<form action="addCtrl" method="post">
		<input type="hidden" name="id" >
		Name: <input type="text" name="name" ><br><br> 
		Age: <input type="number" name="age"><br><br> 
		Address: <input type="text" name="address" ><br><br> 
		cgpa: <input type="text" name="cgpa"><br><br>
		<input type="submit" value="Edit">
	</form>
</center>
</body>
</html>