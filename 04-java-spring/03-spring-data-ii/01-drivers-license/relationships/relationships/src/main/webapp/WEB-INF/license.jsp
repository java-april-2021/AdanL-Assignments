<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
            <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
        <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>License</title>
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.0/dist/css/bootstrap.min.css" integrity="sha384-B0vP5xmATw1+K9KRQjQERJvTumQW0nPEzvF6L/Z6nronJ3oUOFUFpCjEUQouq2+l" crossorigin="anonymous">	

</head>
<body>
 	<div class="container">
		<div class ="table table-dark">
			<h1>Get License</h1>
			<form:form method="POST" action= "/add/license" modelAttribute="license">
				<p><form:label path = "person" id="person">Name: </form:label>
					<form:errors path = "person"/>
					<form:select path= "person">
							<c:forEach items="${person}" var="p">
                				<form:option value="${p.id}">${p.firstName} ${p.lastName}</form:option>
                			</c:forEach>
       				 </form:select>
				</p>
				<p><form:label path = "state" id="state">State: </form:label>
					<form:errors path = "state"/>
					<form:input path ="state"/>
				</p>
				<p><form:label path = "expiration_date" id= "expiration_date">Date: </form:label>
					<form:errors path = "expiration_date"/>
					<form:input type="date" path= "expiration_date"/>
				</p>
				<input type = "submit" value = "add"/>
			</form:form>
		</div>
		<a href="/">Show all</a>
	</div>
 
</body>
</html>