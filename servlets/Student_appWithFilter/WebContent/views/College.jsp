<%@page import="com.techlabs.model.College"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@page import="java.sql.*"%>
<%
	String username = (String) session.getAttribute("username");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>College details</h1>
	<div>
		<div>
			<a href="/Student_appWithFilter/showstudent" align="right">Home</a> Username:
			<%
				out.println(username);
			%>
			<a href="/Student_appWithFilter/logout" align="right">Logout</a>


		</div>
		<%
			try {
				College college = (College) request.getAttribute("college");
				String id = college.getCollege_id();
				if (id != null) {
					String name = college.getName();
					String location = college.getLocation();
					out.println("<h1>College Found<h1>");
					out.println("<p>Name: " + name + "</p>");
					out.println("<p>ID: " + id + "</p>");
					out.println("<p>Location: " + location + "</p>");
				} else {
					out.println("<h1>College Does not exist</h1>");
				}
			} catch (Exception ex) {
				out.println("<h1>College does not exist</h1>");
			}
		%>
	</div>

</body>
</html>