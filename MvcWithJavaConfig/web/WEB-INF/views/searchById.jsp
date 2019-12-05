<%--
  Created by IntelliJ IDEA.
  User: ADMIN
  Date: 11/14/2019
  Time: 2:52 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h2>Search product by Id</h2>
<p style="color: #ff0000" id="msg1">${errorMessage}</p>
<form action="srch" method="post">
    <label for="code">Code Number</label>
    <input type="text" name="code" id="code" placeholder="Enter code to be search"/>
    <input type="submit"/>
</form>
<a href="home">Home</a>
</body>
<script type="text/javascript" src="resources/scripts/findById.js"></script>
</html>
