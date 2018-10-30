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

import com.techlabs.model.College;
import com.techlabs.service.CollegeService;

/**
 * Servlet implementation class ShowAllCollegeController
 */
@WebServlet("/showallcollege")
public class AllCollegeShowController extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public AllCollegeShowController() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RequestDispatcher view = request.getRequestDispatcher("views/ShowAllCollege.jsp");
		CollegeService service = new CollegeService();
		List<College> colleges = null;
		try {
			colleges = service.getColleges();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		request.setAttribute("colleges", colleges);
		view.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
