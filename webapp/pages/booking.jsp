<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Add Booking</title>
    <link rel="stylesheet" type="text/css" href="booking.css">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
 <style>
        .logout-button {
            position: fixed;
            bottom: 10px;
            right: 10px;
        }
    </style>
    </head>
<body style="background-color: #add8e6;">

<%
    String context = request.getContextPath(); 
%>
<a href="<%=context%>/index.jsp" class="btn btn-info logout-button">LOGOUT</a>

<form action="insertbooking.do" method="POST">
    <table>
        <tr>
            <h2> BOOK VEHICLE</h2>
            <td style="background-color: #e9e9e9;">BOOKING ID:</td>
            <td><input type="text" name="bookingId"></td>
        </tr>
        <tr>
            <td style="background-color: #e9e9e9;">USER ID:</td>
            <td><input type="text" name="userId"></td>
        </tr>
        <tr>
            <td style="background-color: #e9e9e9;">VEHICLE ID:</td>
            <td><input type="text" name="vehicleId"></td>
        </tr>
        <tr>
            <td style="background-color: #e9e9e9;">BOOKING DATE:</td>
            <td><input type="date" name="bookingDate"></td>
        </tr>
        <tr>
            <td style="background-color: #e9e9e9;">RETURN DATE:</td>
            <td><input type="date" name="returnDate"></td>
        </tr>
        <tr>
            <td style="background-color: #e9e9e9;">TOTAL:</td>
            <td><input type="text" name="totalPrice"></td>
        </tr>
        <tr>
            <td colspan="2" align="center"><input type="submit" value="ADD BOOKING"></td>
        </tr>
    </table>
</form>

<a href="<%=context%>/pages/viewvehicle.jsp" class="btn btn-warning">SHOW VEHICLE DETAILS</a><br>


</body>
</html>
