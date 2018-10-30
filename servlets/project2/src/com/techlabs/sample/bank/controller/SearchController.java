package com.techlabs.sample.bank.controller;

import java.io.IOException;
import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.techlabs.sample.bank.model.Transaction;
import com.techlabs.sample.bank.model.TransactionService;

/**
 * Servlet implementation class SearchController
 */
@WebServlet("/SearchController")
public class SearchController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private TransactionService transactionService;

	public SearchController() {
		super();
		transactionService = new TransactionService();
	}

	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {

		String startDate = request.getParameter("sdate");
		String endDate = request.getParameter("edate");
		System.out.println("Inside search controller");

		System.out.println(startDate);
		System.out.println(endDate);

		 @SuppressWarnings("deprecation")
		java.util.Date date3 = new java.util.Date(startDate);
		 @SuppressWarnings("deprecation")
		java.util.Date date4 = new java.util.Date(endDate);
		    
		 java.sql.Date stDate = new java.sql.Date(date3.getTime());
		    java.sql.Date etDate = new java.sql.Date(date4.getTime());
		    
		    System.out.println("SQL start date:"+stDate);
		    System.out.println("SQL end date:"+etDate);
		    
		List<Transaction> transactions = transactionService
				.getFilteredTransactions(stDate, etDate);
		request.setAttribute("transactionList", transactions);
		RequestDispatcher view = request
				.getRequestDispatcher("transactions.jsp");
		view.forward(request, response);

	}

	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
	}

}
