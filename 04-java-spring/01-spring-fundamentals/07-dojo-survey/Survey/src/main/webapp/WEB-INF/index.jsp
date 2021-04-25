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
	<form method="POST" action="/submit">
	
		<label>Name: <input type ="text" Name= "name"> </label>

		<select Name="Location">
			<option value ="Seattle">Seattle</option>
			<option value ="Burbank">Burbank</option>
			<option value ="San Jose">San Jose</option>
		</select>
		
		<select name= "Language">
			<option value ="Java">Java</option>
			<option value ="Python">Python</option>
			<option value ="JavaScript">JavaScript</option>
		</select>
		
		<label for="comment">Comment(Optional)</label>
		<textarea name="comment" id="comment" cols="30" rows="10"></textarea>
		<button>Submit</button>
	</form>
</body>
</html>