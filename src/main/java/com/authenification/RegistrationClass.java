package com.authenification;

import com.marcheli.shoping.DbConnection;
import utilisatuer.User;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class RegistrationClass {

    public User fetchUserName(String givenEmail , String password) {

        User Rs = new User();
        Connection connection = DbConnection.getConnection();
        try {

            PreparedStatement ps = connection.prepareStatement
                    (
                            "select * from `client` where email=(?)");
            ps.setString(1, givenEmail );

            ResultSet rs= ps.executeQuery();
            if (rs.next()){
//                 Rs= new Client(
//                rs.getString("client_name"),
//                rs.getInt("client_id"),
//                rs.getString("email"),
//                rs.getString("phone_number")
//                ,
//                rs.getString("adress"),
//                rs.getString("location")
//                    );
                Rs.setName(rs.getString("client_name"));
                Rs.setAdress(rs.getString("adresss"));
                Rs.setLocation(rs.getString("location"));
                Rs.setPhone_number(rs.getString("phone_number"));
                Rs.setPassword(rs.getString("password"));
                Rs.setClient_id(rs.getInt("client_id"));
                Rs.setEmail(rs.getString("email"));
                Rs.setRole(rs.getString("role"));









            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        if (password.equals(Rs.getPassword()) ){
            return Rs;

        }
        else{
            User c = new User();
            c.setEmail("");
            return c;
        }

    }


}
