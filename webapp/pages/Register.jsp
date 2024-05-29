<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
    <title>Register Yourself</title>
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
    <link rel="stylesheet" href="Register.css">
    <style>
        /* Include styles from Register.css here if needed */
        body {
            background-color: #f5f5f5; /* Light gray background color */
            font-family: 'Segoe UI', Tahoma, Geneva, Verdana, sans-serif;
            color: #333; /* Dark grey text color */
        }

        /* Other styles specific to this page */
    </style>
</head>
<body>
<%
        String context = request.getContextPath(); 
        %>
    <div class="container">
        <h2>SIGN UP</h2>
        <form action="register.do" class="needs-validation" novalidate method="POST">
            <c:if test="${requestScope.Err != null}">
                <div class="alert alert-danger">${requestScope.Err}</div>
            </c:if>
            <div class="form-group">
                <label for="userid">USER ID</label>
                <input type="text" name="userid" id="userid" class="form-control" required>
                <div class="invalid-feedback">Please provide a User ID.</div>
            </div>
            <div class="form-group">
                <label for="username">NAME</label>
                <input type="text" name="username" id="username" class="form-control" required>
                <div class="invalid-feedback">Please provide your name.</div>
            </div>
            <div class="form-group">
                <label for="city">CITY</label>
                <input type="text" name="city" id="city" class="form-control" required>
                <div class="invalid-feedback">Please provide your city.</div>
            </div>
             <div class="form-group">
                <label for="email">EMAIL</label>
                <input type="text" name="email" id="email" class="form-control" required>
                <div class="invalid-feedback">Please provide your Email.</div>
            </div>
             <div class="form-group">
                <label for="contactno">CONTACT</label>
                <input type="text" name="contactno" id="contactno" class="form-control" required>
                <div class="invalid-feedback">Please provide your Contact.</div>
            </div>
           
            <div class="text-center">
                <input type="submit" value="REGISTER" class="btn1 mt-3 mb-4">
            </div>
        </form>
    </div>

    <a href="<%=context%>/index.jsp" class="btn btn-info">LOGOUT</a>

    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM" crossorigin="anonymous"></script>
</body>
</html>
