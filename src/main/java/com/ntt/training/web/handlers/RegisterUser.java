package com.ntt.training.web.handlers;

import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.log4j.Logger;

import com.ntt.mvc.HttpRequestHandler;
import com.ntt.training.dao.DAOAppException;
import com.ntt.training.dao.RegisterDAO;
import com.ntt.training.domain.User;

public class RegisterUser implements HttpRequestHandler 
{
	
	static Logger log = Logger.getLogger(RegisterUser.class);

	@Override
	public void handle(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException {

		RegisterDAO dao = new RegisterDAO();
		User user = new User();
		
		
//		user.setPortalID(Integer.parseInt(request.getParameter("portal_id")));
//		user.setName(request.getParameter("name"));
//		user.setEmployeeId(Integer.parseInt(request.getParameter("emp_id")));
//		user.setTechnology(request.getParameter("tech"));

		user.setUserid(Integer.parseInt(request.getParameter("userid")));
        user.setUsername(request.getParameter("username"));
        user.setCity(request.getParameter("city"));
        user.setEmail(request.getParameter("email"));
        user.setContactno(Integer.parseInt(request.getParameter("contactno")));
        
//        user.setStpassword(request.getParameter("stpassword"));
		
		boolean isExists;
		try {
			isExists = dao.validateUser(user.getUserid()); // is this user already existed ? / not 

			if (isExists) {
				log.info("User already registered");
				RequestDispatcher dispatcher = request.getRequestDispatcher("..\\pages\\Register.jsp");
				request.setAttribute("Err",	"User already registered with the system");
				dispatcher.forward(request, response);
			} 
			
			else 
			{
				
				user.setPassword("NttData@"+ Integer.toString(user.getUserid()));
//				setPassword("NttData@"+ Integer.toString(user.getStuid());
				int finalRes = dao.registerUser(user);
				
				if (finalRes > 0) {
					RequestDispatcher dispatcher = request.getRequestDispatcher("..\\pages\\success.jsp");
					request.setAttribute("success","User succesfully registered with the system");
					request.setAttribute("details", user);
					dispatcher.forward(request, response);
					
				}
			}
		} catch (DAOAppException e) {
			RequestDispatcher dispatcher = request
					.getRequestDispatcher("error.jsp");
			request.setAttribute("Err", e.getMessage());
			dispatcher.forward(request, response);
		}
	}

}
