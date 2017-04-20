<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" errorPage="error.jsp"%>
<%@ include file="header.jsp" %>
<!DOCTYPE html>
	<html>
		<!-- <head>
		<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
		<title>Calculator</title>
	</head> -->
	<body>
		<!-- this same as creating new instance of Calculator -->
		<jsp:useBean id="cal" class="com.fdmgroup.model.Calculator">
			<jsp:setProperty property="num1" name="cal" value="${param.number1}"/>
			<jsp:setProperty property="num2" name="cal" value="${param.number2}"/>
		</jsp:useBean>
	
		<%-- <%=
			cal.add()
		%> --%>
		<p>The sum of <jsp:getProperty property="num1" name="cal"/> and <jsp:getProperty property="num2" name="cal"/> is:
		${cal.add()}
		</p>
		
		<p>The div of <jsp:getProperty property="num1" name="cal"/> and <jsp:getProperty property="num2" name="cal"/> is:
		${cal.divide()}
		</p>
		
		
		<jsp:include page="section.jsp"/>
	</body>
</html>