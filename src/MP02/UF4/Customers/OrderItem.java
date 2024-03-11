package MP02.UF4.Customers;

public class OrderItem {

    private int orderItemid;
    private int productId;
    private int quantity;
    private double price;

    public OrderItem() {

    }

    public OrderItem(int orderItemid, int productId, int quantity, double price) {
        this.orderItemid = orderItemid;
        this.productId = productId;
        this.quantity = quantity;
        this.price = price;
    }

    public int getOrderItemid() {
        return orderItemid;
    }

    public void setOrderItemid(int orderItemid) {
        this.orderItemid = orderItemid;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
