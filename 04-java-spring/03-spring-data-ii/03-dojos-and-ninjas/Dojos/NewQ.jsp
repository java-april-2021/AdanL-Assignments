<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add New Question</title>
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.0/dist/css/bootstrap.min.css" integrity="sha384-B0vP5xmATw1+K9KRQjQERJvTumQW0nPEzvF6L/Z6nronJ3oUOFUFpCjEUQouq2+l" crossorigin="anonymous">
</head>
<body>
	<div class="container">
		<h1>What is Your Question</h1>
		
		<form:form action="/new" method="post" modelAttribute="newQuestion">
		<div>
			<form:label path="question">Question</form:label>
			<form:errors path="question"></form:errors>
			<form:textarea path="question"/>
		</div>
		<div>
			<form:label path="tags">Tags</form:label>
			<form:errors path="tags"></form:errors>
			<form:input path="tags"/>
		</div>
			<form:button>Add Question</form:button>
		</form:form>
	</div>
</body>
</html>