<%@page import="com.techlabs.model.Student"%>
<%@page import="java.util.Map"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
	Student student = (Student) request.getAttribute("student");
	String firstName = student.getFirstName();
	String lastName = student.getLastName();
	String college_id = student.getCollegeId();
	String roll_no = student.getRoll_no() + "";
	String cgpa = student.getCgpa() + "";
	String username = (String) session.getAttribute("username");

	Map<String, String> colleges = (Map<String, String>) request
			.getAttribute("collegeNameIdMap");
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
		<a href="/Student_App/showstudent" align="right">Home</a> Username:
		<%
			out.println(username);
		%>
		<a href="/Student_App/logout" align="right">Logout</a>

	</div>
	<form method="post" action="/Student_App/editstudent?id=<%=roll_no%>">
		<div>
			<label>First Name</label> <input type="text"
				value="<%=firstName == null ? "" : firstName%>" name="first_name" />
		</div>

		<div>
			<label>Roll No</label> <input type="number"
				value="<%=roll_no == null ? "" : roll_no%>" name="roll_no" />
		</div>

		<div>
			<label>Last Name</label> <input type="text" name="last_name"
				value="<%=lastName == null ? "" : lastName%>" />
		</div>
		<div>
			<label>CGPA</label> <input type="number" name="cgpa"
				value="<%=cgpa == null ? "" : cgpa%>" />
		</div>
		<br>
		
		<div>

			<label>College</label> <select name="college_name">
				<%
					for (Map.Entry<String, String> entry : colleges.entrySet()) {
						if (college_id == null) {
							out.println("<option selected=" + college_id == (entry
									.getKey())
									+ " value="
									+ entry.getKey()
									+ ">"
									+ entry.getValue() + "</option>");
						} else {
							out.println("<option value=" + entry.getKey() + ">"
									+ entry.getValue() + "</option>");
						}

					}
				%>
			</select>
		</div>
		<br>
		<div class=red>
			<%
				if (request.getAttribute("error") != null) {
					out.println("<p >" + (String) request.getAttribute("error")
							+ "</p>");
				}
			%>
		</div>

		<input type="submit" value="Update" />

	</form>


</body>
</html>