package com.crud.app.controller;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.crud.app.dao.StudentDAO;
import com.crud.app.dao.StudentDAOImpl;
import com.crud.app.model.Student;

public class StudentController extends HttpServlet{
 
 
 private static String INSERT_OR_EDIT = "/student.jsp";
 private static String LIST_EMPLOYEE = "/liststudent.jsp";
 
 String forward;
 
 StudentDAO studentDAO;
 
 public StudentController(){
 
 super();
 
 studentDAO = new StudentDAOImpl();
 }
 
 protected void doGet(HttpServletRequest request , HttpServletResponse response)throws IOException , ServletException
 {
 
 String action=request.getParameter("action");
 
 
 if(action.equals("list")){
 
 forward = LIST_EMPLOYEE;
 
 List<Student> list = studentDAO.getAllStudents(); 
 request.setAttribute("employees", list);
 
 }
 else if(action.equals("edit")){
 
 forward = INSERT_OR_EDIT;
 
 String id = request.getParameter("empId");
 
 Student student = studentDAO.getStudentById(Long.parseLong(id));
 
 request.setAttribute("employee", student);
 
 }
 else if(action.equals("delete")){
 
 forward = INSERT_OR_EDIT;
 
 String id = request.getParameter("empId");
 
 Student student = new Student();
 student.setEmployeeId(Long.parseLong(id));
 
 studentDAO.deleteStudent(student);
 
 }
 else { 
 forward = INSERT_OR_EDIT;
 }
 
 RequestDispatcher view = request.getRequestDispatcher(forward);
 view.forward(request, response);
 
 }
 
 protected void doPost(HttpServletRequest request , HttpServletResponse response)throws IOException , ServletException
 {
 
 Student student = new Student();
 
 String id = request.getParameter("id");
 
 
 student.setStudentName(request.getParameter("name"));
 student.setEmail(request.getParameter("email"));
 student.setAge(Integer.parseInt(request.getParameter("age")));
 student.setAddress(request.getParameter("address"));
 student.setSalary(Double.parseDouble(request.getParameter("salary")));
 try {
	 student.setJoinDate(new SimpleDateFormat("MM/dd/yyyy").parse(request.getParameter("doj")));
 } catch (ParseException e) {
 e.printStackTrace();
 }
 
 if(id==null || id.isEmpty()){
 
 
 studentDAO.addStudent(student);
 
 }
 else{
 
	 student.setEmployeeId(Long.parseLong(id));
 studentDAO.updateStudent(student);
 
 }
 
 RequestDispatcher view = request.getRequestDispatcher("listStudent.jsp");
 List<Student> list = studentDAO.getAllStudents(); 
 request.setAttribute("employees", list);
 view.forward(request, response);
 
 }

}