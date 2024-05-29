<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

<head>
    <meta charset="UTF-8">
    <title>Rental System Admin Dashboard</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css"
        rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC"
        crossorigin="anonymous">
    <link rel="stylesheet" type="text/css" href="adminhome.css">
</head>

<body>

    <%
    String context = request.getContextPath(); 
    %>

    <div class="navbar" style="background-color: #007bff;">
        <ul>
            <li><a href="<%=context%>/pages/vehicle.jsp">ADD VEHICLE</a></li>
            <li><a href="<%=context%>/pages/Listvehicle.jsp">VIEW AVAILABLE VEHICLE</a></li>
            <li><a href="<%=context%>/pages/discount.jsp">ADD DISCOUNT</a></li>
            <li><a href="<%=context%>/pages/viewbooking.jsp">VIEW BOOKING</a></li>
            <li><a href="<%=context%>/pages/viewfeedback.jsp">VIEW FEEDBACK</a></li>
        </ul>
    </div>

    <div class="container">
        <div class="welcome-text">
            <p>Welcome to our Vehicle Rental Admin Dashboard</p>
        </div>

        <!-- Larger carousel for displaying car images -->
        <div id="carImageCarousel" class="carousel slide" data-bs-ride="carousel">
            <div class="carousel-inner">
                <div class="carousel-item active">
                    <img src="img/WallpaperDog-10764514.jpg" class="d-block w-100" alt="Car 1">
                    <div class="carousel-caption d-none d-md-block">
                        <h5>Car 1</h5>
                        <!-- Add other details or buttons as needed -->
                    </div>
                </div>
                <div class="carousel-item">
                    <img src="img/bmw.jpg" class="d-block w-100" alt="Car 2">
                    <div class="carousel-caption d-none d-md-block">
                        <h5>Car 2</h5>
                        <!-- Add other details or buttons as needed -->
                    </div>
                </div>
                <div class="carousel-item">
                    <img src="img/redbull.jpg" class="d-block w-100" alt="Car 3">
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

        <div class="card text-center" style="background-color: #ffffff; color: #000000; margin-top: 20px;">
            <div class="card-body">
                <h1 class="card-title">Explore our range of vehicles and manage your rental operations seamlessly.</h1>
                <a href="<%=context%>/index.jsp" class="btn btn-danger">LOGOUT</a>
            </div>
        </div>
    </div>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM" crossorigin="anonymous"></script>

</body>

</html>
