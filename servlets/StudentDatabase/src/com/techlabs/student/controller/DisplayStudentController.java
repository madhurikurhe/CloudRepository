package com.techlabs.student.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.techlabs.student.model.DisplayStudent;
import com.techlabs.student.model.Student;


@WebServlet("/DisplayStudentController")
public class DisplayStudentController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public DisplayStudentController() {
        super();
    }

	private void processRequest(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		DisplayStudent student=new DisplayStudent();
		if (student.displayStudent()!=null) {
			List<Student> students = student.displayStudent();
			request.setAttribute("stud", students);
		}

		RequestDispatcher dispatcher = request
				.getRequestDispatcher("views/DisplayStudent.jsp");
		dispatcher.forward(request, response);

	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		processRequest(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		processRequest(request, response);
	}

}
