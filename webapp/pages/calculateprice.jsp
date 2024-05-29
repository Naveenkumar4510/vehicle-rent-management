<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>

<head>
    <meta charset="UTF-8">
    <title>Price Page</title>
    <style>
        body {
            background-color: #add8e6; /* Light grey background color */
        }

        h1 {
            color: #333; /* Dark grey text color */
            text-align: center;
        }

        .result {
            color: #333; /* Dark grey text color */
            text-align: center;
        }

        form {
            display: flex;
            justify-content: center;
            margin-top: 20px;
        }

        table {
            border-collapse: collapse;
            margin-top: 20px;
        }

        table td {
            padding: 10px;
            text-align: right;
        }

        input[type="text"] {
            padding: 8px;
        }

        input[type="submit"] {
            padding: 8px 15px;
            background-color: #ff4500; /* Orange-Red color */
            color: white;
            border: none;
            cursor: pointer;
        }

        .btn-back,
        .btn-logout {
            margin-top: 20px;
            display: block;
            text-align: center;
            padding: 10px 20px;
            border: none;
            border-radius: 4px;
            cursor: pointer;
            text-decoration: none;
            transition: background-color 0.3s, color 0.3s, box-shadow 0.3s;
            position: absolute;
        }

        .btn-back {
            background-color: #ff4500; /* Orange-Red color */
            color: white;
            left: 20px; /* Position at the bottom-left corner */
        }

        .btn-logout {
            background-color: #ff4500; /* Orange-Red color */
            color: white;
            right: 20px; /* Position at the bottom-right corner */
        }

        .btn-back:hover,
        .btn-logout:hover {
            background-color: #cc3700; /* Darker orange-red on hover */
            box-shadow: 0 0 10px rgba(0, 0, 0, 0.3);
            color: white;
        }
    </style>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css"
        rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC"
        crossorigin="anonymous">
</head>

<body style="background-color: #add8e6;">
    <%
        String context = request.getContextPath(); 
    %>

    <a href="<%=context%>/index.jsp" class="btn btn-logout">LOGOUT</a>
    <h1>Price Calculation</h1>

    <% String result = (String) request.getAttribute("result"); %>
    <% if (result != null) { %>
        <h1 class="result">Price of your vehicle is: <%= result %></h1>
    <% } %>

    <div>
        <form action="CalculatePrice.do" method="post">
            <table>
                <tr>
                    <td>Enter the price for your vehicle:</td>
                    <td><input type="text" name="no1"></td>
                </tr>
                <tr>
                    <td>Enter the discount for your vehicle type:</td>
                    <td><input type="text" name="no2"></td>
                </tr>
                <tr>
                    <td colspan="2" align="center"><input type="submit" value="Calculate"></td>
                </tr>
            </table>
        </form>
        <a href="home.jsp" class="btn btn-back">GO BACK TO HOME PAGE</a>
    </div>
</body>

</html>
