<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Tasklist</title>
<style>
.check-with-label:checked+.label-for-check {
	text-decoration-line: line-through;
}
</style>
</head>
<body>
	<s:a href="display">display</s:a>

	<s:checkbox name="done" fieldValue="%{done}"
		onChange="this.form.submit()" class="check-with-label" theme="simple"
		id="hello" />
	<label class="label-for-check" for="hello"><s:property
			value="title" /></label>


	<input type="checkbox" class="check-with-label" id="exampleCheck1" onchange="alert('hello')">
	<label class="label-for-check" for="exampleCheck1">Check me
		out</label>

</body>
</html>