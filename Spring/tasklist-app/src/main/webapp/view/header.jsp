<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<header>
	<nav class="navbar navbar-dark bg-dark">
		<h3 class="text-white h1">Tasklist App</h3>
		<ul class="nav justify-content-center">
			<li class="nav-item"><a class="nav-link" href="home">Home</a></li>
			<%
				Object user = session.getAttribute("user");
				if (user == null) {
			%>
			<li class="nav-item"><a class="nav-link" href="login">Login</a></li>
			<%
				} else {
			%>
			<li class="nav-item"><a class="nav-link" href="logout">Logout</a></li>
			<%
				}
			%>
			<li class="nav-item"><a class="nav-link" href="register">Register</a></li>
		</ul>
	</nav>
</header>