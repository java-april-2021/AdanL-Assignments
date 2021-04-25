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
	<h1>YOU CHOSE WISLEY, JAVA ROCKS!!</h1>
	<h1>Submitted Info</h1>
	<p>Name: <c:out value="${ result.getName() }"/></p>
	<p>Location: <c:out value="${result.getLocation() }"></c:out> </p>
	<p>Language: <c:out value="${result.getLanguage() }"></c:out></p>
	<p>Comments: <c:out value="${result.getComment() }"></c:out></p>

</body>
</html>