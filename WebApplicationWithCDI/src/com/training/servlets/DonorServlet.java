package com.training.servlets;

import com.training.cdi.DonorManager;

import javax.enterprise.inject.Any;
import javax.inject.Inject;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = "/DonorServlet")
public class DonorServlet extends HttpServlet {

    @Inject
    private DonorManager manager;


    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String[] list = manager.getAllDonors();
        request.setAttribute("list",list);
        RequestDispatcher dispatcher = request.getRequestDispatcher("/showAll");
        dispatcher.forward(request, response);

    }
}
