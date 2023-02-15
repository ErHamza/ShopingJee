package produits;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name = "CartServlet", value = "/CartServlet")
public class CartServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
            request.getRequestDispatcher("cart.jsp").forward(request,response);
    }


    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        List<Cart> orders = new ArrayList<Cart>();
        Produit p = (Produit) request.getAttribute("product");
        int number_items = Integer.parseInt(request.getParameter("number"));
        orders.add(new Cart(p.getProduit_name() , p.getPrice() , number_items));
        request.setAttribute("items", orders.size());
        RequestDispatcher rd = request.getRequestDispatcher("CartServlet");
        rd.forward(request, response);



    }
}
