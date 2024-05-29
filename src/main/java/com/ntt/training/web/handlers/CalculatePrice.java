package com.ntt.training.web.handlers;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.RequestDispatcher;

import com.ntt.mvc.HttpRequestHandler;
import com.ntt.training.dao.CalculatepriceDao;
import com.ntt.training.dao.DAOAppException;
import com.ntt.training.domain.calculateprice;

public class CalculatePrice implements HttpRequestHandler {
    public void handle(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        int vid = Integer.parseInt(request.getParameter("vid"));
        int price = Integer.parseInt(request.getParameter("price"));
        int discountPrice = Integer.parseInt(request.getParameter("discountPrice"));
        int days = Integer.parseInt(request.getParameter("days"));

        CalculatepriceDao dao = new CalculatepriceDao();
        try {
            calculateprice cp = new calculateprice(vid, price, discountPrice, days);
            int res = dao.insertPrice(cp);
            if (res > 0) {
            	 double totalPrice = dao.calculateTotalPrice(cp);
            	 cp.setTotalPrice(totalPrice);
                request.setAttribute("calculatePrice", cp);
                RequestDispatcher dispatcher = request.getRequestDispatcher("calculateprice.jsp");
                dispatcher.forward(request, response);
            } else {
                RequestDispatcher dispatcher = request.getRequestDispatcher("error.jsp");
                request.setAttribute("errorMsg", "Failed to calculate price.");
                dispatcher.forward(request, response);
            }
        } catch (DAOAppException e) {
            RequestDispatcher dispatcher = request.getRequestDispatcher("error.jsp");
            request.setAttribute("errorMsg", e.getMessage());
            dispatcher.forward(request, response);
        }
    }
}
