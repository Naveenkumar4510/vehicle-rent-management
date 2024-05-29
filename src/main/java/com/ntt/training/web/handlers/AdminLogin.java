
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
import com.ntt.training.dao.AdminDao;
import com.ntt.training.dao.DAOAppException;
import com.ntt.training.dao.LoginDAO;
import com.ntt.training.domain.User;
import com.ntt.training.domain.admin;

public class AdminLogin implements HttpRequestHandler {

	public static Logger log = Logger.getLogger(AdminLogin.class);

	public void handle(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException 
	{
		
		PrintWriter out = response.getWriter();
		
		int adminid = Integer.parseInt(request.getParameter("adminid"));
		String password = request.getParameter("password");
		
		
		int flag = -1;
		List users = null;
		AdminDao dao = new AdminDao();
		try {
			users = dao.validateAdmin(adminid);
			log.info(users);
			for (Object object : users) {

				admin user=(admin)object;
				if (user.getPassword().equals(password)) {
					flag = 0;
					break;
				}
			}
			
			
			
			log.info("Flag in login " + flag);
			if (flag == 0) {
				RequestDispatcher dispatcher = request
						.getRequestDispatcher("adminhome.jsp");
				request.setAttribute("Name", adminid);
				dispatcher.forward(request, response);

			} else {
				RequestDispatcher dispatcher = request
						.getRequestDispatcher("admlogin.jsp");
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
