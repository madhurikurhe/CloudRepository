package com.techlabs.student.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.techlabs.student.model.Student;
import com.techlabs.student.model.AllStudentService;

@WebServlet(
name = "StudentServlet", 
urlPatterns = "/StudentServlet")

public class StudentServlet extends HttpServlet {

	public StudentServlet() {
		super();
	}

	private AllStudentService studentService = new AllStudentService();

	private void processRequest(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {

		int size = studentService.getStudents().size();
		if (size != 0) {
			List<Student> students = studentService.getStudents();
			request.setAttribute("stud", students);
		}

		RequestDispatcher dispatcher = request
				.getRequestDispatcher("views/studentRecord.jsp");
		dispatcher.forward(request, response);

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
