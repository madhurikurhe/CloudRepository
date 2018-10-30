package com.techlabs.sample.bank.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import nl.captcha.Captcha;

import com.techlabs.sample.bank.model.Account;
import com.techlabs.sample.bank.model.AccountService;

@WebServlet("/register")
public class RegistrationController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private AccountService acctService;

	public RegistrationController() {
		super();
		acctService = new AccountService();
	}

	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		RequestDispatcher view = request
				.getRequestDispatcher("/WEB-INF/register.jsp");
		view.forward(request, response);
	}

	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {


			String name = request.getParameter("name");
			String pass = request.getParameter("pwd1");
			double balance = Double.parseDouble(request.getParameter("amount"));
			acctService.addUser(new Account(name, pass, balance));
			response.sendRedirect("login");
		
	}
}
