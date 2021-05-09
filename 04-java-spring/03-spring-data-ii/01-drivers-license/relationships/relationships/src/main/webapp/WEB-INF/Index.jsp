<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
        <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
        <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Welcome</title>
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.0/dist/css/bootstrap.min.css" integrity="sha384-B0vP5xmATw1+K9KRQjQERJvTumQW0nPEzvF6L/Z6nronJ3oUOFUFpCjEUQouq2+l" crossorigin="anonymous">	
</head>
<body>
	<div class="container">
		<div class ="table table-dark">
			<h1>New Person</h1>
			<form:form method="POST" action= "/add" modelAttribute="person">
				<p><form:label path = "firstName" id="firstName">First Name</form:label>
					<form:errors path = "firstName"/>
					<form:input path ="firstName"/>
				</p>
				<p><form:label path = "lastName" id= "lastName">Last Name</form:label>
					<form:errors path = "lastName"/>
					<form:input path= "lastName"/>
				</p>
				<input type = "submit" value = "add"/>
			</form:form>
		</div>
		<a href="/">Show All</a>
	</div>
	
</body>
</html>