package com.xworkz.userapp.servlet;

import com.xworkz.userapp.dto.UserDto;
import com.xworkz.userapp.service.UserService;
import com.xworkz.userapp.service.UserServiceImpl;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = "/getUser" ,loadOnStartup = +89)
public class GetUserServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

           String id =   req.getParameter("id");

           UserService service = new UserServiceImpl();
         UserDto dto =  service.getUserById(Integer.parseInt(id));

         // added dto object into the request scope
         req.setAttribute("user",dto);

        RequestDispatcher requestDispatcher = req.getRequestDispatcher("getuser.jsp");
        requestDispatcher.forward(req,  resp);





    }
}
