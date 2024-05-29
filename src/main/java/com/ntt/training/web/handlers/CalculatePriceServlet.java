package com.ntt.training.web.handlers;

import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ntt.mvc.HttpRequestHandler;

public class CalculatePriceServlet implements HttpRequestHandler {
    public void handle(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String number1 = request.getParameter("no1");
        String number2 = request.getParameter("no2");
        double no1 = Double.parseDouble(number1);
        double no2 = Double.parseDouble(number2);
        double d = no1 - no2;
        String result = String.valueOf(d);
        request.setAttribute("result", result);
        RequestDispatcher rd = request.getRequestDispatcher("calculateprice.jsp");
        rd.forward(request, response);
    }
}
