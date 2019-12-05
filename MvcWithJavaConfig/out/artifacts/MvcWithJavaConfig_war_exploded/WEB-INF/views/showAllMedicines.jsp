<%--
  Created by IntelliJ IDEA.
  User: ADMIN
  Date: 11/14/2019
  Time: 1:00 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Ramesh Hospital</title>
    <style>
        table {
            border: 2px solid #0000ff;
            margin-left: auto;
            margin-right: auto;
        }

        th, tr, td {
            border: 2px solid #0000ff;
            border-collapse: collapse;
        }
    </style>
</head>
<body>
<h2 align="center">All Medicines</h2>
<table>
    <tr>
        <th>Code</th>
        <th>Medicine Name</th>
        <th>Rate Per Unit</th>
    </tr>
    <c:if test="${callFrom.equals('singleEntity')}">
        <tr>
            <td><c:out value="${foundOneItem.code}"/></td>
            <td><c:out value="${foundOneItem.medicineName}"/></td>
            <td><c:out value="${foundOneItem.ratePerUnit}"/></td>
        </tr>
    </c:if>
    <c:if test="${callFrom.equals('multiEntity')}">
        <c:forEach items="${itemList}" var="allMedicines">
            <tr>
                <td><c:out value="${allMedicines.code}"/></td>
                <td><c:out value="${allMedicines.medicineName}"/></td>
                <td><c:out value="${allMedicines.ratePerUnit}"/></td>
            </tr>
        </c:forEach>
    </c:if>
</table>
<a href="home" align="center">Home</a>
</body>
</html>