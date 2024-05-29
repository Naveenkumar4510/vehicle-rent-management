<%@page import="com.ntt.training.domain.User"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Rental System Home</title>
    <link rel="stylesheet" type="text/css" href="adminstyle.css">

    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
<style>
        /* Additional styles specific to this page */
        .car-images-card {
            margin-top: 20px;
            padding: 20px;
            background-color: #ffffff; /* White background color for the card */
            box-shadow: 0 4px 8px rgba(0, 0, 0, 0.1);
        }
        
        /* Style for the updated logout button with orange color */
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

        /* Style for smaller car images */
        .card-img-small {
            max-height: 150px; /* Adjust the maximum height as needed */
            object-fit: cover;
        }

        /* Style for larger carousel images */
        .carousel-item img {
            max-height: 450px; /* Adjust the maximum height as needed */
            object-fit: cover;
        }
    </style>
</head>
<body style="background-color: #f8f9fa; font-family: 'Segoe UI', Tahoma, Geneva, Verdana, sans-serif;">

<%
    String context = request.getContextPath(); 
%>

<div class="navbar" style="background-color: #007bff; padding: 10px; border-bottom: 2px solid #0056b3;">
    <ul style="list-style-type: none; margin: 0; padding: 0;">
        <li><a href="<%=context%>/pages/viewbookedvehicle.jsp" style="text-decoration: none; color: #fff;">VIEW BOOKED VEHICLE</a></li>
        <li><a href="<%=context%>/pages/viewdiscount.jsp" style="text-decoration: none; color: #fff;">VIEW DISCOUNT</a></li>
        <li><a href="<%=context%>/pages/feedback.jsp" style="text-decoration: none; color: #fff;">PROVIDE FEEDBACK</a></li>
        <li><a href="<%=context%>/pages/booking.jsp" style="text-decoration: none; color: #fff;">ADD BOOKING</a></li>
        <li><a href="<%=context%>/pages/calculateprice.jsp" style="text-decoration: none; color: #fff;">CALCULATE PRICE</a></li>
        <li><a href="<%=context%>/pages/viewvehicle.jsp" style="text-decoration: none; color: #fff;">SEARCH VEHICLE</a></li>
    </ul>
</div>

<a href="<%=context%>/index.jsp" class="btn btn-danger logout-btn" style="position: absolute; bottom: 20px; right: 20px;">LOGOUT</a>

<div class="container" style="text-align: center; margin-top: 50px;">
    <h1 style="color: #007bff;">Welcome ${requestScope.details.userid }</h1>
    <p style="color: #495057;">Discover the Best Rental Experience</p>
    
    <!-- Larger carousel for displaying car images -->
    <div id="carImageCarousel" class="carousel slide" data-bs-ride="carousel">
        <div class="carousel-inner">
            <div class="carousel-item active">
                <img src="img/rent4.jpg" class="d-block w-100" alt="Car 1">
                <div class="carousel-caption d-none d-md-block">
                    <h5>Car 1</h5>
                    <!-- Add other details or buttons as needed -->
                </div>
            </div>
            <div class="carousel-item">
                <img src="img/5636721.jpg" class="d-block w-100" alt="Car 2">
                <div class="carousel-caption d-none d-md-block">
                    <h5>Car 2</h5>
                    <!-- Add other details or buttons as needed -->
                </div>
            </div>
            <div class="carousel-item">
                <img src="img/greencar.jpg" class="d-block w-100" alt="Car 3">
                <div class="carousel-caption d-none d-md-block">
                    <h5>Car 3</h5>
                    <!-- Add other details or buttons as needed -->
                </div>
            </div>
        </div>

        <!-- Navigation controls -->
        <a class="carousel-control-prev" href="#carImageCarousel" role="button" data-bs-slide="prev">
            <span class="carousel-control-prev-icon" aria-hidden="true"></span>
            <span class="visually-hidden">Previous</span>
        </a>
        <a class="carousel-control-next" href="#carImageCarousel" role="button" data-bs-slide="next">
            <span class="carousel-control-next-icon" aria-hidden="true"></span>
            <span class="visually-hidden">Next</span>
        </a>
    </div>
</div>

<!-- Bootstrap JavaScript CDN link -->
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM" crossorigin="anonymous"></script>
</body>
</html>
