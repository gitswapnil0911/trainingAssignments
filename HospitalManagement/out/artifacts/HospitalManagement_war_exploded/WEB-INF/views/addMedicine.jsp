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

<form:form action="addMedicine" method="post">

    <form:input path="code"/>
    <form:input path="medicineName"/>
    <label>Medicine Type</label>
    <form:select path="type" items="${medicineTypes}"/>
    <label>Rate Per Unit</label>

    <form:input path="ratePerUnit"/>

    <input type="submit" value="ADD">
</form:form>
</body>
</html>
