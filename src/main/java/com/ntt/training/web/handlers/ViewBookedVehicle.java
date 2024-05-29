
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
import com.ntt.training.dao.BookedVehicleDao;
import com.ntt.training.dao.DAOAppException;
import com.ntt.training.dao.LoginDAO;
import com.ntt.training.dao.VehicleDao;
import com.ntt.training.domain.bookedvehicle;
import com.ntt.training.domain.vehicle;

public class ViewBookedVehicle implements HttpRequestHandler {
    public void handle(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        int id = Integer.parseInt(request.getParameter("vno"));
        BookedVehicleDao dao = new BookedVehicleDao();
        try {
            bookedvehicle vehicle = dao.viewbookedvehicle(id);
            if (vehicle != null) {
                request.setAttribute("bookedvehicle", vehicle);
                RequestDispatcher dispatcher = request.getRequestDispatcher("viewbookedvehicle.jsp");
                dispatcher.forward(request, response);
            } else {
                RequestDispatcher dispatcher = request.getRequestDispatcher("error.jsp");
                request.setAttribute("Err", "No vehicle found with ID " + id);
                dispatcher.forward(request, response);
            }
        } catch (DAOAppException e) {
            RequestDispatcher dispatcher = request.getRequestDispatcher("error.jsp");
            request.setAttribute("Err", e.getMessage());
            dispatcher.forward(request, response);
        }
    }
}
