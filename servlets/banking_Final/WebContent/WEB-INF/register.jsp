<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Register</title>
<jsp:include page="scripts.jsp" />
<style type="text/css">
#matching {
color:green;
}
</style>
</head>
<body>
	<%
		String error = "";
		String disp = "none";
		if (request.getAttribute("error") != null) {
			disp = "block";
			error = (String) request.getAttribute("error");
		}
	%>
	<jsp:include page="header.jsp" />
	<div class="jumbotron text-center">
		<h2>Register</h2>
	</div>
	<div class="container">
		<div class="col-sm-8 col-md-6">
			<form action="register" method="POST">
				<div class="input-group mb-3">
					<div class="input-group-prepend">
						<span class="input-group-text" id="inputGroup-sizing-sm">Username</span>
					</div>
					<input type="text" class="form-control" name="name" required>
				</div>
				<div class="input-group mb-3">
					<div class="input-group-prepend">
						<span class="input-group-text" id="inputGroup-sizing-sm">Password</span>
					</div>
					<input type="password" class="form-control" id="pwd1" name="pwd1"
						required>
				</div>
				
				<div class="input-group mb-3">
					<div class="input-group-prepend">
						<span class="input-group-text" id="inputGroup-sizing-sm">Amount</span>
					</div>
					<input type="number" class="form-control" id="amount" name="amount"
						required>
				</div>
				<div class="text-center">
					<input type="submit" id="submitbtn" value="Register"
						class="btn btn-primary" />
				</div>
			</form>
		</div>
	</div>

</body>
</html>