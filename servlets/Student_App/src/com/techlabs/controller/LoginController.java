package com.techlabs.controller;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.techlabs.model.User;
import com.techlabs.service.AuthenticationService;

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
		HttpSession session = request.getSession();
		AuthenticationService authService =new AuthenticationService();
		boolean authState = false;
		try {
			authState = authService.checkUser(new User(username, password));
		} catch (SQLException e) {
			e.printStackTrace();
		}
		if(authState) {
			System.out.println("Login successfull");
			
			session.setAttribute("username", username);
			System.out.println("User name from login controller "+username);
			
			response.sendRedirect("/Student_App/showstudent");
		} else {
			System.out.println("Invalid username and password");
			RequestDispatcher view = request.getRequestDispatcher("views/login.html");
			session.setAttribute("username", null);
			view.forward(request, response);
		}
	}

}
