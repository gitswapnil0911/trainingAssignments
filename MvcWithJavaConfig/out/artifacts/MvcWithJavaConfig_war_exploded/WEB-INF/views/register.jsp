<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: ADMIN
  Date: 11/2/2019
  Time: 2:43 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Registration Page</title>
</head>
<body>

    <h1>Registration Form</h1>
    <hr/>
    <table align="center">
    <form:form action="register" method="post" commandName="registerUser">
        <tr>
            <td><form:label path="userName">Username:</form:label></td>
            <td><form:input path="userName" size="13" placeholder="Enter User Name" id="userName"/></td>
        </tr>
        <tr>
            <td><form:label path="passWord">Password:</form:label></td>
            <td><form:input type="password" path="passWord" size="13" placeholder="Enter Password"/></td>
        </tr>
        <tr>
        <tr>
        <td><form:label path="userEmailId">Email Id:</form:label></td>
        <td><form:input type="email" path="userEmailId" size="13" placeholder="Enter Email ID"/></td>
        </tr>
        <tr>
            <td><form:label path="userContact">Contact:</form:label></td>
            <td><form:input type="number" path="userContact" size="15"/></td>
        </tr>
        <tr>
        <td><input type="submit" value="Register"/></td>
        </tr>
    </form:form>
    </table>
</body>
</html>
