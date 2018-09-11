package com.techlabs.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.techlabs.model.AddService;
import com.techlabs.model.Student;


@WebServlet("/AddController")
public class AddController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public AddController() {
		super();
	}

	private AddService add = new AddService();

	private void processRequest(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();

		int userid = Integer.parseInt(request.getParameter("userid"));
		String firstname = request.getParameter("firstname");
		String lastname = request.getParameter("lastname");

			RequestDispatcher rd = request
					.getRequestDispatcher("/edit.jsp");
			out.println("<font color=red>Please fill all the fields</font>");
			rd.include(request, response);

			int userid1 = Integer.parseInt(request.getParameter("userid"));
			String firstname1 = request.getParameter("firstname");
			String lastname1 = request.getParameter("lastname");

			Student s1 = new Student(userid1, firstname1,lastname1);
			add.addStudentService(s1);
			
			System.out.println("Record added");
		}

	

	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		processRequest(request, response);
	}

	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		processRequest(request, response);
	}

}
