<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	<%@page import="com.techlabs.student.model.Student"%>
<%@page import="java.util.ArrayList"%>
<html>
<head>
<title>Student Application</title>
</head>
<body>
	    
	<center>
	<h1>Student Details</h1>
		<h2>
<a href="/new">Add New Student</a>&nbsp;&nbsp;&nbsp;             <a href="/list">Display
				All Students</a>
</h2>
	</center>
	    
	<div align="center">
		        
		<table border="1" cellpadding="5">
<caption>
				<h2>List of Students</h2>
			</caption>
					<tr>
<th>ID</th>
<th>Name</th>
</tr>
			<%
			
			ArrayList<Student> student = new ArrayList<Student>();
		if (request.getAttribute("stud") != null) {
			student = (ArrayList<Student>)request.getAttribute("stud");
				for (Student s : student) {
			%>
			<tr>
				<td><%=s.getId()%></td>
				<td><%=s.getName()%></td>
			
			
		<td><ahref="/edit?id=<c:out value=<%=s.getId()%> />">Edit</a>
				                        &nbsp;&nbsp;&nbsp;&nbsp;</td>
<td>     
				<a
				href="/delete?id=<c:out value=<%=s.getId()%> />">Delete</a>                    
				                    
			</td>
			
</tr></table>
		<%
			}}
		%>
		    
	</div>
	   
</body>
</html>