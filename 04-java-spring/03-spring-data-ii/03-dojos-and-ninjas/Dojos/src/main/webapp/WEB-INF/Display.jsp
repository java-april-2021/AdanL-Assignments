<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.0/dist/css/bootstrap.min.css" integrity="sha384-B0vP5xmATw1+K9KRQjQERJvTumQW0nPEzvF6L/Z6nronJ3oUOFUFpCjEUQouq2+l" crossorigin="anonymous">

<title>All Ninjas</title>
</head>
<body>
	<div class="container">
	<h1>${ dojos.name } Ninjas </h1>
		<table class= "table table-dark">
			<thead>
		
				<tr>
					<th>First Name</th>
					<th>Last Name</th>
					<th>Age</th>
				</tr>			
			</thead>
			<tbody>
				<c:forEach items="${dojos.ninjas}" var="ninja"> 
					<tr>
					<td>${ninja.firstName}</td>
					<td>${ninja.lastName}</td>
					<td>${ninja.age}</td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
	<a href="/ninja">Add Ninja</a>
	<a href="/dojo">Add Dojo</a>
	</div>

</body>
</html>