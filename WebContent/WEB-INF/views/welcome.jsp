<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
   <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
		<title>WELCOME</title>
	</head>
	<body>
		<h1>Welcome ${user.firstname} ${user.lastname}</h1>
		<a href="logout">Logout</a>
	</body>
	<br/>
	<c:choose>
			<c:when test="${userCount > 0}">There are ${userCount} user(s) online</c:when>
			<c:otherwise>There are no users online</c:otherwise>
		</c:choose>
</html>