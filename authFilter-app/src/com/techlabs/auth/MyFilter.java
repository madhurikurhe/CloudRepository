package com.techlabs.auth;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;

@WebFilter("/MyFilter")
public class MyFilter implements Filter {

	public MyFilter() {
	}

	public void init(FilterConfig fConfig) throws ServletException {
	}

	public void doFilter(ServletRequest request, ServletResponse response,
			FilterChain chain) throws IOException, ServletException {
		PrintWriter out = response.getWriter();

		String password = request.getParameter("password");
		if (password.equals("admin")) {
			chain.doFilter(request, response);
		} else {
			out.print("username or password wrong");
			RequestDispatcher requestDispatcher = request.getRequestDispatcher("index.html");
			requestDispatcher.include(request, response);
		}
	}


	public void destroy() {
	}

}
