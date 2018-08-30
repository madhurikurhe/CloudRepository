package com.techlabs.session;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/Session")
public class Session extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public Session() {
        super();
    }

	
	@SuppressWarnings("deprecation")
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		HttpSession session = request.getSession(true);
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		Integer count = new Integer(0);
		String head;
		if (session.isNew()) {
			head = "Session Started";
			
			RequestDispatcher dispatcher = request.getRequestDispatcher("/WebContent/session.jsp");
			dispatcher.forward(request, response);
		} else {
			head = "Session is already started";
			Integer oldcount =(Integer)session.getValue("count"); 
			if (oldcount != null) {
				count = new Integer(oldcount.intValue() + 1);
				
				RequestDispatcher dispatcher = request.getRequestDispatcher("/WebContent/session.jsp");
				dispatcher.forward(request, response);
			}
		}
		
	

	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}

}
