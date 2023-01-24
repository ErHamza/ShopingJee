package com.marcheli.shoping;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import user.Client;
import user.ManagementUser;

import java.io.IOException;

public class main extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        ManagementUser manage = new ManagementUser();

//        Client hamza = new Client("hamza","12334","email@sj",
//                "072737","ksk","jd");
//        manage.signUp(hamza);
        Client c = manage.signUp(new Client("hamza","12334","email@sj",
                "072737","ksk","jd"));
        System.out.println("ok");
        request.getRequestDispatcher("index.jsp").forward(request, response);


    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
