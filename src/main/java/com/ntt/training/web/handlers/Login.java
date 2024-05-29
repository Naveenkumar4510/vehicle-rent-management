package com.ntt.training.web.handlers;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;

import com.ntt.mvc.HttpRequestHandler;
import com.ntt.training.dao.DAOAppException;
import com.ntt.training.dao.LoginDAO;
import com.ntt.training.domain.User;

public class Login implements HttpRequestHandler {

	public static Logger log = Logger.getLogger(Login.class);

	public void handle(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException 
	{
		
		PrintWriter out = response.getWriter();
		
		int userid = Integer.parseInt(request.getParameter("userid"));
		String password = request.getParameter("password");
		
		
		int flag = -1;
		List users = null;
		LoginDAO dao = new LoginDAO();
		try {
			users = dao.validateUser(userid);
			log.info(users);
			for (Object object : users) {

				User user=(User)object;
				if (user.getPassword().equals(password)) {
					flag = 0;
					break;
				}
			}
			
			
			
			log.info("Flag in login " + flag);
			if (flag == 0) {
				RequestDispatcher dispatcher = request
						.getRequestDispatcher("home.jsp");
				request.setAttribute("Name", userid);
				dispatcher.forward(request, response);

			} else {
				RequestDispatcher dispatcher = request
						.getRequestDispatcher("Login.jsp");
				request.setAttribute("Err",
						"username are password is incorrect");
				dispatcher.forward(request, response);
			}

		} catch (DAOAppException e) {
			RequestDispatcher dispatcher = request
					.getRequestDispatcher("error.jsp");
			request.setAttribute("Err", e.getMessage());
			dispatcher.forward(request, response);

		}

	}
}
