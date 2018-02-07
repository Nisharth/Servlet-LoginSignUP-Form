package com.login;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SignUpServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("text/html");
		PrintWriter out = response.getWriter();

		// get parameters from request object.
		String userName = request.getParameter("usernamesignup").trim();
		String email = request.getParameter("emailsignup").trim();
		String password = request.getParameter("passwordsignup").trim();
		String passconfirm = request.getParameter("passwordsignup_confirm").trim();

		// check for null and empty values.
		if (userName == null || email.equals("") || userName.equals("") || password == null || password.equals("")
				|| passconfirm == null || passconfirm.equals("")) {
			out.print("<h3><center>Please fill all details. </center></h3><br/>");
			RequestDispatcher requestDispatcher = request.getRequestDispatcher("/index.html");
			requestDispatcher.include(request, response);

		} // Check for valid username and password.
		else {
			response.sendRedirect("/WelcomeSignUpServlet");
		}
	}
}