<%@page import="java.util.List"%>
<%@page import="com.techlabs.model.*"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%
    	List<College> colleges = (List<College>)request.getAttribute("colleges");
    
	String username = (String) session.getAttribute("username");
%>
   
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>All Colleges</h1>
<div>
<a href="views/index.html" align="right">Home</a>
<%if(username==null)
	username="guest";
else
	 username = (String) session.getAttribute("username");
	%>
Username:
<%out.println(username); %>
<% if(username!=null){%>
<a href="/Student_App/logout" align="right">Logout</a>
<%}else{	%>
<a href="/Student_App/login" align="right">Login</a>

<%} %></div>
<div>

			<style>
table, td, th {
	border: 1px solid #ddd;
	text-align: left;
}

table {
	border-collapse: collapse;
	width: 100%;
}

 td {
	padding: 15px;
}

th {
    padding-top: 12px;
    padding-bottom: 12px;
    text-align: left;
    background-color: #4CAF50;
    color: white;
}
</style>	
			
	<%
	out.println("<table>");
	out.println("<tr>");
	out.println("<th>");
	out.println("College Name");
	out.println("</th>");

	out.println("<th>");
	out.println("College ID");
	out.println("</th>");
	
	out.println("<th>");
	out.println("College Location");
	out.println("</th>");

	out.println("<th>");
	out.println("Show Students");
	out.println("</th>");

	out.println("</tr>");

		for(College college: colleges){
			out.println("<tr>");
			out.println("<td>");
			out.println(college.getName());
			out.println("</td>");
			
			out.println("<td>");
			out.println(college.getCollege_id());
			out.println("</td>");
			
			out.println("<td>");
			out.println(college.getLocation());
			out.println("</td>");
			
			out.println("<td>");
			out.println("<a href=\"/Student_App/showstudents?cid="+college.getCollege_id()+"\">Show students</a>");
			out.println("</td>");
			out.println("</tr>");
			
		}
	out.println("</table>");
	
	%>
</div>

</body>
</html>