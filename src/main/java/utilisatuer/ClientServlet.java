package utilisatuer;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import java.io.IOException;

public class ClientServlet extends HttpServlet {
    ManagementUser manage;
    @Override
    public void init() throws ServletException{
        manage = new ManagementUser();

    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        request.getRequestDispatcher("authentification.jsp").forward(request , response);


    }


    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

         String name= request.getParameter("name");
         String password =request.getParameter("password");
         String email =  request.getParameter("email");
         String phone_number= request.getParameter("phone_number");
         String adress = request.getParameter("adress");
//       String location= request.getParameter("location");
        //this location should be null in db
        String location = "here";
        String role = "utilisatuer";

         manage.signUp(new User(name,password, email, phone_number,adress,location, role
        ));

        request.getRequestDispatcher("signed.jsp").forward(request, response);
    }
}
