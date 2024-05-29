

package com.ntt.training.web.handlers;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.log4j.Logger;

import com.ntt.mvc.HttpRequestHandler;
import com.ntt.training.dao.DAOAppException;
import com.ntt.training.dao.RegisterDAO;
import com.ntt.training.dao.VehicleDao;
import com.ntt.training.domain.User;
import com.ntt.training.domain.vehicle;

public class AddVehicle implements HttpRequestHandler 
{
	
	static Logger log = Logger.getLogger(AddVehicle.class);

	@Override
	public void handle(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException {

		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		
		VehicleDao dao = new VehicleDao();
		vehicle vh = new vehicle();
		
		
//		user.setPortalID(Integer.parseInt(request.getParameter("portal_id")));
//		user.setName(request.getParameter("name"));
//		user.setEmployeeId(Integer.parseInt(request.getParameter("emp_id")));
//		user.setTechnology(request.getParameter("tech"));

		vh.setVno(Integer.parseInt(request.getParameter("vno")));
        vh.setVname(request.getParameter("vname"));
        vh.setVtype(request.getParameter("vtype"));
        vh.setVprice(Integer.parseInt(request.getParameter("vprice")));
             
//        user.setStpassword(request.getParameter("stpassword"));
		
	/*	boolean isExists;
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
		*/
        int finalresult;
        try {
            finalresult = dao.insertVehicle(vh);
            if (finalresult > 0) {
                out.println("<html>");
                out.println("<head>");
                out.println("<title>Vehicle Inserted Successfully</title>");
                out.println("<style>");
                out.println("body {");
                out.println("    font-family: Arial, sans-serif;");
                out.println("    background-color: #f2f2f2;");
                out.println("    margin: 0;");
                out.println("    padding: 20px;");
                out.println("}");

                out.println("h1 {");
                out.println("    color: #333;");
                out.println("    font-size: 28px;");
                out.println("}");

                out.println(".success-message {");
                out.println("    font-size: 24px;");
                out.println("    color: green;");
                out.println("    margin-top: 20px;");
                out.println("}");

                out.println(".btn-container {");
                out.println("    margin-top: 20px;");
                out.println("}");

                out.println(".btn {");
                out.println("    display: inline-block;");
                out.println("    font-size: 18px;");
                out.println("    text-decoration: none;");
                out.println("    padding: 10px 20px;");
                out.println("    background-color: #007bff;");
                out.println("    color: #fff;");
                out.println("    border-radius: 5px;");
                out.println("    margin-right: 10px;");
                out.println("}");

                out.println(".btn:hover {");
                out.println("    background-color: #0056b3;");
                out.println("}");
                out.println("</style>");
                out.println("</head>");
                out.println("<body>");
                out.println("<h1>Vehicle Inserted Successfully</h1>");
                out.println("<div class=\"success-message\">Vehicle Inserted Successfully!</div>");
                out.println("<div class=\"btn-container\">");
                out.println("<a href=\"adminhome.jsp\" class=\"btn\">Home Page</a>");
                out.println("<a href=\"index.jsp\" class=\"btn\">Logout</a>");
                out.println("</div>");
                out.println("</body>");
                out.println("</html>");
            }
        }

        catch(DAOAppException e)
        {
        	e.printStackTrace();
        }
	}

}
