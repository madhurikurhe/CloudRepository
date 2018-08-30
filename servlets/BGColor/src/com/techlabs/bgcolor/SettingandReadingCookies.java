package com.techlabs.bgcolor;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class SettingandReadingCookies
 */
@WebServlet("/SettingandReadingCookies")
public class SettingandReadingCookies extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public SettingandReadingCookies() {
		super();
	}

	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		Cookie[] cookies = null;
		cookies = request.getCookies();



		out.println("<HTML>");
	        out.println("<HEAD>");
	        out.println("<TITLE>");
	        out.println("A Web Page");
	        out.println("</TITLE>");
	        out.println("</HEAD>");
	        out.println("<BODY style='background-color:pink;'>");
		

		boolean foundCookie = false;

		if (!foundCookie) {

			Cookie c = new Cookie("color", "pink");
			c.setMaxAge(24 * 60 * 60);
			response.addCookie(c);

		}

		Cookie c = cookies[0];
		if (c.getName().equals("color")) {
			
			foundCookie = true;

		}


		
		out.println("<H1>Welcome to swabhav techlabs</H1>");
		out.println("</BODY>");
		out.println("</HTML>");
	}

	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
