package com.techlabs.sample.bank.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class AdminWelcomeController
 */
@WebServlet("/AdminWelcomeController")
public class AdminWelcomeController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public AdminWelcomeController() {
		super();
	}

	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		
		RequestDispatcher view = request
				.getRequestDispatcher("/WEB-INF/AdminWelcome.jsp");
		view.forward(request, response);
	}

	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
	}

}
