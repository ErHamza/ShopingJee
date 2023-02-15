package produits;

public class Produit {
    private int produit_id;
    private String produit_name;
    private int price;
    private int solde ;
    private String solde_description;
    private String Category;
    private int selled;
    private int quantity;
    private String description;
    private String image;

    public void setImage(String image) {
        this.image = image;
    }

    public String getImage() {
        return image;
    }
// getters :


    public int getSolde() {
        return solde;
    }

    public int getProduit_id() {
        return produit_id;
    }

    public String getProduit_name() {
        return produit_name;
    }

    public int getPrice() {
        return price;
    }


    public String getSolde_description() {
        return solde_description;
    }

    public String getCategory() {
        return Category;
    }

    public int getSelled() {
        return selled;
    }

    public int getQuantity() {
        return quantity;
    }

    public String getDescription() {
        return description;
    }


    //Setters



    public void setProduit_name(String produit_name) {
        this.produit_name = produit_name;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setSolde(int solde) {
        this.solde = solde;
    }

    public void setSolde_description(String solde_description) {
        this.solde_description = solde_description;
    }

    public void setCategory(String category) {
        Category = category;
    }

    public void setSelled(int selled) {
        this.selled = selled;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Produit{" +
                "produit_id=" + produit_id +
                ", produit_name='" + produit_name + '\'' +
                ", price=" + price +
                ", solde=" + solde +
                ", solde_description='" + solde_description + '\'' +
                ", Category='" + Category + '\'' +
                ", selled=" + selled +
                ", quantity=" + quantity +
                ", description='" + description + '\'' +
                '}';
    }

    public Produit(
                   String produit_name,
                   int price,
                   int solde,
                   String solde_description,
                   String category,
                   int selled,
                   int quantity,
                   String description,
                   String image) {

        this.produit_name = produit_name;
        this.price = price;
        this.solde = solde;
        this.solde_description = solde_description;
        Category = category;
        this.selled = selled;
        this.quantity = quantity;
        this.description = description;
        this.image = image;
    }

    public Produit()
    {}

    public Produit(int produit_id, String produit_name, int price, int solde, String solde_description, String category, int selled, int quantity, String description, String image) {
        this.produit_id = produit_id;
        this.produit_name = produit_name;
        this.price = price;
        this.solde = solde;
        this.solde_description = solde_description;
        Category = category;
        this.selled = selled;
        this.quantity = quantity;
        this.description = description;
        this.image = image;
    }
}
