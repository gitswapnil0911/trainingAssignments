<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h2>Showing a City</h2>
	<jsp:useBean id="c1" class="beans.City" scope="application"/>
	<h2>Name: <jsp:getProperty name="c1" property="name"/></h2>
	<h2>Population: <jsp:getProperty name="c1" property="population"/></h2>
	<h2>Rain Fall (mm) :<jsp:getProperty name="c1" property="rainFall"/></h2>
</body>	
</html>