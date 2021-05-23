<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>  
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Event Details</title>
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.0/dist/css/bootstrap.min.css" integrity="sha384-B0vP5xmATw1+K9KRQjQERJvTumQW0nPEzvF6L/Z6nronJ3oUOFUFpCjEUQouq2+l" crossorigin="anonymous">

</head>
<body>
	<div class="contiainer">
		<div class="contiainer">
			<h1>${event.name}</h1>
			
			<h3>Host: ${event.eventCreator.firstName} ${event.eventCreator.lastName}</h3>
			<h3>Date: ${event.date}</h3>
			<h3>Location: ${event.location}</h3>
			<h3>People who are attending this event: ${event.attendees.size()}</h3>
			<table class="table table-dark table-striped">
				<thead>
					<tr>
						<th>Name</th>
						<th>Location</th>		
					</tr>
				</thead>
				<tbody>
					<c:forEach items="${event.attendees}" var="guest">
					<tr>
						
						<td>${guest.firstName} ${guest.lastName}</td>
						<td>${guest.location}</td>
						
					</tr>
					</c:forEach>
				</tbody>
			</table>
		</div>
		<div>
			<ul>
				<c:forEach items="${event.eventComments}" var="comment">
					<li>${comment.commentCreator.firstName} Says: ${comment.content}</li>
				</c:forEach>
			</ul>
	
		
			<form action="/event/${id}" method="POST" >
				<label for="content">Add Comment</label>
						<span>${ error }</span>
						<textarea name="content" id="content" class="form-control"></textarea>
						<button>Share</button>
			</form>
		</div>
		<a href="/events">All Events</a>
	</div>
</body>
</html>