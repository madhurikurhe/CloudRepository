package com.techlabs.student.controller;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.techlabs.student.DAO.StudentDAO;
import com.techlabs.student.model.Student;

@WebServlet("/StudentController")
public class StudentController extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private static String INSERT_OR_EDIT = "AddStudents.jsp";
	private static String LIST_EMPLOYEE = "DisplayStudent.jsp";

	String url;

	StudentDAO studentDAO;

	public StudentController() throws SQLException {

		super();

		studentDAO = new StudentDAO();
	}

	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws IOException, ServletException {

		String action = request.getParameter("action");

		if (action.equals("list")) {

			url = LIST_EMPLOYEE;

			List<Student> list = studentDAO.getAllStudents();
			request.setAttribute("students", list);

		} else if (action.equals("edit")) {

			url = INSERT_OR_EDIT;

			String id = request.getParameter("id");

			Student student = studentDAO.getStudentById(id);

			request.setAttribute("students", student);

		} else if (action.equals("delete")) {

			url = INSERT_OR_EDIT;

			String id = request.getParameter("empId");

			Student student = new Student();
			student.setId(id);

			studentDAO.deleteStudent(student);

		} else {
			url = INSERT_OR_EDIT;
		}

		RequestDispatcher view = request.getRequestDispatcher(url);
		view.forward(request, response);

	}

	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws IOException, ServletException {

		Student student = new Student();

		String id = request.getParameter("id");

		student.setName(request.getParameter("name"));
		student.setId(request.getParameter("id"));

		if (id == null || id.isEmpty()) {

			studentDAO.addStudent(student);

		} else {

			student.setId(id);
			studentDAO.updateStudent(student);

		}

		RequestDispatcher view = request
				.getRequestDispatcher("DisplayStudent.jsp");
		List<Student> list = studentDAO.getAllStudents();
		request.setAttribute("students", list);
		view.forward(request, response);

	}

}