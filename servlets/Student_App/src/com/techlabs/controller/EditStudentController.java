package com.techlabs.controller;

import java.io.IOException;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.techlabs.model.Student;
import com.techlabs.service.CollegeService;
import com.techlabs.service.StudentService;

@WebServlet("/editstudent")
public class EditStudentController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public EditStudentController() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		CollegeService collegeService=new CollegeService();
		checkAuthState(request, response);
		RequestDispatcher view = request.getRequestDispatcher("views/EditStudent.jsp");
		
		HttpSession session = request.getSession();
		String username = (String) session.getAttribute("username");

		if (username == null) {
			response.sendRedirect("views/login.html");
		} else {
		
			Map<String, String> colleges = new HashMap<>();
			try {
				colleges = collegeService.getCollegeIdNames();
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
		String id = request.getParameter("id");
		System.out.println("get " + id);
		StudentService studentService = new StudentService();
		Student student = null;
		try {
			student = studentService.getSingleStudent(id);
			System.out.println("got student");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		request.setAttribute("student", student);
		
		for(Entry<String, String> s:colleges.entrySet()){
			System.out.println("Key:"+s.getKey());
			System.out.println("Value:"+s.getValue());
		}
		
		request.setAttribute("collegeNameIdMap", colleges);
		}
		
		view.forward(request, response);
	}

	private void checkAuthState(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		HttpSession session = request.getSession();
		String username = (String) session.getAttribute("username");
		if (username == null) {
			response.sendRedirect("views/login.html");
		} else {
			return;
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html");
		StudentService studentService = new StudentService();
		CollegeService collegeService=new CollegeService();
		
		HttpSession session = request.getSession();
		String username = (String) session.getAttribute("username");
		if (username == null) {
			response.sendRedirect("views/login.html");
		} else {
			Map<String, String> colleges = new HashMap<>();
			try {
				colleges = collegeService.getCollegeIdNames();
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
			
			
			
		String firstName = request.getParameter("first_name");
		String lastName = request.getParameter("last_name");
		String cgpa = request.getParameter("cgpa");
		String college_id = request.getParameter("college_name");
		String roll_no = request.getParameter("roll_no");
		
		System.out.println(firstName);
		System.out.println(lastName);
		System.out.println(cgpa);
		String parsedfirstName = "";
		String parsedlastName = "";
		double parsedcgpa = 0;
		String parsedCollege_id = "";
		String parsedRoll_no = "";
		
		request.setAttribute("firstName", firstName); 
		request.setAttribute("lastName", lastName);
		request.setAttribute("cgpa", cgpa);
		//request.setAttribute("college_id", college_id);
		request.setAttribute("roll_no", parsedRoll_no);
		request.setAttribute("collegeNameIdMap", colleges);
		
		if (firstName.equals("") || lastName.equals("") || cgpa.equals("")|| college_id.equals("")) {
			RequestDispatcher view = request.getRequestDispatcher("views/AddStudent.jsp");
			request.setAttribute("error", new String("Please enter all the values"));
			view.forward(request, response);
		} else {
			parsedRoll_no = (String) roll_no;
			parsedfirstName = (String) firstName;
			parsedlastName = (String) lastName;
			parsedcgpa = Double.parseDouble(cgpa);
			parsedCollege_id = (String) college_id;
			
			System.out.println("post " + request.getParameter("id"));
			try {
				studentService.updateStudent(request.getParameter("id"),
						new Student(Integer.parseInt(parsedRoll_no), parsedfirstName, parsedlastName, parsedcgpa, parsedCollege_id));
			} catch (NumberFormatException | SQLException e) {
				e.printStackTrace();
			}

			response.sendRedirect("/Student_App/showstudent");
		}
	}
}
}