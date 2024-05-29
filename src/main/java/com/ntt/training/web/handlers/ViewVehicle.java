
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
import com.ntt.training.dao.VehicleDao;
import com.ntt.training.domain.vehicle;

public class ViewVehicle implements HttpRequestHandler {
    public void handle(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        int vno = Integer.parseInt(request.getParameter("vno"));
        VehicleDao dao = new  VehicleDao();
        try {
            vehicle vehicle = dao.viewvehicle(vno);
            if (vehicle != null) {
                request.setAttribute("vehicle", vehicle);
                RequestDispatcher dispatcher = request.getRequestDispatcher("viewvehicle.jsp");
                dispatcher.forward(request, response);
            } else {
                RequestDispatcher dispatcher = request.getRequestDispatcher("error.jsp");
                request.setAttribute("Err", "No vehicle found with ID " + vno);
                dispatcher.forward(request, response);
            }
        } catch (DAOAppException e) {
            RequestDispatcher dispatcher = request.getRequestDispatcher("error.jsp");
            request.setAttribute("Err", e.getMessage());
            dispatcher.forward(request, response);
        }
    }
}
