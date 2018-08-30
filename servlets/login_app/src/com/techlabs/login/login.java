package com.techlabs.login;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/login")
public class login extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
    public login() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter printWriter=response.getWriter();
		response.setContentType("text/html");

		String user=request.getParameter("userName");
		String pass=request.getParameter("userPassword");

		if(user.equals("madhu")&&pass.equals("madhu")) 
                 printWriter.println("Login Success...!"); 
                else
                 printWriter.println("Login Failed...!");
		 printWriter.close();
	}

}
