<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Category</title>
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.0/dist/css/bootstrap.min.css" integrity="sha384-B0vP5xmATw1+K9KRQjQERJvTumQW0nPEzvF6L/Z6nronJ3oUOFUFpCjEUQouq2+l" crossorigin="anonymous">
</head>
<body>
<div class="container">
		<div>
			<h1>${category.name}</h1>
			<hr>
		</div>
		<div>
			<div>
				<h2>Categories</h2>
				<ul>
					<c:forEach items="${category.products}" var="pro">
						<li>${pro.name}</li>
					</c:forEach>
				</ul>
			</div>
			
			<div>
				<form action="/categories/${category.id}" method="POST">
					<label for="products">Add Product</label>
						<select name="products">
							<c:forEach items="${product}" var="pro">
								<option value="${pro.id}">${pro.name}</option>
						</c:forEach>
						</select>
					<button>Add Product</button>
				</form>
			</div>
		</div>
	</div>
</body>
</html>