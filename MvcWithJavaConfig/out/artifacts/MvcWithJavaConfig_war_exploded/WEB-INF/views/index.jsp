<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: ADMIN
  Date: 11/14/2019
  Time: 5:17 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>MVC Java Config</title>
</head>
<body>


    <h1 align="center">Welcome to Ramesh Hospital</h1>
    <p style="color: #ff0000" id="msg" align="center">${errorMessage}</p>
    <table align="center">
    <form:form action="login" method="post" align="center">
        <tr>
            <td><form:label path="userName">Username:</form:label></td>
            <td><form:input path="userName" id="userName" placeholder="Enter User Name" size="13"/></td>
        </tr>
        <tr>
        <td><form:label path="passWord">Password:</form:label></td>
        <td><form:input path="passWord" type="password" placeholder="Enter Password" size="13"/></td>
        </tr>
        <tr>
        <td><input type="submit" value="Login"></td>
        </tr>
       <tr>
        <td><a href="register">Register User</a></td>
       </tr>
    </form:form>
    </table>
</body>
<script type="text/javascript" src="resources/scripts/myscript.js"></script>
</html>
