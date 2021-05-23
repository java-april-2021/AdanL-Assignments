<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Welcome Login or Register</title>
</head>
<body>
	<div>
		<h1>Welcome</h1>
		${loginError}
		<div class="container">
			<h3>Register</h3>
			<form:form action = "/register" method="POST" modelAttribute="newUser">
				<div>
					<form:label path= "firstName">First Name: </form:label>
					<form:errors path="firstName"/>
					<form:input path="firstName"/>
				</div>
				<div>
					<form:label path= "lastName">Last Name: </form:label>
					<form:errors path="lastName"/>
					<form:input path="lastName"/>
				</div>
				<div>
					<form:label path= "email">Email: </form:label>
					<form:errors path="email"/>
					<form:input path="email"/>
				</div>
				<div>
					<form:label path= "location">Location: </form:label>
					<form:errors path="location"/>
					<form:input path="location"/>
				</div>
				<div>
					<form:label path= "password">Password: </form:label>
					<form:errors path="password"/>
					<form:input path="password"/>
				</div>
				<div>
					<form:label path= "confirmPassword">Confirm Password: </form:label>
					<form:errors path="confirmPassword"/>
					<form:input path="confirmPassword"/>
				</div>
				<form:button>Submit</form:button>
			</form:form>
		</div>	
		<div class="container">
			<form action="/login" method="post">
				<div>
					<label>Email: </label>
					<input type="email" name="loginEmail"/>
				</div>
				<div>
					<label>Password</label>
					<input type ="password" name = "loginPass">
				</div>
				<button>Login</button>
			</form>
		</div>
	</div>

</body>
</html>