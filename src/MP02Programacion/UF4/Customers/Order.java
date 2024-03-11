package MP02Programacion.UF4.Customers;
import java.util.List;

public class Order {
    private int orderId;
    private Customer customer;
    private List<OrderItem> orderItems;

    public void addOrderItem(OrderItem item) {
        orderItems.add(item);

    }
    public void removerOrderItem(OrderItem item) {
        orderItems.remove(item);
    }
    public double calculteTotal() {
        double total = 0;
        for (int i = 0; i < orderItems.size(); i++) {
            OrderItem item = orderItems.get(i);
            total += item.getPrice();
        }
        return total;
    }
}