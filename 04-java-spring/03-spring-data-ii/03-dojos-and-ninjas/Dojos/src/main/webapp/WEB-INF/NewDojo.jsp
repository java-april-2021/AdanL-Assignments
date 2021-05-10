<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Make your Dojo</title>
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.0/dist/css/bootstrap.min.css" integrity="sha384-B0vP5xmATw1+K9KRQjQERJvTumQW0nPEzvF6L/Z6nronJ3oUOFUFpCjEUQouq2+l" crossorigin="anonymous">

</head>
<body>

	 <div class="containter">
	 	<h1>Build A Dojo</h1>
	 	<form:form method="POST" action="/dojo" modelAttribute="dojo">
	 		<form:label path="name">Dojo Name</form:label>
	 		<form:errors path="name"/>
	 		<form:input path="name"/>
	 		<form:button>Create</form:button>
	 	</form:form>
	 	<a href="/ninja">Add Ninja</a>
	 </div>
	 	
	
</body>
</html>