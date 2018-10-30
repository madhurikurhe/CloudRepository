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
<style>
table {
    border-collapse: collapse;
    width: 100%;
}

th, td {
    text-align: left;
    padding: 8px;
}

tr:nth-child(even){background-color: #f2f2f2}

th {
    background-color: #4CAF50;
    color: white;
}
</style>
</head>
<body>
<jsp:include page="/WEB-INF/header.jsp" />
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
				List<Transaction> transactions = (List) request.getAttribute("transactionList");
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
				}
			%>
		</table>
	</div>
</body>
</html>