package dao;

import com.marcheli.shoping.Produit;

import java.util.List;

public interface Iproduit {
    public Produit add(Produit p);
    public void delete(Produit p);
    public Produit update (Produit p);
    public List<Produit> find(long id);

}
