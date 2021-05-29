<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
   <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" href="/css/Style.css">

<title>Ninja Gold</title>
</head>
<body>
	<div>
		<h1>Your Gold: ${currentGold}</h1>		
			<div class="place">			
				<form action="/findgold" method="post">	
					<h2>Farm</h2>
					<p>Earn 10-20 Gold</p>
					<input type="hidden" value="farm" name="place">
					<button>Find Gold</button>
				</form>
			</div>
				
			<div class="place">
				<form action="/findgold" method="post">
					<h2>Cave</h2>
					<p>Earn 5-10 Gold</p>
					<input type="hidden" value="cave" name="place">
					<button>Find Gold</button>
				</form>
			</div>
				
			<div class="place">
				<form action="/findgold" method="post">
					<h2>House</h2>
					<p>Earn 2-5 Gold</p>
					<input type="hidden" value="house" name="place">
					<button>Find Gold</button>
				</form>
			</div>
				
			<div class="place">
				<form action="/findgold" method="post">
					<h2>Casino</h2>
					<p>Earn or Lose 0-50 Gold</p>
					<input type="hidden" value="casino" name="place">
					<button>Find Gold</button>
				</form>
			</div>
			<h2>Activiteis</h2>
			<div class ="activies">
				<p>
					<c:forEach items="${activity}" var="act">
						<p class= '${act.contains("ouch")? "red":"green"}' >${act}</p>
					</c:forEach>
				</p>
			</div>
			<a href="/reset">Reset</a>
	</div>
		

</body>
</html>