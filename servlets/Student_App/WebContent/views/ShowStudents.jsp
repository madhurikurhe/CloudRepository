<%@page import="java.util.List"%>
<%@page import="com.techlabs.model.Student"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
	List<Student> students = (List<Student>) request
			.getAttribute("studentList");
	String username = (String) session.getAttribute("username");
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
		<a href="/Student_App/showstudents" align="right">Home</a> Username:
		<%
			out.println(username);
		%>
		<a href="/Student_App/logout" align="right">Logout</a>

	</div>
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
	padding: 10px;
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
		out.println("Roll No");
		out.println("</th>");

		out.println("<th>");
		out.println("First Name");
		out.println("</th>");

		out.println("<th>");
		out.println("Last Name");
		out.println("</th>");

		out.println("<th>");
		out.println("CGPA");
		out.println("</th>");

		out.println("<th>");
		out.println("College Details");
		out.println("</th>");

		out.println("<th>");
		out.println("Update Details");
		out.println("</th>");

		out.println("<th>");
		out.println("Delete Record");
		out.println("</th>");

		out.println("</tr>");

		for (Student student : students) {

			out.println("<tr>");
			out.println("<td>");
			out.println(student.getRoll_no());
			out.println("</td>");

			out.println("<td>");
			out.println(student.getFirstName());
			out.println("</td>");

			out.println("<td>");
			out.println(student.getLastName());
			out.println("</td>");

			out.println("<td>");
			out.println(student.getCgpa());
			out.println("</td>");

			out.println("<td>");
			out.println("<a href=\"/Student_App/showcollege?cid="
					+ student.getCollegeId() + "\">College ID: "
					+ student.getCollegeId() + "</a>");
			out.println("</td>");

			out.println("<td>");

			out.println("<a href=\"/Student_App/editstudent?id="
					+ student.getRoll_no() + "\">Edit</a>");
			out.println("</td>");

			out.println("<td>");
			out.println("<a href=\"/Student_App/DeleteController?id="
					+ student.getRoll_no() + "\">Delete</a>");
			out.println("</td>");

			out.println("</tr>");
		}

		out.println("</table>");
	%>




</body>
</html>