<%@page import="java.io.PrintWriter"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isErrorPage="true"%>
<!DOCTYPE html>
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
		<title>Error</title>
		<style type="text/css">
			.error{
				color: red;
			}
		</style>
	</head>
	<body>
		<p>Exception occured. Short message:</p>
		<pre class="error"><%= exception.getMessage() %></pre>
		
		<br/>
		
		<p>Longer message: </p>
		<pre class="error"><% exception.printStackTrace(new PrintWriter(out)); %></pre>
	</body>
</html>