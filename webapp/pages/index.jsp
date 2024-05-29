<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Car Rental</title>
    <link rel="stylesheet" href="https://fonts.googleapis.com/css2?family=Poppins:wght@400;700&display=swap">
<link rel="stylesheet" href="https://fonts.googleapis.com/css2?family=Segoe+UI:wght@400;700&display=swap">
    
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
    <link rel="stylesheet" href="style.css">
    <style>
        /* Additional styles for fonts */
        body {
            font-family: 'Segoe UI', Tahoma, Geneva, Verdana, sans-serif;
            color: #333; /* Dark grey text color */
        }

        h3, .card-title {
            font-family: 'Poppins', sans-serif;
            color: #000; /* Black text color for headings */
        }

        p, .card-text {
            font-size: 18px; /* Adjust font size for paragraphs */
        }

        /* Add your custom font imports here */
        @import url('https://fonts.googleapis.com/css2?family=Poppins:wght@400;700&display=swap');
        @import url('https://fonts.googleapis.com/css2?family=Segoe+UI:wght@400;700&display=swap');
    </style>
</head>
<body>
<%
String context = request.getContextPath(); 
%>
<nav class="navbar">
    <a class="navbar-brand" href="#">VEHICLE RENT MANAGEMENT</a>
    <ul class="navbar-nav">
        <li class="nav-item">
            <a class="nav-link" href="<%=context%>/pages/Login.jsp">USER LOGIN</a>
        </li>
        <li class="nav-item">
            <a class="nav-link" href="<%=context%>/pages/Register.jsp">SIGN UP</a>
        </li>
        <li class="nav-item">
            <a class="nav-link" href="<%=context%>/pages/admlogin.jsp">ADMIN LOGIN</a>
        </li>
    </ul>
</nav>

<div class="container mt-5">
    <div class="row justify-content-center">
        <div class="col-md-6">
            <h3>Welcome to our Car Rental Service</h3>
            <p>Discover the convenience of renting vehicles for your travel needs. Experience hassle-free bookings, competitive prices, and reliable customer service.</p>
        </div>
        <div class="col-md-6">
            <!-- Car Rental Image Card -->
            <div class="card">
                <img src="img/Car-Rental-Booking-System-1024x683.jpg" class="card-img-top" alt="Car Rental Image">
                <div class="card-body">
                    <h5 class="card-title">Explore Our Fleet of Vehicles</h5>
                    <p class="card-text">Find the perfect ride for your journey. Choose from a variety of vehicles to suit your needs and preferences.</p>
                    <a href="#" class="btn btn-primary">Sign Up / Login</a>
                </div>
            </div>
        </div>
    </div>
</div>

</body>
</html>
