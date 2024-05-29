
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
import com.ntt.training.dao.DiscountDao;
import com.ntt.training.dao.LoginDAO;
import com.ntt.training.dao.VehicleDao;
import com.ntt.training.domain.discount;
import com.ntt.training.domain.vehicle;

public class ViewDiscount implements HttpRequestHandler {
    public void handle(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        int vno = Integer.parseInt(request.getParameter("price"));
        DiscountDao dao = new  DiscountDao();
        try {
            discount dis = dao.viewdiscount(vno);
            if (dis != null) {
                request.setAttribute("discount", dis);
                RequestDispatcher dispatcher = request.getRequestDispatcher("viewdiscount.jsp");
                dispatcher.forward(request, response);
            } else {
                RequestDispatcher dispatcher = request.getRequestDispatcher("error.jsp");
                request.setAttribute("Err", "No  Discount value found with ID " + vno);
                dispatcher.forward(request, response);
            }
        } catch (DAOAppException e) {
            RequestDispatcher dispatcher = request.getRequestDispatcher("error.jsp");
            request.setAttribute("Err", e.getMessage());
            dispatcher.forward(request, response);
        }
    }
}
