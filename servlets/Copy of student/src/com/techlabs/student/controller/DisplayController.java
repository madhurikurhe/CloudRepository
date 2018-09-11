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

import com.techlabs.student.DAO.GetAllStudentFromDB;
import com.techlabs.student.model.Student;

@WebServlet("/DisplayController")
public class DisplayController extends HttpServlet {

	public DisplayController() throws SQLException{
	 
	}
	
	private void processRequest(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException, SQLException {
		GetAllStudentFromDB student = new GetAllStudentFromDB();
		if (student.getAllUsers()!=null) {
			List<Student> students = student.getAllUsers();
			request.setAttribute("stud", students);
		}

		RequestDispatcher dispatcher = request
				.getRequestDispatcher("views/DisplayStudent.jsp");
		dispatcher.forward(request, response);

	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			processRequest(request, response);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			processRequest(request, response);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}


