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
<table>
    <thead>
        <tr>
            <th>Name</th>
            <th>License Number</th>
            <th>State</th>
        </tr>
    </thead>
    <tbody>
        <c:forEach items="${persons}" var="p">
        <tr>
      		
            <td><c:out value="${p.firstName} ${p.lastName}"/></td>
            <td><c:out value="${p.license.getNumberAsString()}"/></td>
            <td><c:out value="${p.license.state}"/></td>     
        </tr>
        </c:forEach>
    </tbody>
</table>
<a href="/add">Add Person</a>
<a href="/license">Add License</a>
</body>
</html>