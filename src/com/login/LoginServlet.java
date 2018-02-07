package com.login;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("text/html");
		PrintWriter out = response.getWriter();

		// get parameters from request object.
		String userName = request.getParameter("userName").trim();
		String password = request.getParameter("password").trim();

		// check for null and empty values.
		if (userName == null || userName.equals("") || password == null || password.equals("")) {
			out.print("<h3><center>Please enter both Username and Password. </center></h3><br/>");
			RequestDispatcher requestDispatcher = request.getRequestDispatcher("/index.html");
			requestDispatcher.include(request, response);
			
		} // Check for valid username and password.
		else if (userName.equals("nisharth") && password.equals("nisharth")) {
			response.sendRedirect("WelcomeServlet");
		} else {
			out.print("<br><center><font size=+2>Wrong username or password. </font></center><br/><br/>");
			RequestDispatcher requestDispatcher = request.getRequestDispatcher("/index.html");
			requestDispatcher.include(request, response);
		}
	}

}
