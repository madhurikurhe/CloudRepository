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

import com.techlabs.model.Student;
import com.techlabs.service.StudentService;

/**
 * Servlet implementation class ShowStudentsInCollegeController
 */
@WebServlet("/showstudents")
public class CollegeWiseStudentsShowController extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
    public CollegeWiseStudentsShowController() {
        super();
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("Inside show students");
		StudentService service = new StudentService();
		String collegeId = request.getParameter("cid");
		System.out.println("College id: "+collegeId);
		
		List<Student> studentsList = null;
		try {
			System.out.println("Inside show student controller");
			studentsList = service.getStudentsByCollegeId(collegeId);
			RequestDispatcher view = request.getRequestDispatcher("views/ShowStudents.jsp");
			request.setAttribute("studentsList", studentsList);
			view.forward(request, response);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
