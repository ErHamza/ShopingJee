package com.authenification;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.*;
import utilisatuer.User;
import utilisatuer.ManagementUser;

import java.io.IOException;


public class RegistartionServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {


//        Cookie[] cookies = request.getCookies();
//        if (cookies != null) {
//            for (Cookie cookie : cookies) {
//                if (cookie.getName().equals("prenom")) {
//                    request.setAttribute("prenom", cookie.getValue());
//                }
//            }
//        }
//        this.getServletContext().getRequestDispatcher("signup.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String empty ="";
        ManagementUser manage = new ManagementUser();
        String email = request.getParameter("email");
        String password = request.getParameter("password");
        RegistrationClass registration = new RegistrationClass();
        User c = registration.fetchUserName(email, password);
        if (c.getEmail().equals(empty)){
            request.setAttribute("message","wrong Password");
            request.getRequestDispatcher("authentification.jsp").forward(request ,response);
        }

        else {
            if (request.getParameter("message")!=null){
                request.removeAttribute("message");
            }
            request.setAttribute("user", c);
            HttpSession session = request.getSession();
            session.setAttribute("name", c.getName());
            session.setAttribute("email", c.getEmail());
            session.setAttribute("id" ,c.getClient_id() );
            session.setAttribute("adress", c.getAdress() );
            session.setAttribute("phone_number", c.getPhone_number() );

            if (c.getRole().equals("admin")) {
                request.getRequestDispatcher("admin.jsp").forward(request, response);
            }
            else {
                response.sendRedirect("home");
            }
        }



    }


}
