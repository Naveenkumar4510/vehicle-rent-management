<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Register Vehicle</title>
    <link rel="stylesheet" type="text/css" href="vehicle.css">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
</head>
<body style="background-color: #add8e6;"> <!-- Set the background color to a light blueish-grey -->

<%
    String context = request.getContextPath(); 
%>
<a href="<%=context%>/index.jsp" class="btn btn-info logout-btn">LOGOUT</a>

<form action="insertvehicle.do" class="center-form">
    <div class="container">
        <table class="table">
            <tr>
                <h2 align="center">ADD VEHICLE DETAILS</h2>
            </tr>
            <tr>
                <td style="background-color: #d4d4d4;">VEHICLE NO:</td>
                <td><input type="text" name="vno" class="form-control"></td>
            </tr>
            <tr>
                <td style="background-color: #d4d4d4;">VEHICLE NAME:</td>
                <td><input type="text" name="vname" class="form-control"></td>
            </tr>
            <tr>
                <td style="background-color: #d4d4d4;">VEHICLE TYPE:</td>
                <td><input type="text" name="vtype" class="form-control"></td>
            </tr>
            <tr>
                <td style="background-color: #d4d4d4;">VEHICLE PRICE:</td>
                <td><input type="text" name="vprice" class="form-control"></td>
            </tr>
            <tr>
                <td colspan="2" align="center"><input type="submit" value="ADD VEHICLE" class="btn btn-primary"></td>
            </tr>
        </table>
    </div>
</form>


</body>
</html>
