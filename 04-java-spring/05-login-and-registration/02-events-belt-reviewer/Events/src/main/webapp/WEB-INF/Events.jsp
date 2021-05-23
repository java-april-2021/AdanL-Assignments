<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>  
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Events page</title>
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.0/dist/css/bootstrap.min.css" integrity="sha384-B0vP5xmATw1+K9KRQjQERJvTumQW0nPEzvF6L/Z6nronJ3oUOFUFpCjEUQouq2+l" crossorigin="anonymous">
</head>
<body>
	<div class= "container">
		<h1>Welcome ${user.firstName}</h1>
	</div>
	<div>
		<h3>Events in Your City</h3>
		<table class="table table-dark table-striped">
			<thead>
				<tr>
					<th>Name</th>
					<th>Date</th>
					<th>Location</th>
					<th>Host</th>
					<th>Action</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach items ="${events}" var="event">
				<tr>
					<td><a href="/event/${event.id}">${event.name}</a></td>
					<td>${event.date}</td>
					<td>${event.location}</td>
					<td>${event.eventCreator.firstName} ${event.eventCreator.lastName}</td>
					<td><c:choose>
							<c:when test="${event.attendees.contains(user) }">
								<a href="/notGoing/${event.id}"> You are Attending, want to cancel?</a></c:when>
							<c:otherwise>
								<a href="/attend/${event.id}"> You are not Attending, Want to go?</a> 
							</c:otherwise> 
						</c:choose> 				
						<p><c:if test="${event.eventCreator.id == user.id}"><a href="/event/edit/${event.id}">Edit Your Event</a></c:if></p>
					</td>
				</tr>
				</c:forEach>
				
			</tbody>			
		</table>
	</div>
			<h3>Events in Other Places</h3>
		<table class="table table-dark table-striped">
			<thead>
				<tr>
					<th>Name</th>
					<th>Date</th>
					<th>Location</th>
					<th>Host</th>
					<th>Action</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach items ="${otherEvents}" var="otherEvent">
				<tr>
					<td> <a href="/event/${otherEvent.id}">${otherEvent.name}</a> </td>
					<td>${otherEvent.date}</td>
					<td>${otherEvent.location}</td>
					<td>${otherEvent.eventCreator.firstName} ${otherEvent.eventCreator.lastName}</td>
					<td> 
						<c:choose>
							<c:when test="${otherEvent.attendees.contains(user) }">
								<a href="/notGoing/${otherEvent.id}">You are Attending, want to cancel?</a></c:when>
							<c:otherwise>
								<a href="/attend/${otherEvent.id}"> You are not Attending, Want to go?</a> 
							</c:otherwise> 
						</c:choose>
						
						<p><c:if test="${otherEvent.eventCreator.id == user.id}"><a href="/event/edit/${otherEvent.id}">Edit Your Event</a></c:if></p>
					
					</td>
					
					
					</c:forEach>
				
				
			</tbody>			
		</table>
	</div>
	<div class="container">
		<form:form action="/create" modelAttribute="newEvent" method="post">
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
			
			<form:button>Add Event</form:button>
		</form:form>
	</div>
	<a href="/logout">Logout</a>
</body>
</html>