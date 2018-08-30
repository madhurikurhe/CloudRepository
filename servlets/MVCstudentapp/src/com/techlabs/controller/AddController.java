package com.techlabs.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class AddController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public AddController() {
        super();
    }


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		String name = request.getParameter("fullname");
		String Addr = request.getParameter("address");
		String age = request.getParameter("age");
		
		if(name.isEmpty()||Addr.isEmpty()||age.isEmpty())
		{
			RequestDispatcher rd = request.getRequestDispatcher("views/registration.jsp");
			out.println("<font color=red>Please fill all the fields</font>");
			rd.include(request, response);
		}
		else
		{
			RequestDispatcher rd = request.getRequestDispatcher("views/Home.jsp");
			rd.forward(request, response);
		}
	}

}
