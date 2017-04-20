<%@page import="java.util.Calendar"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>

	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
		<title>Index</title>
		<%!
			public String pr(int min, int max){
				String output = "";
				for(int i = min; i<= max; i++){
					if(i%2 == 0)
						output += i + "<br/>";
				}
				return output;
		}
		%>
		</head>
	
	<body>
		<h1>Hello from JSP!!!</h1>
		<a href="showDay">Show day</a> | <a href="calculator.jsp">Calculate</a> | <a href="settings">Setting</a>
		<p> Today is:
		<%
			String dateTime = Calendar.getInstance().getTime().toString();
		%>
		<%= dateTime %>
		</p>
		<p>The list of even number between 140, 245 <br/>
		<%
			out.println(pr(140, 245));
		%>
	</body>

	
</html>