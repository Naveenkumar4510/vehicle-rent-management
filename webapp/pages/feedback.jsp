<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Add Feedback</title>
    <link rel="stylesheet" type="text/css" href="feedback.css">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
</head>
<body style="background-color: #add8e6;"> <!-- Set the background color to a light blueish-grey -->

<%
    String context = request.getContextPath(); 
%>
<a href="<%=context%>/index.jsp" class="btn btn-info logout-btn">LOGOUT</a>

<form action="insertfeedback.do" method="POST" class="center-form">
    <table>
        <tr>
            <h2>PROVIDE YOUR FEEDBACK</h2>
        </tr>
        <tr>
            <td class="header">FEEDBACK ID:</td>
            <td><input type="text" name="id"></td>
        </tr>
        <tr>
            <td class="header">USER ID:</td>
            <td><input type="text" name="userid"></td>
        </tr>
        <tr>
            <td class="header">VEHICLE NO:</td>
            <td><input type="text" name="vno"></td>
        </tr>
        <tr>
            <td class="header">FEEDBACK:</td>
            <td><input type="text" name="feedback"></td>
        </tr>
        <tr>
            <td class="header">RATING:</td>
            <td><input type="text" name="rating"></td>
        </tr>
        <tr>
            <td colspan="2" align="center"><input type="submit" value="ADD FEEDBACK" class="btn btn-primary"></td>
        </tr>
    </table>
</form>

</body>
</html>
