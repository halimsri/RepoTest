<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Show day</title>
</head>
<body>
	<%-- <p> Today is the <em>
	<%
		int day = (Integer) request.getAttribute("dayOfTheWeek");
		if(day == 1){
			out.print(day + "st");
		}else if(day == 2){
			out.print(day + "nd");
		}else if(day == 3){
			out.print(day + "rd");
		}else{
			out.print(day + "th");
		}
	%>
	</em>day of the week.</p>
 --%>
 
	 <h1> Today is the ${dayOfTheWeek} <em>
		<c:choose>
			<c:when test="${dayOfTheWeek == 1}">st</c:when>
			<c:when test="${dayOfTheWeek == 2}">nd</c:when>
			<c:when test="${dayOfTheWeek == 3}">rd</c:when>
			<c:otherwise>th</c:otherwise>
		</c:choose>
	</em>day of the week.</h1>

	<br/>
	
	<c:forEach begin="1" end="100" step="2" var="i">
		<c:out value="${i}, "/>
	</c:forEach>
	
	<br/>
	
	<ul style="list-style-type: katakana;">
		<c:forTokens items="eric, linc, diego, arthur, dion" delims=", " var="traineeName">
			<li>${traineeName}</li>
		</c:forTokens>
	</ul>
	
	<br/>
	
	<ul style="list-style-type: lower-greek;">
	<c:forEach items="${sessionScope.countries}" var="country">
		<li>${country} </li>
	</c:forEach>
	</ul>
</body>
</html>