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
	if(n1 < 0 || n2 <0){
		
	%>
	<h2>Invalid input try again</h2>
	<jsp:include page="adder.html"/>
	<%
	}
	else {
	%>
	<jsp:forward page="doAdd.jsp">
		<jsp:param value="Addition is successfull" name="successMessage"/>
	</jsp:forward>
	<%
	}
	%>
</body>
</html>