<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%
	String s1 = request.getParameter("n1");
	String s2 = request.getParameter("n2");
	int n1 = Integer.parseInt(s1);
	int n2 = Integer.parseInt(s2);
	int sum =n1 + n2;
	String msg = request.getParameter("successMessage");
	%>
	<h2><%=msg %></h2>
	<h2>Sum : <%=sum %></h2>
</body>
</html>