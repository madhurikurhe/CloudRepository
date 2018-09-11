package com.techlabs.student.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.techlabs.student.model.AddStudent;
import com.techlabs.student.model.Student;
import com.techlabs.student.model.AllStudentService;

@WebServlet("/AddStudentController")
public class AddStudentController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public AddStudentController() {
		super();
	}

	private AddStudent addStudent = new AddStudent();

	private void processRequest(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		AddStudent addStud = new AddStudent();

		String name = request.getParameter("studentName");
		String id = request.getParameter("studentID");

			RequestDispatcher rd = request
					.getRequestDispatcher("views/AddStudent.jsp");
			out.println("<font color=red>Please fill all the fields</font>");
			rd.include(request, response);

			String name1 = request.getParameter("studentName");
			String id1 = request.getParameter("studentID");

			Student s1 = new Student(id1, name1);
			addStud.addStudentService(s1);
			
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
