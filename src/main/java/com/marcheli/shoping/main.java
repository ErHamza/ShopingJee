package com.marcheli.shoping;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import produits.ManagementProducts;
import produits.Produit;

import java.io.IOException;
import java.util.List;

public class main extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        ManagementProducts manageProduit = new ManagementProducts();

        List<Produit> products ;

        products = manageProduit.getAllProducts();
        request.setAttribute("products", products);


        request.getRequestDispatcher("index.jsp").forward(request, response);


    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
