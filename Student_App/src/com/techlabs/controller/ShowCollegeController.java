package com.techlabs.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.techlabs.model.College;
import com.techlabs.service.CollegeService;

@WebServlet("/showcollege")
public class ShowCollegeController extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public ShowCollegeController() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		CollegeService collegeService = new CollegeService();
		String id = (String)request.getParameter("cid");
		System.out.println("College id "+id);
		PrintWriter printWriter=response.getWriter();		
		College college = null;
		try {

			college = collegeService.getCollegeById(id);
			if(college!=null){
			System.out.println(college.getName());
			request.setAttribute("college", college);
			printWriter.println("College does not exist");
			RequestDispatcher view = request.getRequestDispatcher("views/College.jsp");
			view.forward(request, response);	
			}
			else
			{
				RequestDispatcher view = request.getRequestDispatcher("views/College.jsp");
				view.forward(request, response);
				printWriter.println("College does not exist"); 
			}
		} catch (SQLException e) {
			printWriter.println("College does not exist"); 
		}
		
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}

}
