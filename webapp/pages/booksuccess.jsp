
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
String context = request.getContextPath();
%>
<font color="green" size="20">${requestScope.booksuccess }</font>
<h3>Welcome ${requestScope.details.userid }</h3>
<h4>Details booked sucessfully
${requestScope.details.password }</h4>

<span><a href="<%=context%>\pages\home.jsp"> home</a></span>
</body>
</html>