package com.marcheli.shoping;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

public class main extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//        ManagementUser manage = new ManagementUser();
//
////        Client hamza = new Client("hamza","12334","email@sj",
////                "072737","ksk","jd");
////        manage.signUp(hamza);
//        Client c = manage.signUp(new Client("hamza","1233334","emasssaaaaaa",
//                "07222737","ks44k","j22d"));



        request.getRequestDispatcher("index.jsp").forward(request, response);


    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
