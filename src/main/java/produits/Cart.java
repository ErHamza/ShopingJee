package produits;

public class Cart {
    private String product_name;

    private int price;
    private int number_items;

    public Cart(String product_name, int price, int number_items) {
        this.product_name = product_name;

        this.price = price;
        this.number_items = number_items;
    }

    public String getProduct_name() {
        return product_name;
    }

    public void setProduct_name(String product_name) {
        this.product_name = product_name;
    }




    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getNumber_items() {
        return number_items;
    }

    public void setNumber_items(int number_items) {
        this.number_items = number_items;
    }
}
