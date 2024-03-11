package MP02Programacion.UF4.Customers;

public class Product {
    private int productId;
    private String name;
    private double price;

    public Product (int productId, String name, double price) {

    }

    public Product() {

    }
    public int getProductId(){

        return this.productId;
    }

    public String getName() {

        return this.name;
    }

    public String setName (String name) {
        return this.name;
    }

    public double getPrice() {

        return this.price;
    }

    public double setPrice(double price) {

        return this.price;
    }
}
