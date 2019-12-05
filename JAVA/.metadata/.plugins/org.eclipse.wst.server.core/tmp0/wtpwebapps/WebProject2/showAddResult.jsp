<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h2>Addition Result Page</h2>
	<%
	String s1 = request.getParameter("n1");
	String s2 = request.getParameter("n2");
	
	String finalMessage = (String)application.getAttribute("resultMessage");
	int addResult = (Integer)session.getAttribute("addResult");
	%>
	<h2><%=finalMessage %></h2>
	<h2>The addition of <%=s1 %> and <%=s2 %> is <%=addResult %></h2>
</body>
</html>