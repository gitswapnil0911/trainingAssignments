<%--
  Created by IntelliJ IDEA.
  User: ADMIN
  Date: 11/14/2019
  Time: 10:39 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h2 align="center">Add Medicine</h2>
<p style="color: #ff0000" id="msg3" align="center">${errorMessage}</p>
<form:form action="addMedicine" method="post">

    <label>Medicine Code</label>
    <form:input path="code"/>
    <label>Medicine Name</label>
    <form:input path="medicineName"/>
    <label>Medicine Type</label>
    <form:select path="type" items="${medicineTypes}"/>
    <label>Rate Per Unit</label>
    <form:input path="ratePerUnit"/>

    <input type="submit" value="ADD">
</form:form>
<a href="home">Home</a>
</body>
<script type="text/javascript" src="resources/scripts/addmedicine.js"></script>
</html>
