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
import java.util.List;

@WebServlet(urlPatterns = "/getAllUser" ,loadOnStartup = +89)
public class GetAllUserServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {



           UserService service = new UserServiceImpl();
         List<UserDto> dtos =  service.getAllUsers();

         // added dto object into the request scope
         req.setAttribute("listOfUsers",dtos);

        RequestDispatcher requestDispatcher = req.getRequestDispatcher("getalluser.jsp");
        requestDispatcher.forward(req,  resp);





    }
}
