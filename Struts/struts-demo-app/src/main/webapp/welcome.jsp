<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Welcome</title>
</head>
<body>

	<s:form action="welcome">
		<s:textfield name="developer" label="developer" />
		<br>
		<s:submit />
	</s:form>


	<h1>
		<%
			for (int i = 0; i < 5; i++) {
		%>
		Welcome
		<s:property value="developer" />
		<br>
		<%
			}
		%>
	</h1>

</body>
</html>