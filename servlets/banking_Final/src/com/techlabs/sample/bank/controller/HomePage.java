package com.techlabs.sample.bank.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.techlabs.sample.bank.model.Account;
import com.techlabs.sample.bank.model.AccountService;

@WebServlet("/showAll")
public class HomePage extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private AccountService acctService;

	public HomePage() {
		super();
		acctService = new AccountService();
	}

	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		List<Account> account = acctService.getAllCustomer();
		request.setAttribute("accountList", account);
		RequestDispatcher view = request.getRequestDispatcher("homePage.jsp");
		view.forward(request, response);

	}

	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {

	}

}
