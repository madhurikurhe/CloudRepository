package com.techlabs.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.techlabs.dao.StudentDao;
import com.techlabs.model.Student;

public class StudentController extends HttpServlet {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private static String INSERT = "/user.jsp";
	private static String Edit = "/edit.jsp";
	private static String StudentRecord = "/listUser.jsp";

	private StudentDao dao;

	public StudentController() {
		super();
		dao = new StudentDao();
	}

	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		String redirect = "";
		String studentId = request.getParameter("userid");
		String action = request.getParameter("action");
		if (!((studentId) == null) && action.equalsIgnoreCase("insert")) {
			
			redirect = insertStudent(request, studentId);
		} else if (action.equalsIgnoreCase("delete")) {
			
			redirect = deleteStudent(request);
		} else if (action.equalsIgnoreCase("editform")) {
			redirect = Edit;
		} else if (action.equalsIgnoreCase("edit")) {
			redirect = editStudent(request);
		} else if (action.equalsIgnoreCase("listUser")) {
			redirect = StudentRecord;
			request.setAttribute("users", dao.getAllStudents());
		} else {
			redirect = INSERT;
		}

		RequestDispatcher rd = request.getRequestDispatcher(redirect);
		rd.forward(request, response);
	}

	private String editStudent(HttpServletRequest request) {
		String redirect;
		String studentId;
		studentId = request.getParameter("userId");
		int uid = Integer.parseInt(studentId);
		Student student = new Student();
		student.setId(uid);
		student.setfName(request.getParameter("firstName"));
		student.setlName(request.getParameter("lastName"));
		dao.editStudent(student);
		request.setAttribute("user", student);
		redirect = StudentRecord;
		System.out.println("Record updated Successfully");
		return redirect;
	}

	private String deleteStudent(HttpServletRequest request) {
		String redirect;
		String userId = request.getParameter("userId");
		int uid = Integer.parseInt(userId);
		dao.removeStudent(uid);
		redirect = StudentRecord;
		request.setAttribute("users", dao.getAllStudents());
		System.out.println("Record Deleted Successfully");
		return redirect;
	}

	private String insertStudent(HttpServletRequest request, String studentId) {
		String redirect;
		int id = Integer.parseInt(studentId);
		Student user = new Student();
		user.setId(id);
		user.setfName(request.getParameter("firstName"));
		user.setlName(request.getParameter("lastName"));
		dao.addStudent(user);
		redirect = StudentRecord;
		request.setAttribute("users", dao.getAllStudents());
		System.out.println("Record Added Successfully");
		return redirect;
	}

	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}
}