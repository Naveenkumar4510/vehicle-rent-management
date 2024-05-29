<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Add Discount</title>
    <link rel="stylesheet" type="text/css" href="discount.css">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
</head>
<body style="background-color: #add8e6;">

<%
    String context = request.getContextPath(); 
%>
<a href="<%=context%>/index.jsp" class="btn btn-info logout-btn">LOGOUT</a>

<form action="insertdiscount.do" method="POST">
    <table>
        <tr>
            <td colspan="2">
                <h2 align="center">ADD DISCOUNT</h2>
            </td>
        </tr>
        <tr>
            <td style="background-color: #e9e9e9;">DISCOUNT ID:</td>
            <td><input type="text" name="id"></td>
        </tr>
        <tr>
            <td style="background-color: #e9e9e9;">PRICE:</td>
            <td><input type="text" name="price"></td>
        </tr>
        <tr>
            <td style="background-color: #e9e9e9;">DISCOUNT PERCENTAGE:</td>
            <td><input type="text" name="percent"></td>
        </tr>
        <tr>
            <td style="background-color: #e9e9e9;">LUCKY CODE:</td>
            <td><input type="text" name="code"></td>
        </tr>
        <tr>
            <td colspan="2" align="center"><input type="submit" value="ADD DISCOUNT"></td>
        </tr>
    </table>
</form>

</body>
</html>
