<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h2>City</h2>
	<form action="createCity.jsp" method="post">
		<pre>
			Enter City Name: <input type="text" name="name"/>
			
			Enter Population: <input type="text" name="population"/>
			
			Enter Rain Fall: <input type="text" name="rainFall"/>
			
			<input type="submit" value="ADD" name="btn"/>
			
		</pre>
	</form>
</body>
</html>