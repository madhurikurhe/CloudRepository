package com.techlabs.controllers;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/welcome")
public class WelcomeController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public WelcomeController() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter writer = response.getWriter();
		System.out.println("Inside doGet() method");
		String htmlRespone = "<html>";
		htmlRespone += "<h2>Inside doGet method " ;
		htmlRespone +=  "</h2>";
		htmlRespone += "</html>";
		writer.println(htmlRespone);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("Inside doPost() method");
		PrintWriter writer = response.getWriter();
		
		String htmlResponse = "<html>";
		htmlResponse += "<h2>Inside doPost method " ;
		htmlResponse +=  "</h2>";
		htmlResponse += "</html>";
		
		writer.println(htmlResponse);
		doGet(request,response);
	}

}
