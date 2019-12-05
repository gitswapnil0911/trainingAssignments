<%--
  Created by IntelliJ IDEA.
  User: ADMIN
  Date: 11/14/2019
  Time: 10:39 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <title>Title</title>
</head>
<body>
<h2 align="center">Add Medicine</h2>
<p style="color: #ff0000" id="msg3" align="center">${errorMessage}</p>
<form id="addForm" method="post">

    <label>Medicine Code</label>
    <input id="code"/>
    <label>Medicine Name</label>
    <input id="medicineName"/>
    <label>Rate Per Unit</label>
    <input id="ratePerUnit"/>

    <input type="submit" value="ADD" id="getButton">
</form>
<script>

    var getButton = document.getElementById("getButton");

    var codeNumber = document.getElementById("code");
    var medicineName = document.getElementById("medicineName");
    var ratePerUnit = document.getElementById("ratePerUnit");
    var msgDiv = document.getElementById("msg");
    getButton.addEventListener("click",function () {

        $.post("http://localhost:8071/DoctorManagement_war_exploded/webapi/medicine",
            {
                "codeNumber": 201,
                "medicineName": "crocin",
                "ratePerUnit": 25
            },
            function(resp){
                msgDiv.innerHTML = resp.medicineName;
            });


    });

</script>

</body>

</html>
