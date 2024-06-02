<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>View Feedbacks</title>
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
    <link rel="stylesheet" href="viewfeedback.css">
    <style>
        /* Style for the logout button with orange color */
        .logout-btn {
            background-color: #87CEEB; /* Orange-Red background color */
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

        /* Additional styles specific to this page if needed */
    </style>
</head>
<body>
<%
    String context = request.getContextPath(); 
%>
<a href="<%=context%>/index.jsp" class="btn btn-danger logout-btn">LOGOUT</a>
<div class="container">
    <h2>VIEW FEEDBACK</h2>
    <form action="viewfeedback.do" method="POST">
        <div class="form-group">
            <label for="userid">USERID:</label>
            <input type="text" class="form-control" id="userid" name="userid">
        </div>
        <button type="submit" class="btn btn-primary">VIEW</button>
    </form>
    <c:if test="${not empty feedback}">
        <h3>FEEDBACK DETAILS</h3>
        <table class="table table-bordered">
            <tr>
                <th>ID:</th>
                <td>${feedback.id}</td>
            </tr>
            <tr>
                <th>USER ID:</th>
                <td>${feedback.userid}</td>
            </tr>
            <tr>
                <th>VEHICLE NUMBER:</th>
                <td>${feedback.vno}</td>
            </tr>
            <tr>
                <th>FEEDBACK:</th>
                <td>${feedback.feedback}</td>
            </tr>
            <tr>
                <th>RATING:</th>
                <td>${feedback.rating}</td>
            </tr>
        </table>
    </c:if>
    <a href="adminhome.jsp" class="back-link">GO BACK TO HOME PAGE</a>
</div>
</body>
</html>
