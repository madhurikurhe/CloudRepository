<%@page import="java.util.List"%>
<%@page import ="com.techlabs.model.Student" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%
    	List<Student> students = (List<Student>)request.getAttribute("studentsList");
    %>
    

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>Students in this college</h1>
<div>
<a href="/MVC_Student_App_DB/showstudent" align="right">Home</a>

</div>

<%
	for(Student student: students){
		out.println("<div>");
		out.println("<p>");
		out.println("Roll No: "+student.getRoll_no());
		out.println("</p>");
		
		out.println("<p>");
		out.println("First Name: "+student.getFirstName());
		out.println("</p>");
		
		out.println("<p>");
		out.println("Last Name: "+student.getLastName());
		out.println("</p>");
		
		out.println("<p>");
		out.println("CGPA: "+student.getCgpa());
		out.println("</p>");
		
		
		out.println("</div>");
		out.println("<div>");
		
		out.println("</div>");
		out.println("<hr/>");
	}
%>


</body>
</html>