package produits;

import com.marcheli.shoping.DbConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


public class ManagementProducts implements Iproduit {
    @Override
    public Produit add(Produit p) {
        Connection connection = DbConnection.getConnection();

        try
        {

            PreparedStatement st= connection.prepareStatement
                    (
                            "insert into products(" +
                                    " product_name, " +
                                    "price," +
                                    " solde," +
                                    " solde_description," +
                                    " category," +
                                    " selled, " +
                                    " quantity, " +
                                    "description, " +
                                    "image"+


                                   "  ) values " +
                                    "(?,?,?,?,?,?,?,?,?)");

//            product_name, price, solde, solde_description, category, selled, quantity, description)
            st.setString(1,p.getProduit_name());
            st.setInt(2,p.getPrice());
            st.setInt(3,p.getSolde());
            st.setString(4,p.getSolde_description());
            st.setString(5,p.getCategory());
            st.setInt(6,p.getSelled());
            st.setInt(7,p.getQuantity());
            st.setString(8,p.getDescription());
            st.setString(9,p.getImage());


            st.executeUpdate();
            st.close();




        } catch(SQLException e){
            throw new RuntimeException(e);
        }
        return null;
    }

    @Override
    public void delete(Produit p){
        Connection connection = DbConnection.getConnection();
        try
        {

            PreparedStatement st= connection.prepareStatement
                    (
                            "delete from product where product_id =(?) ");
            st.setString(1,Integer.toString( p.getProduit_id()));

            st.executeUpdate();
            st.close();

        } catch(SQLException e){
            throw new RuntimeException(e);
        }

    }

    @Override
    public Produit update(Produit p) {

        return null;
    }

    @Override
    public List<Produit> find(long id) {
        return null;
    }

    @Override
    public List<Produit> getAllProducts() {

        List<Produit> ListProduits = new ArrayList<Produit>();

        Connection connection = DbConnection.getConnection();
        try
        {

            PreparedStatement st= connection.prepareStatement
                    (
                            "select * from products ");

            ResultSet rs = st.executeQuery();

            while(rs.next()){
                ListProduits.add(new Produit(

                        rs.getInt("product_id"),
                        rs.getString("product_name"),
                        rs.getInt("price") ,
                        rs.getInt("solde"),
                        rs.getString("solde_description"),
                        rs.getString("category"),
                        rs.getInt("selled"),
                        rs.getInt("quantity"),
                        rs.getString("description"),
                        rs.getString("image")
                ));

//                int produit_id, String produit_name, int price, int solde, String solde_description, String category, int selled, int quantity, String description, String image) {
            }
            st.close();



        } catch(SQLException e){
            throw new RuntimeException(e);
        }

        return ListProduits;
    }

    @Override
    public void modifyProduct(Produit p) {

        Connection connection = DbConnection.getConnection();

        try
        {
            String sql = "UPDATE table_name " +
                    "SET product_name = ?, " +
                    "price = ?, " +
                    "solde = ?, " +
                    "solde_description = ?, " +
                    "category = ?, " +
                    "selled = ?, " +
                    "quantity = ?, " +
                    "description = ?, " +
                    "image = ? " +
                    "WHERE id = ?";
            PreparedStatement st = connection.prepareStatement(sql);


//            product_name, price, solde, solde_description, category, selled, quantity, description)
            st.setString(1,p.getProduit_name());
            st.setInt(2,p.getPrice());
            st.setInt(3,p.getSolde());
            st.setString(4,p.getSolde_description());
            st.setString(5,p.getCategory());
            st.setInt(6,p.getSelled());
            st.setInt(7,p.getQuantity());
            st.setString(8,p.getDescription());
            st.setString(9,p.getImage());


            st.executeUpdate();
            st.close();




        } catch(SQLException e){
            throw new RuntimeException(e);
        }



    }
}
