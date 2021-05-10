<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add a Ninja</title>
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.0/dist/css/bootstrap.min.css" integrity="sha384-B0vP5xmATw1+K9KRQjQERJvTumQW0nPEzvF6L/Z6nronJ3oUOFUFpCjEUQouq2+l" crossorigin="anonymous">

</head>
<body>

	<div class="container">
		
	 	<h1>Add a Ninja</h1>
	 	
	 	<form:form method="POST" action="/ninja" modelAttribute="ninja">
	 		 		<div class="form-group">
		 		<form:label path="dojo">Dojo</form:label>
		 		<form:errors path="dojo"/>
		 		<form:select path="dojo">
		 			<c:forEach items="${dojo}" var="dojo">
		 				<option value="${dojo.id}">${dojo.name}</option>
		 			</c:forEach>		 			
		 		</form:select>
	 		</div>
	 		<div class="form-group">
		 		<form:label path="firstName">First Name:</form:label>
		 		<form:errors path="firstName"/>
		 		<form:input path="firstName"/>
	 		</div>
	 		<div class="form-group">
		 		<form:label path="lastName">Last Name:</form:label>
		 		<form:errors path="lastName"/>
		 		<form:input path="lastName"/>
	 		</div>
	 		<div class="form-group">
		 		<form:label path="age">Age:</form:label>
		 		<form:errors path="age"/>
		 		<form:input path="age"/>
	 		</div>
	 		<form:button>Create</form:button>
	 	</form:form>
	 	<a href="/dojo">Add Dojo</a>
	 </div>

	
	 
</body>
</html>