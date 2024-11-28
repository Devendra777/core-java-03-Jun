package com.xworkz.userapp.servlet;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletRequestWrapper;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;

@WebServlet(urlPatterns = {"/user"} , loadOnStartup = -12)
public class UserServlet extends HttpServlet {
     public UserServlet(){
         System.out.println("UserServlet Object is created");
     }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
          // processing logic

         String value =     req.getParameter("fName");


        // request scope
        // req , context , session
       //  req.setAttribute("key",value);



        // Servlet Chaining
        RequestDispatcher  requestDispatcher = req.getRequestDispatcher("response.jsp");
        requestDispatcher.forward(req,resp);

    }

}
