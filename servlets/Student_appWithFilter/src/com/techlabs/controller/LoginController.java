package com.techlabs.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.techlabs.model.User;
import com.techlabs.service.AuthenticationService;

/**
 * Servlet implementation class LoginController
 */
@WebServlet("/login")
public class LoginController extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public LoginController() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		System.out.println(username+" "+password);
		AuthenticationService authService = AuthenticationService.getAuthService();
		boolean authState = authService.checkUser(new User(username, password));
		if(authState) {
			System.out.println("Login successfull");
			HttpSession session = request.getSession();
			session.setAttribute("username", username);
			response.sendRedirect("/Student_appWithFilter/showstudent");
		} else {
			System.out.println("Invalid credentials");
			RequestDispatcher view = request.getRequestDispatcher("views/login.html");
			view.forward(request, response);
		}
	}

}
