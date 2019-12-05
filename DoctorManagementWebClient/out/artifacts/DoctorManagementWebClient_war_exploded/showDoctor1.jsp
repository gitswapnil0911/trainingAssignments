
<%--
  Created by IntelliJ IDEA.
  User: ADMIN
  Date: 11/22/2019
  Time: 12:08 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <title>Show Details</title>
</head>
<body>
<div id="msg"></div>
<button id="getButton">Get Doctor Details</button>

<script
        src="https://code.jquery.com/jquery-1.12.4.min.js"
        integrity="sha256-ZosEbRLbNQzLpnKIkEdrPv7lOy9C27hHQ+Xp8a4MxAQ="
        crossorigin="anonymous"></script>
<h2 align="center">Add Medicine</h2>
<p style="color: #ff0000" id="msg3" align="center">${errorMessage}</p>
<form action="addMedicine" method="post" id="formAdd">

    <label>Medicine Code</label>
    <input path="code"/>
    <label>Medicine Name</label>
    <input path="medicineName"/>
    <label>Rate Per Unit</label>
    <input path="ratePerUnit"/>

    <input type="submit" value="ADD" id="addMedicine">
</form>

</body>
<script>

    var formData = ${'#formAdd'}.serialize();
    var getButton = document.getElementById("addMedicine");
    var msgDiv = document.getElementById("msg");
    getButton.addEventListener('click', function () {
        $.post("http://localhost:8071/DoctorManagement_war_exploded/webapi/medicine", formData,function(response) {


            msgDiv.innerText = response.medicineName;
        });
    });
</script>

<!--<script type="text/javascript" src="scripts/jquery-3.4.1.js"></>--%>

</html>