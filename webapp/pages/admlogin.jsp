
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt"%>
<!DOCTYPE html>
<html>
<head>
    <title>Login</title>
    <!-- Required meta tags -->
    
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">

    <!-- Bootstrap CSS -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
    <link rel="stylesheet" href="adminlogin.css">
</head>
<body style="background-color:  #C0C0C0;">
<%
String context = request.getContextPath(); 
%>

<section class="form " >
    <form action="adminlogin.do" method="POST">
        <c:if test="${requestScope.Err!=null}">
            <p class="error">${requestScope.Err}</p>
        </c:if>
        <div class="container">
            <div class="row g-0">
                <div class="col">
                    <div class="form-group">
                        <h2 align="center">ADMIN LOGIN</h2>
                        <label for="adminid">ADMIN ID:</label>
                        <input type="text" name="adminid" id="adminid" class="form-control my-3 p-3" placeholder="Admin ID">
                    </div>
                    <div class="form-group">
                        <label for="password">PASSWORD:</label>
                        <input type="password" name="password" class="form-control my-3 p-3" id="password" placeholder="Password">
                    </div>
                    <div class="form-group">
                        <input type="submit" value="LOGIN" class="btn1 mt-3 mb-4">
                    </div>
                    
                </div>
            </div>
        </div>
    </form>
   <a href="<%=context%>/index.jsp" class="btn btn-info">LOGOUT</a>
</section>

<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM" crossorigin="anonymous"></script>
</body>
</html>
