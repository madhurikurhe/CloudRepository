<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>User Data</title>
</head>
<style>
div.ex {
	text-align: right width:300px;
	padding: 10px;
	border: 5px solid grey;
	margin: 0px
}
</style>
<body>
	<h1>Edit Student</h1>
	<div class="ex">
		<form action="/student/EditStudentController" method="post">
			<table style="with: 50%">
				<tr>
					<td>Student ID</td>
					<td><input type="text" name="studentID" /></td>
				</tr>
				<tr>
					<td>Student Name</td>
					<td><input type="text" name="studentName" /></td>
				</tr>
				
			</table>
			<input type="submit" value="Update" />
			
		</form>
		
	</div>
	
</body>
</html>