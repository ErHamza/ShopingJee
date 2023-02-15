package produits;

import java.util.List;

public interface Iproduit {
    public List<Produit> getAllProducts();
    public Produit add(Produit p);
    public void delete(Produit p);
    public Produit update (Produit p);
    public List<Produit> find(long id);
    public void modifyProduct(Produit p);

}
