<%@page import="java.io.PrintWriter"%>
<%@page import="com.techlabs.model.Student"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

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
	<h1 align="center">Students List</h1>

	<div>
		<a href="views/index.html" align="right">Home</a>
<a href="/Student_App/addstudent">Add Student</a>
	</div>
	<div style="float: right">

		Username:
<%out.println(username); %>		
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
<script language="javascript">
function deleteRecord(id){
    var doIt=confirm('Do you want to delete the record?');
  if(doIt){
   var f=document.form;
    f.method="post";
    f.action='../DeleteController?id='+id;
    f.submit();
    }
  else{

    }
}
</script>

	<%
		List<Student> students = (List<Student>) request
				.getAttribute("students");


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
			out.println( student.getCgpa());
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