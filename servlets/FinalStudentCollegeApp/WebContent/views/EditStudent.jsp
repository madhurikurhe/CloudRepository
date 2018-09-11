<%@page import="com.techlabs.model.Student"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%
    	Student student = (Student)request.getAttribute("student");
        	String firstName = student.getFirstName();
        	String lastName = student.getLastName();
        	String college_id = student.getCollegeId();
        	String roll_no = student.getRoll_no()+"";
        	String cgpa = student.getCgpa()+"";
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1 align="center">Edit Student</h1>
<div>
<a href="/MVC_Student_App_DB/showstudent" align="right">Home</a>

</div>
	<form method="post" action="/MVC_Student_App_DB/editstudent?id=<%=roll_no%>" >
		<div>
			<label>First Name</label>
			<input type="text" value="<%= firstName==null ?"": firstName%>" name="first_name"/>
		</div>
		
		<div>
			<label>Roll No</label>
			<input  type="number" value="<%= roll_no==null ?"": roll_no%>" name="roll_no"/>
		</div>
		
		<div>
			<label>Last Name</label>
			<input type="text"  name="last_name" value="<%=lastName==null ?"": lastName%>"/>
		</div>
		<div>
			<label>CGPA</label>
			<input type="number" name="cgpa" value="<%=cgpa==null ?"": cgpa%>"/>
		</div>
		
		<div>
			<label>College ID</label>
			<input type="number" name="college_id" value="<%=college_id==null ?"": college_id%>"/>
		</div>
		
		<div class=red>
		<%
			if(request.getAttribute("error") != null){
				out.println("<p >"+(String)request.getAttribute("error")+"</p>");
			}
		%>
		</div>
		
		<input type="submit" value="Update"/>
	</form>
	

</body>
</html>