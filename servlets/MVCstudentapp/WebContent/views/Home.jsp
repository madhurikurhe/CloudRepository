<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Display</title>

</head>
<body>  
<% String name =  request.getParameter("fullname");
	String Addr = request.getParameter("address");
	String age = request.getParameter("age");
	 %>
<table>
<tr>
	<td>Full Name</td>
	<td><%= name %></td>
</tr>
<tr>
	<td>Address</td>
	<td><%= Addr %></td>
</tr>
<tr>
	<td>Age</td>
	<td><%= age %></td>
</tr>

</table>
</body>
</html>