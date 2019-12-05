<%--
  Created by IntelliJ IDEA.
  User: ADMIN
  Date: 11/2/2019
  Time: 11:35 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@taglib uri="http://java.sun.com/jstl/core_rt" prefix="c"%>
<html>
<head>
    <title>JSTL</title>
    <c:set var="age" value="10" scope="request"/>
    <c:set var="name" value="Venky" scope="request"/>

    <p>Age: ${requestScope.age}</p>
    <c:remove var="name"/>
    <p>Name: <c:out value="${name}"/></p>
    <%--step:increment..default value is i++--%>
    <c:forEach var="i" begin="1" end="10" step="2">
        <%--
                <span>${i}&nbsp;&nbsp;</span>
        --%>
        <c:out value="${i}"/>
    </c:forEach>

    <c:set var="sentence" value="This is simple statement"/>
    <c:forTokens items="${sentence}" delims=" " var="word">
        <span>${word}<br></span>
    </c:forTokens>

    <br><br>
    <c:if test="${customer.size() != 0}">
    <table border="1" cellspacing="5" cellpadding="5">
        <thead>
            <tr>
                <th>Id</th>
                <th>Name</th>
                <th>Email</th>
                <th>Contact</th>
            </tr>
        </thead>
        <tbody>
            <c:forEach items="${customer}" var="customer">
                <tr>
                    <td>${customer.customerId}</td>
                    <td>${customer.customerName}</td>
                    <td>${customer.customerEmail}</td>
                    <td>${customer.customerContact}</td>
                </tr>
            </c:forEach>
        </tbody>

    </table>
    </c:if>

    <c:set var="operation" value="5"/>

    <c:choose>
        <c:when test="${operation eq 1}">
            <p>${10+2}</p>
        </c:when>
        <c:when test="${operation eq 2}">
            <p>${10-2}</p>
        </c:when>
        <c:when test="${operation eq 3}">
            <p>${10*2}</p>
        </c:when>
        <c:when test="${operation eq 4}">
            <p>${10/2}</p>
        </c:when>
        <c:otherwise>
            <p>Invalid Choice</p>
        </c:otherwise>
    </c:choose>

    <br><br>

    <a href="<c:redirect url="http://www.google.co.in/"/>">
        Google
    </a>
</head>
<body>
<c:set var="age" value="25" scope="request"/>
<c:set var="name" value="Venkatesh" scope="request"/>

<p>Age: ${requestScope.age}</p>
<c:remove var="name"/>
<p>Name: <c:out value="${name}"/></p>


</body>
</html>
