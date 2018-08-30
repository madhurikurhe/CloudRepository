package com.example.web;
import java.io.*;
import java.util.List;

import javax.servlet.*;
import javax.servlet.http.*;

import com.example.model.BeerExpert;

public class BeerSelect extends HttpServlet {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		String c = request.getParameter("color");
		BeerExpert be = new BeerExpert();
		List<String> result = be.getBrands(c);
		request.setAttribute("styles", result);
		RequestDispatcher view = request.getRequestDispatcher("result.jsp");
		view.forward(request, response);
		
	}
}