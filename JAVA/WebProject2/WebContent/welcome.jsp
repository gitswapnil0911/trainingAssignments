<%@page import="java.time.LocalDate"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>Welcome to JSP, demonstrating JSP Tags</h1>
	<%@ include file="greetings.jsp" %>
	<%!
		int num = 15;
	public String sayWelcome(String name){
		return "Welcome " + name;
	}
	%>
	<h2>Printing Welcome 5 times....</h2>
	<% 
		for(int a=1; a<=5; a++){
	%>
	<h2>WELCOME</h2>
	<%
		}
	%>
	<h2>The square of <%=num %> is <%=(num * num) %></h2>
	<h2>Reply from method is <%=sayWelcome("Swapnil") %></h2>
	<%
		LocalDate sysDate= LocalDate.now();
	%>
	<h2>Todays Date is <%=sysDate %></h2>
</body>
</html>