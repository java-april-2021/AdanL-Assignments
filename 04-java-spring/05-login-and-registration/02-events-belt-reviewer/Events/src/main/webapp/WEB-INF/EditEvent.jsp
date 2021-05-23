<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %> 
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Edit Your Event</title>
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.0/dist/css/bootstrap.min.css" integrity="sha384-B0vP5xmATw1+K9KRQjQERJvTumQW0nPEzvF6L/Z6nronJ3oUOFUFpCjEUQouq2+l" crossorigin="anonymous">

</head>
<body>
	<div class="container">
		<h1>${event.name}</h1>
		<a href="/events">All Events</a>
		<h4>Edit Event</h4>
		<form:form action="/event/edit/${event.id}" method="post" modelAttribute="event">
			<input type="hidden" name="_method" value="put">
			<form:hidden value="${user.id}" path="eventCreator"/>
			
			<form:label path="name">Event Name</form:label>
			<form:errors path="name"></form:errors>
			<form:input path="name"/>
			
			<form:label path="date">Event Name</form:label>
			<form:errors path="date"></form:errors>
			<form:input type="date" path="date"/>
			
			<form:label path="location">Location</form:label>
			<form:errors path="location"></form:errors>
			<form:input path="location"/>
			
			<form:button>Update Event</form:button>
		</form:form>
		
		<a href="/delete/${event.id}">Delete</a>
	</div>
</body>
</html>