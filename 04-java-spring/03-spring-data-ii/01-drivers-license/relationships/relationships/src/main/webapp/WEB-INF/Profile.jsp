<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
            <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
        <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Name: ${person.firstName} ${person.lastName}</h1>
<h2>License number: ${person.license.getNumberAsString()}</h2>
<h2>Expiration Date: ${person.license.getExpirationDateFormatted() }</h2>
</body>
</html>