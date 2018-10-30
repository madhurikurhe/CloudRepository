package com.techlabs.sample.bank.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.techlabs.sample.bank.model.AccountService;
import com.techlabs.sample.bank.model.Transaction;
import com.techlabs.sample.bank.model.TransactionService;


@WebServlet("/displayTransactions")
public class DisplayTransactionController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private TransactionService transactionService;
	private AccountService acctService;
	public DisplayTransactionController() {
		super();
		transactionService = new TransactionService();
		acctService=new AccountService();
	}

	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		String name = (String) request.getSession().getAttribute("name");
		List<Transaction> transactions = transactionService.getTransactions(name);
		double bal= acctService.getBalance(name);
		request.setAttribute("bal", bal);
		request.setAttribute("transactionList", transactions);
		RequestDispatcher view = request
				.getRequestDispatcher("transactions.jsp");
		view.forward(request, response);
	}
}

