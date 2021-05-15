<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Products</title>
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.0/dist/css/bootstrap.min.css" integrity="sha384-B0vP5xmATw1+K9KRQjQERJvTumQW0nPEzvF6L/Z6nronJ3oUOFUFpCjEUQouq2+l" crossorigin="anonymous">
</head>
<body>
	<div class="container">
		<h1>New Product</h1>
		<form:form method="POST" action="/products/new" modelAttribute="newProduct">
			<div>
			<form:label path="name">Name</form:label>
			<form:errors path="name"></form:errors>
			<form:input path="name"/>	
			</div>
			<div>
			<form:label path="description">Description</form:label>
			<form:errors path="description"></form:errors>
			<form:input path="description"/>			
			</div>
			<div>
			<form:label path="price">Price</form:label>
			<form:errors path="price"></form:errors>
			<form:input path="price"/>
			</div>
			<form:button>Create</form:button>
		</form:form>
	</div>
</body>
</html>