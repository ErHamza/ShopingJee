package utilisatuer;

import com.marcheli.shoping.DbConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

public class ManagementUser implements InterfaceUser {

//    SecureRandom randome = new SecureRandom();
//    byte[] salt = new byte[16];


    @Override
    public User signUp(User c) {
        Connection connection = DbConnection.getConnection();
        try{
            PreparedStatement ps = connection.prepareStatement

                    ("INSERT INTO client(client_name" +
                            ",email ,phone_number ,password ," +
                            "adresss ,location, role) values(?,?,?,?,?,?,?)");

            ps.setString(1,c.getName());
            ps.setString(2,c.getEmail());
            ps.setString(3,c.getPhone_number());
            ps.setString(4,c.getPassword());
            ps.setString(5,c.getAdress());
            ps.setString(6,c.getLocation());
            ps.setString(7,c.getRole());


            ps.executeUpdate();
            ps.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        return null;
    }

    public List<User> getAllUsers(){


        Connection connection = DbConnection.getConnection();
        try{
            PreparedStatement ps = connection.prepareStatement

                    ("select * from client where role <> 'admin'");




            ps.executeUpdate();
            ps.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }




        return null;

    }







    @Override
    public void modify(User c) {

    }


}
