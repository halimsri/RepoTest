<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
		<title>Color</title>
		<style>
			.myText{
				color: #252525;
			}
		</style>
	</head>
	
	<c:choose>
	<c:when test="${not empty cookie.bgColor.value}">
		<body bgcolor="${cookie.bgColor.value}">
	</c:when>
	<c:otherwise>
		<body bgcolor="#E34234">
	</c:otherwise>
	</c:choose>
		<h1 class="myText">The color picker based on Cookies</h1>
	</body>
</html>