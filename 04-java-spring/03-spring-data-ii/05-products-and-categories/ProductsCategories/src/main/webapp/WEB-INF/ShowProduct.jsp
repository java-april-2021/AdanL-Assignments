<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Product</title>
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.0/dist/css/bootstrap.min.css" integrity="sha384-B0vP5xmATw1+K9KRQjQERJvTumQW0nPEzvF6L/Z6nronJ3oUOFUFpCjEUQouq2+l" crossorigin="anonymous">
</head>
<body>
	<div class="container">
		<div>
			<h1>${product.name}</h1>
			<h4>${product.description}</h4>
			<h4>${product.price}</h4>
			<hr>
		</div>
		<div>
			<div>
				<h2>Categories</h2>
				<ul>
					<c:forEach items="${product.categories }" var="cat">
						<li>${cat.name}</li>
					</c:forEach>
				</ul>
			</div>
			
			<div>
				<form action="/products/${product.id}" method="POST">
					<label for="categories">Add Category</label>
						<select name="categories">
							<c:forEach items="${category}" var="cats">
								<option value="${cats.id}">${cats.name}</option>
						</c:forEach>
						</select>
					<button>Add Category</button>
				</form>
			</div>
		</div>
	</div>
</body>
</html>