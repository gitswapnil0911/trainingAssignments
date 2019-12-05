package com.training.myapp.controller;

import com.training.myapp.model.Customer;

import java.io.IOException;
import java.io.PrintWriter;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

@javax.servlet.annotation.WebServlet("/hello")
public class HelloWorldController extends javax.servlet.http.HttpServlet {
    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {

    }

    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
    response.setContentType("text/html");

        PrintWriter out = response.getWriter();
        out.println("<h1>Hello From Servlet</h1>");

        request.setAttribute("name","john");
        request.setAttribute("age",32);

        //Customer customer = new Customer(101,"John Doe","john@gmail.com",9833539741L);


        //request.getRequestDispatcher("data.jsp").forward(request,response);

        List<Customer> customer = Arrays.asList(
          new Customer(101,"John Doe","john@gmail.com",9833539741L),
                new Customer(102,"Jane Doe","jane@gmail.com",9833539741L),
                new Customer(103,"Alex Brownun","john@gmail.com",9833539741L),
                new Customer(104,"Jason Taylor","john@gmail.com",9833539741L)
        );
        request.setAttribute("customer",customer);
        request.getRequestDispatcher("jstl.jsp").forward(request,response);
        out.close();
    }
}
