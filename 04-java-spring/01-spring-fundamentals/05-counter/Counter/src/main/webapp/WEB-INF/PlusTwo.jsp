<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Plus 2</title>
</head>
<body>
<h1>You have visited my page <c:out value="${count}"/> times</h1>
<h2> <a href="/">Test Counter</a></h2>
<a href ="/count">visit counter page</a></h2>
</body>
</html>