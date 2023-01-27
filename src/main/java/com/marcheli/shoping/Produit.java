package com.marcheli.shoping;

public class Produit {
    private int produit_id;
    private String produit_name;
    private int price;
    private boolean solde ;
    private String solde_description;
    private String Category;
    private int selled;
    private int quantity;
    private String description;

    // getters :


    public int getProduit_id() {
        return produit_id;
    }

    public String getProduit_name() {
        return produit_name;
    }

    public int getPrice() {
        return price;
    }

    public boolean isSolde() {
        return solde;
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

    public void setSolde(boolean solde) {
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
}
