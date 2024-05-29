<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Register urself</title>
</head>
<body>
<h2 align="center">Register Product </h2>

<form action="registerproduct.do">
<table>
	 
	<tr>
		<td>Product id</td>
		<td><input type="text" name="pid"></td>
	</tr>
	<tr>
		<td>Product Name</td>
		<td><input type="text" name="pname"></td>
	</tr> 
	<tr>
		<td colspan="2" align="center"><input type="submit" value="Register"></td>
	</tr>
</table>
</form>
</body>
</html>