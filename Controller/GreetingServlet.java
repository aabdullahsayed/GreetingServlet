package Controller;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import java.io.IOException;
import Model.User;
public class GreetingServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

     
        String name = request.getParameter("name");

        
        User user = new User(name);


        request.setAttribute("greeting", user.getGreeting());

  
        RequestDispatcher dispatcher = request.getRequestDispatcher("greeting.jsp");
        dispatcher.forward(request, response);
    }
}
