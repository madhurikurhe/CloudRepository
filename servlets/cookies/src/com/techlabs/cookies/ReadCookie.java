package com.techlabs.cookies;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Cookie")
public class ReadCookie extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
    public ReadCookie() {
        super();
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        
        out.println("<HTML>");
        out.println("<HEAD>");
        out.println("<TITLE>");
        out.println("A Web Page");
        out.println("</TITLE>");
        out.println("</HEAD>");
        out.println("<BODY");

        Cookie[] cookies = request.getCookies();
        boolean foundCookie = false;

        for(int loopIndex = 0; loopIndex < cookies.length; loopIndex++) { 
            Cookie cookie1 = cookies[loopIndex];
            if (cookie1.getName().equals("color")) {
                out.println("bgcolor = " + cookie1.getValue());
                foundCookie = true;
            }
        }  

        if (!foundCookie) {
            Cookie cookie1 = new Cookie("color", "cyan");
            cookie1.setMaxAge(24*60*60);
            response.addCookie(cookie1); 
        }

        out.println(">");
        out.println("<H1>Setting and Reading Cookies</H1>");
        out.println("This page will set its background color using a cookie when reloaded.");
        out.println("</BODY>");
        out.println("</HTML>");

	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}

}
