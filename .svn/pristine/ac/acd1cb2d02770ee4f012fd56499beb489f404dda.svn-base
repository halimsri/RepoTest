<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
		<title>LOGIN</title>
		</head>
	<body>
		<h1>Welcome</h1>
		<h2>Please Login</h2>
		<h2>${errorMsg}</h2>
		<form method="post" action="processLogin">
			Username: <input type="text" name="username" required="required"><br/>
			Password: <input type="password" name="password" required="required"><br/>
			<input type="submit" value="Login">
		</form>
		<br/>
		<c:choose>
			<c:when test="${userCount > 0}">There are ${userCount} user(s) online</c:when>
			<c:otherwise>There are no users online</c:otherwise>
		</c:choose>
		
	</body>
</html>