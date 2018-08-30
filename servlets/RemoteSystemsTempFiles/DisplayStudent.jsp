<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Display</title>

</head>
<body>  
<% String ID =  request.getParameter("studentID");
	String Name = request.getParameter("studentName");
	
	 %>
<table>
<tr>
	<td>Student ID</td>
	<td><%= ID %></td>
</tr>
<tr>
	<td>Name</td>
	<td><%= Name %></td>
</tr>
</table>
</body>
</html>