package com.login;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class WelcomeSignUpServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("text/html");
		PrintWriter out = response.getWriter();

		out.println("<!DOCTYPE html>\r\n"
				+ "<!--[if lt IE 7 ]> <html lang=\"en\" class=\"no-js ie6 lt8\"> <![endif]-->\r\n"
				+ "<!--[if IE 7 ]>    <html lang=\"en\" class=\"no-js ie7 lt8\"> <![endif]-->\r\n"
				+ "<!--[if IE 8 ]>    <html lang=\"en\" class=\"no-js ie8 lt8\"> <![endif]-->\r\n"
				+ "<!--[if IE 9 ]>    <html lang=\"en\" class=\"no-js ie9\"> <![endif]-->\r\n"
				+ "<!--[if (gt IE 9)|!(IE)]><!--> <html lang=\"en\" class=\"no-js\"> <!--<![endif]-->\r\n"
				+ "    <head>\r\n" + "        <meta charset=\"UTF-8\" />\r\n"
				+ "        <!-- <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge,chrome=1\">  -->\r\n"
				+ "        <title>Welcome to Service Z</title>\r\n"
				+ "        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\"> \r\n"
				+ "        <meta name=\"description\" content=\"Login and Registration Form with HTML5 and CSS3\" />\r\n"
				+ "        <link rel=\"shortcut icon\" href=\"../favicon.ico\"> \r\n"
				+ "        <link rel=\"stylesheet\" type=\"text/css\" href=\"css/demo.css\" />\r\n"
				+ "        <link rel=\"stylesheet\" type=\"text/css\" href=\"css/style.css\" />\r\n"
				+ "		<link rel=\"stylesheet\" type=\"text/css\" href=\"css/animate-custom.css\" />\r\n"
				+ "    </head>\r\n" + "    <body>\r\n" + "        <div class=\"container\">\r\n" + "            \r\n"
				+ "            <header>\r\n" + "                <h1>Welcome to Service Z</h1>\r\n"
				+ "            </header>\r\n" + "            <section>				\r\n"
				+ "                <div id=\"container_demo\" >\r\n"
				+ "                    <!-- hidden anchor to stop jump http://www.css3create.com/Astuce-Empecher-le-scroll-avec-l-utilisation-de-target#wrap4  -->\r\n"
				+ "                    <a class=\"hiddenanchor\" id=\"toregister\"></a>\r\n"
				+ "                    <a class=\"hiddenanchor\" id=\"tologin\"></a>\r\n"
				+ "                    <div id=\"wrapper\">\r\n"
				+ "                        <div id=\"login\" class=\"animate form\">\r\n"
				+ "                        <p class=\"login button\"> \r\n"
				+ "                                    <center><br><br>Welcome User, You have Successfully Signed Up on Service Z!</center> "
				+ "								</p>" + "</div>\r\n" + "\r\n"
				+ "                        <div id=\"register\" class=\"animate form\">\r\n"
				+ "                            <form  action=\"mysuperscript.php\" autocomplete=\"on\"> \r\n"
				+ "                                <h1> Sign up </h1> \r\n" + "                                <p> \r\n"
				+ "                                    <label for=\"usernamesignup\" class=\"uname\" data-icon=\"u\">Your username</label>\r\n"
				+ "                                    <input id=\"usernamesignup\" name=\"usernamesignup\" required=\"required\" type=\"text\" placeholder=\"mysuperusername690\" />\r\n"
				+ "                                </p>\r\n" + "                                <p> \r\n"
				+ "                                    <label for=\"emailsignup\" class=\"youmail\" data-icon=\"e\" > Your email</label>\r\n"
				+ "                                    <input id=\"emailsignup\" name=\"emailsignup\" required=\"required\" type=\"email\" placeholder=\"mysupermail@mail.com\"/> \r\n"
				+ "                                </p>\r\n" + "                                <p> \r\n"
				+ "                                    <label for=\"passwordsignup\" class=\"youpasswd\" data-icon=\"p\">Your password </label>\r\n"
				+ "                                    <input id=\"passwordsignup\" name=\"passwordsignup\" required=\"required\" type=\"password\" placeholder=\"eg. X8df!90EO\"/>\r\n"
				+ "                                </p>\r\n" + "                                <p> \r\n"
				+ "                                    <label for=\"passwordsignup_confirm\" class=\"youpasswd\" data-icon=\"p\">Please confirm your password </label>\r\n"
				+ "                                    <input id=\"passwordsignup_confirm\" name=\"passwordsignup_confirm\" required=\"required\" type=\"password\" placeholder=\"eg. X8df!90EO\"/>\r\n"
				+ "                                </p>\r\n"
				+ "                                <p class=\"signin button\"> \r\n"
				+ "									<input type=\"submit\" value=\"Sign up\"/> \r\n"
				+ "								</p>\r\n"
				+ "                                <p class=\"change_link\">  \r\n"
				+ "									Already a member ?\r\n"
				+ "									<a href=\"#tologin\" class=\"to_register\"> Go and log in </a>\r\n"
				+ "								</p>\r\n" + "                            </form>\r\n"
				+ "                        </div>\r\n" + "						\r\n" + "                    </div>\r\n"
				+ "                </div>  \r\n" + "            </section>\r\n" + "        </div>\r\n"
				+ "    </body>\r\n" + "</html>");
	}
}
