package com.techlabs.controller;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.techlabs.model.Student;
import com.techlabs.service.StudentService;

/**
 * Servlet implementation class ShowStudentController
 */
@WebServlet("/showstudent")
public class ShowStudentController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public ShowStudentController() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		HttpSession session = request.getSession();
		String username = (String) session.getAttribute("username");
		if (username == null) {
			response.sendRedirect("views/login.html");
		} else {
			StudentService studentService = new StudentService();
			List<Student> students = null;
			try {
				students = studentService.getStudents();
			} catch (SQLException e) {
				e.printStackTrace();
			}

			request.setAttribute("students", students);

			RequestDispatcher view = request.getRequestDispatcher("views/students.jsp");
			view.forward(request, response);
		}
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
