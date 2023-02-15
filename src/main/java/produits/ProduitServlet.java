package produits;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.MultipartConfig;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.Part;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

@WebServlet(name = "ProduitServlet", value = "/addProduit")
@MultipartConfig(
        fileSizeThreshold = 1024 * 1024 * 1, // 1 MB
        maxFileSize = 1024 * 1024 * 10,      // 10 MB
        maxRequestSize = 1024 * 1024 * 100   // 100 MB
)

public class ProduitServlet extends HttpServlet {


    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//        product_name description price  quantity  solde  solde_description product_id selled category

        ManagementProducts manage = new ManagementProducts();
        String product_name = request.getParameter("product_name");
        int price = Integer.parseInt(request.getParameter("price"));
        int solde = Integer.parseInt(request.getParameter("solde"));
        String solde_description = request.getParameter("solde_description");
        String category = request.getParameter("category");
        int selled = Integer.parseInt(request.getParameter("selled"));
        int quantity = Integer.parseInt(request.getParameter("quantity"));
        String description = request.getParameter("description");

        Part part = request.getPart("image");
//        String directoryPath = getServletContext().getRealPath("/assets");
//
//        String fileName = filePart.getSubmittedFileName();
//        for (Part part : request.getParts()) {
//            part.write(directoryPath + fileName);
//        }
//        response.getWriter().print("The file uploaded sucessfully.");
        String path = request.getRealPath("images") + File.separator + "produits" + File.separator + part.getSubmittedFileName();

        System.out.println(path);

        try {
            FileOutputStream fos = new FileOutputStream(path);
            InputStream is = part.getInputStream();
            // reading data
            byte[] data = new byte[is.available()];
            is.read(data);

            //writing data
            fos.write(data);
            fos.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

            // Save the image to the file server
            manage.add(new Produit(
                    product_name, price, solde,
                    solde_description, category, selled, quantity, description, part.getSubmittedFileName())
            );

            request.getRequestDispatcher("admin.jsp").forward(request, response);

        }
    }

