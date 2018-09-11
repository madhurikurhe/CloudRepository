<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@page import="java.util.ArrayList"%>
<%@page import="com.techlabs.model.Student"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Display</title>

</head>
<style>
table {
    border-collapse: collapse;
    width: 100%;
    background-color: pink;
}

th, td {
    padding: 8px;
    text-align: left;
    border-bottom: 1px solid #ddd;
}

tr:hover {background-color:#f5f5f5;}
</style>
<body>

	<%
	ArrayList<Student> student = new ArrayList<Student>();
if (request.getAttribute("stud") != null) {
	student = (ArrayList<Student>)request.getAttribute("stud");
		%>
		
		<table>
		<tr>
			<th>Student ID</th>
			<th>Student Name</th>
		</tr>
		<% 
	for(Student s:student){
%>
	
		<tr>
			<td><%=s.getId() %></td>
			<td><%= s.getName() %></td>
		</tr>


	<%
}
}
%>
	</table>
</body>
</html>