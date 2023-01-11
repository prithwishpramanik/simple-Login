package org.login.simplelogin;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.login.simplelogin.service.LoginService;

/**
 * Servlet implementation class LoginSevlet
 */
@WebServlet("/Login")
public class LoginSevlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String userid,password;
		userid=request.getParameter("Userid");
		password=request.getParameter("password");
		LoginService loginservice = new LoginService();
		boolean result=loginservice.auth(userid, password);
		if (result) {
			response.sendRedirect("sucess.jsp");
			return;
		}
		else {
			response.sendRedirect("login.jsp");
			return;
		}
		
	}

}
