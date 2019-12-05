<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h2>Creating City</h2>
	<jsp:useBean id="c1" class="beans.City" scope="application"/>
	<jsp:setProperty property="*" name="c1"/>
	
</body>
</html>