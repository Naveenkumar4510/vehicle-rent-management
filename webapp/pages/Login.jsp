<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Login</title>
    <!-- Bootstrap CSS -->
    <link rel="stylesheet" href="login.css">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
    <link rel="stylesheet" href="https://fonts.googleapis.com/css2?family=Segoe+UI:wght@400;700&display=swap">
</head>
<body style="background-color:  "> <!-- Add background color light grey -->
<%
    String context = request.getContextPath();
%>


    
        <section class="form">
            <form action="login.do" method="POST">
                <c:if test="${requestScope.Err!=null}">
                    <p class="error">${requestScope.Err}</p>
                </c:if>
                <div class="container">
                    <div class="row g-0">
                        <div class="col">
                            <div class="form-group">
                                <h2 align="center">LOGIN PAGE</h2>
                                <label for="userid">USER ID:</label>
                                <input type="text" name="userid" id="userid" class="form-control my-3 p-3" placeholder="User ID">
                            </div>
                            <div class="form-group">
                                <label for="password">PASSWORD:</label>
                                <input type="password" name="password" class="form-control my-3 p-3" id="password" placeholder="Password">
                            </div>
                            <div class="form-group">
                                <input type="submit" value="LOGIN" class="btn1 mt-3 mb-4">
                            </div>
                            <p>DON'T HAVE AN ACCOUNT? <a href="Register.jsp" class="btn2">REGISTER HERE</a></p>
                            <a href="<%=context%>/index.jsp" class="btn btn-info">LOGOUT</a>
                        </div>
                    </div>
                </div>
            </form>
        </section>
   


<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM" crossorigin="anonymous"></script>
</body>
</html>
