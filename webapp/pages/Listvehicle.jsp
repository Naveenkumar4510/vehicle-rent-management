<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Vehicle Details</title>
    <!-- Include Bootstrap CSS -->
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css">
    <!-- Set a lighter version of blue for the background -->
    <style>
        body {
            background-color: #4da6ff; /* Lighter blue tone, you can adjust this color */
            color: white;
            margin: 0;
            padding: 0;
            display: flex;
            flex-direction: column;
            align-items: center;
            justify-content: center;
            min-height: 100vh;
        }

        .table-container {
            max-width: 800px;
            padding: 20px;
            background-color: rgba(169, 169, 169, 0.9); /* Grey color for the container background */
            border-radius: 8px;
            box-shadow: 0 0 10px rgba(0, 0, 0, 0.3);
        }

        .table-container h1 {
            text-align: center;
            font-weight: bold;
            color: #007bff; /* A slightly darker blue for better visibility */
            margin-bottom: 20px;
        }

        table {
            width: 100%;
            border-collapse: collapse;
        }

        th, td {
            text-align: center;
            padding: 10px;
            color: black;
        }

        th {
            font-weight: bold;
        }

        tr:nth-child(even) {
            background-color: rgba(255, 255, 255, 0.1);
        }

        .btn-info {
            background-color: #2c3e50;
            color: #ffffff;
            font-weight: bold;
            border-radius: 4px;
            padding: 10px 20px;
            border: none;
            cursor: pointer;
            transition: background-color 0.3s, color 0.3s, box-shadow 0.3s;
            position: fixed;
            bottom: 20px;
            right: 20px;
        }

        .btn-info:hover {
            background-color: #34495e;
            box-shadow: 0 0 10px rgba(0, 0, 0, 0.3);
            color: #ffffff;
        }

        .btn-home {
            background-color: #2c3e50;
            color: #ffffff;
            font-weight: bold;
            border-radius: 4px;
            padding: 10px 20px;
            border: none;
            cursor: pointer;
            transition: background-color 0.3s, color 0.3s, box-shadow 0.3s;
            position: fixed;
            bottom: 20px;
            left: 20px;
        }

        .btn-home:hover {
            background-color: #34495e;
            box-shadow: 0 0 10px rgba(0, 0, 0, 0.3);
            color: #ffffff;
        }
    </style>
</head>

<body>
<%
    String context = request.getContextPath();
%>
    <a href="<%=context%>/index.jsp" class="btn btn-info">LOGOUT</a>
    <div class="container table-container">
        <h1>VEHICLE DETAILS:</h1>
        <table class="table table-bordered">
            <thead class="table-dark">
                <tr>
                    <th>VEHICLE NO</th>
                    <th>VEHICLE NAME</th>
                    <th>VEHICLE TYPE</th>
                    <th>PRICE</th>
                </tr>
            </thead>
            <tbody>
                <sql:setDataSource driver="com.mysql.cj.jdbc.Driver"
                    url="jdbc:mysql://localhost:3307/vehiclerent"
                    user="root" password="12345" var="ds"></sql:setDataSource>

                <sql:query dataSource="${ds}" var="rs">
                    SELECT * FROM vehicle;
                </sql:query>

                <c:forEach items="${rs.rows}" var="row">
                    <tr>
                        <td><c:out value="${row.vno}" /></td>
                        <td><c:out value="${row.vname}" /></td>
                        <td><c:out value="${row.vtype}" /></td>
                        <td><c:out value="${row.vprice}" /></td>
                    </tr>
                </c:forEach>
            </tbody>
        </table>
    </div>
    <a href="adminhome.jsp" class="btn btn-home">GO BACK TO HOME PAGE</a>
</body>
</html>
