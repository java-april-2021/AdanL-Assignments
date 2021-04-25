<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form method= "POST" action="/attempt">
		<span><c:out value="${ error }" /></span>
		<input type="text" name= "guess" placeholder="whats the code">
		<button>Attempt</button>
	</form>
</body>
</html>