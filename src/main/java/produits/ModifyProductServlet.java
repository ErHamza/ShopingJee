package produits;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;

@WebServlet(name = "ModifyProductServlet", value = "/ModifyProductServlet")
public class ModifyProductServlet extends HttpServlet {


    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    ManagementProducts modifyProduct = new ManagementProducts();
        String productName = request.getParameter("product_name");
        float price = Float.parseFloat(request.getParameter("price"));
        float solde = Float.parseFloat(request.getParameter("solde"));
        String soldeDescription = request.getParameter("solde_description");
        String category = request.getParameter("category");
        int selled = Integer.parseInt(request.getParameter("selled"));
        int quantity = Integer.parseInt(request.getParameter("quantity"));
        String description = request.getParameter("description");
        String image = request.getParameter("image");
        int targetId = Integer.parseInt(request.getParameter("target_id"));

        modifyProduct.modifyProduct(new Produit());


    }
}
