<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Counter</title>
</head>
<body>
<h1>You have visited my page <c:out value="${count}"/> times</h1>
<h2> <a href="/">Test Counter</a></h2>
<a href= "/reset"><button>Reset</button></a>
<a href= "/twoCount"><button>Add Two Visits </button></a>
</body>
</html>