package user;

import com.marcheli.shoping.DbConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ManagementUser implements InterfaceUser {


    @Override
    public Client signUp(Client c) {
        Connection connection = DbConnection.getConnection();
        try{
            PreparedStatement ps = connection.prepareStatement

                    ("INSERT INTO client(client_name" +
                            ",email ,phone_number ,password ," +
                            "adresss ,location) values(?,?,?,?,?,?)");

            ps.setString(1,c.getName());
            ps.setString(2,c.getEmail());
            ps.setString(3,c.getPhone_number());
            ps.setString(4,c.getPassword());
            ps.setString(5,c.getAdress());
            ps.setString(6,c.getLocation());

            ps.executeUpdate();
            ps.close();






        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        return null;
    }

    @Override
    public void modify(Client c) {

    }
}
