<%@page import="com.ntt.training.domain.User"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
  <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
  <title>Insert title here</title>
  <style>
    body {
      font-family: Arial, sans-serif;
      background-color: #f2f2f2;
      margin: 0;
      padding: 20px;
    }

    h3 {
      color: #333;
      font-size: 24px;
    }

    h4 {
      color: #777;
      font-size: 18px;
    }

    .success {
      color: green;
      font-size: 20px;
    }

    .link {
      margin-top: 20px;
      display: inline-block;
      font-size: 16px;
      text-decoration: none;
      padding: 10px 20px;
      background-color: #007bff;
      color: #fff;
      border-radius: 5px;
    }

    .link:hover {
      background-color: #0056b3;
    }
  </style>
</head>
<body>
  <%
  String context = request.getContextPath();
  %>

  <span class="success">${requestScope.success }</span>
  <h3>Welcome ${requestScope.details.userid }</h3>
  <h4>Please note your password for further use: ${requestScope.details.password }</h4>

  <div>
    <a class="link" href="<%=context%>/pages/Login.jsp">LOGIN HERE</a> 
  </div>

  <div>
    <a class="link" href="<%=context%>/index.jsp">LOGOUT</a>
  </div>
</body>
</html>
