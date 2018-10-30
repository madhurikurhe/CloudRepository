<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page import="java.util.*"%>
<%@page import="com.techlabs.sample.bank.model.Transaction"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Transactions</title>
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.1.0/css/bootstrap.min.css">
<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
<script
	src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.0/umd/popper.min.js"></script>
<script
	src="https://stackpath.bootstrapcdn.com/bootstrap/4.1.1/js/bootstrap.min.js"></script>

<link
	href="http://ajax.googleapis.com/ajax/libs/jqueryui/1.8/themes/base/jquery-ui.css"
	rel="stylesheet" type="text/css" />
<script
	src="http://ajax.googleapis.com/ajax/libs/jquery/1.5/jquery.min.js"></script>
<script
	src="http://ajax.googleapis.com/ajax/libs/jqueryui/1.8/jquery-ui.min.js"></script>

<style>
table {
	border-collapse: collapse;
	width: 100%;
}

th, td {
	text-align: left;
	padding: 8px;
}

tr:nth-child(even) {
	background-color: #f2f2f2
}

th {
	background-color: #4CAF50;
	color: white;
}

</style>
<script type="text/javascript"
	src="https://cdnjs.cloudflare.com/ajax/libs/bootstrap-datepicker/1.4.1/js/bootstrap-datepicker.min.js"></script>
<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/bootstrap-datepicker/1.4.1/css/bootstrap-datepicker3.css" />
<link
	href="https://code.jquery.com/ui/1.10.4/themes/ui-lightness/jquery-ui.css"
	rel="stylesheet">
<script src="https://code.jquery.com/jquery-1.10.2.js"></script>
<script src="https://code.jquery.com/ui/1.10.4/jquery-ui.js"></script>
<script>
	$(document).ready(
			function() {
				var date_input = $('input[name="sdate"]');
				var date_input1 = $('input[name="edate"]');

				var container = $('.bootstrap-iso form').length > 0 ? $(
						'.bootstrap-iso form').parent() : "body";
				var options = {
					format : 'yyyy-mm-dd',
					container : container,
					todayHighlight : true,
					autoclose : true,
				};
				date_input.datepicker(options);
				date_input1.datepicker(options);

			})
</script>


</head>
<body>

	<jsp:include page="/WEB-INF/header.jsp" />



<div class="container">
  <form class="form-inline" action="SearchController" method="GET">
    <div class="form-group">
      <label for="date">Start Date:</label>
      <input type="text" class="form-control" id="startdate" placeholder="yy/mm/dd" name="sdate">
    </div>
    <div class="form-group">
      <label for="date">End Date:</label>
      <input type="text" class="form-control" id="enddate" placeholder="yy/mm/dd" name="edate">
    </div>
     <button type="submit" class="btn btn-info" style="font-size:20px"><i class="fa fa-filter">Filter </i></button>
    
  </form>
</div>

	<div>
		<table class="table table-light table-striped table-hover">
			<tr>
				<th>Name</th>
				<th>Amount</th>
				<th>Type</th>
				<th>Date</th>

			</tr>
			<%@page import="com.techlabs.sample.bank.model.Transaction"%>
			<%
				List<Transaction> transactions = (List) request
						.getAttribute("transactionList");
				if (transactions.isEmpty()) {
			%>
			<tr>
				<td>No transactions yet!</td>
			</tr>
			<%
				} else {
					for (Transaction t : transactions) {
			%>
			<tr>
				<td><%=t.getName()%></td>
				<td><%=t.getAmount()%></td>
				<td><%=t.getType()%></td>
				<td><%=t.getDate()%></td>
			</tr>

			<%
				}
			%>
			<%
				}
			%>
		</table>
	</div>
</body>
</html>