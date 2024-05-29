<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>View Booked Vehicle</title>
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
    <style>
        body {
            background-color: #87CEEB; /* Light Sky Blue as a background color */
            font-family: 'Roboto', sans-serif; /* Change font family to Roboto or any other suitable font */
            padding: 20px;
        }
        .container {
            max-width: 500px;
            margin: 0 auto;
            background-color: #f8f9fa; /* Light Gray background color */
            padding: 20px;
            box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
        }
        h2 {
            text-align: center;
            color: #007BFF; /* Dodger Blue for the heading */
            margin-bottom: 20px;
        }
        .form-group label {
            font-weight: bold;
            color: #495057; /* Dark Gray for labels */
        }
        .table {
            background-color: #ffffff; /* White background for the table */
        }
        .table th {
            color: #007BFF; /* Dodger Blue for table header text */
        }
        .table td {
            color: #495057; /* Dark Gray for table data text */
        }
        .back-link {
            display: block;
            text-align: center;
            color: #007BFF; /* Dodger Blue for the back link */
            margin-top: 20px;
        }
        .logout-btn {
            background-color: #ff4500; /* Orange-Red background color */
            color: #ffffff;
            font-weight: bold;
            border-radius: 4px;
            padding: 10px 20px;
            border: none;
            cursor: pointer;
            transition: background-color 0.3s, color 0.3s, box-shadow 0.3s;
        }

        .logout-btn:hover {
            background-color: #cc3700; /* Darker orange-red on hover */
            box-shadow: 0 0 10px rgba(0, 0, 0, 0.3);
            color: #ffffff;
        }
    </style>
</head>
<body>
<%
    String context = request.getContextPath(); 
%>
<a href="<%=context%>/index.jsp" class="btn btn-danger logout-btn">LOGOUT</a>
<div class="container">
    <h2>VIEW BOOKED VEHICLE</h2>
    <form action="viewbookedvehicle.do" method="POST">
        <div class="form-group">
            <label for="vno">VEHICLE NUMBER:</label>
            <input type="text" class="form-control" id="vno" name="vno">
        </div>
        <button type="submit" class="btn btn-primary">VIEW</button>
    </form>
    <c:if test="${not empty bookedvehicle}">
        <h3>BOOKED VEHICLE DETAILS</h3>
        <table class="table table-striped">
            <tbody>
                <tr>
                    <th>VEHICLE NUMBER:</th>
                    <td>${bookedvehicle.vno}</td>
                </tr>
                <tr>
                    <th>VEHICLE NAME:</th>
                    <td>${bookedvehicle.vname}</td>
                </tr>
                <tr>
                    <th>VEHICLE TYPE:</th>
                    <td>${bookedvehicle.vtype}</td>
                </tr>
                <tr>
                    <th>PRICE:</th>
                    <td>${bookedvehicle.price}</td>
                </tr>
            </tbody>
        </table>
    </c:if>
    <a href="home.jsp" class="back-link">GO BACK TO HOME PAGE</a>
</div>
</body>
</html>
