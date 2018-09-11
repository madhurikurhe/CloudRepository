<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@page import="java.util.ArrayList"%>
<%@page import="com.techlabs.model.Student"%>
<html>
<head>
<title>Student Database Application</title>
</head>
<body>
	    
	<center>
		<h2>
			<a href="/new">Add New Student</a>
			            &nbsp;&nbsp;&nbsp;             <a href="/list">List
All Student</a>         
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
					student = (ArrayList<Student>) request.getAttribute("stud");
				}
			%>

			<c:forEach var="s" items="${student}">
                <tr>
					<td><c:out value="${student.id}" /></td>
					<td><c:out value="${student.name}" /></td>

					<td>                        <a
						href="/edit?id=<c:out value='${student.id}' />">Edit</a>
						                        &nbsp;&nbsp;&nbsp;&nbsp;
						                        <a
						href="/delete?id=<c:out value='${student.id}' />">Delete</a>                     
						                    
					</td>
				</tr>
            </c:forEach>
			        
		</table>
		    
	</div>
	   
</body>
</html>