<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	<%@page import="java.util.ArrayList"%>
	<%@page import="com.techlabs.student.model.Student" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	   <%
	ArrayList<Student> student = new ArrayList<Student>();
	if (request.getAttribute("stud") != null) {
		student = (ArrayList<Student>)request.getAttribute("stud");
			
		for(Student s:student){
			out.println(s.getId());
			out.println(s.getName());
			
		}
	
	}
%>
</body>
</html>