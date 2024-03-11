package MP02Programacion.UF4.Customers;

public class main {
    public static void main (String[] args) {
        //Instancies del customer
        Customer c = new Customer(10, "Raul", "rauljouman@gmail.com" );
        Customer c2 = new Customer();
        c2.setName("Alberto");
        c2.setEmail("Albertiko@gmail.com");
        Customer c3 = new Customer(42312, "Jouman", "elcaserio@gmail.com");
        //Instancies del Product
        Product p = new Product(15432, "Jarron Faraonic", 20.99);
        Product p2 = new Product();
        p2.setName("Iphone 15");
        p2.setPrice(1500);
        Product p3 = new Product(4231, "La vaca que rie", 40.00);
        //Instacies de OrderItem
        OrderItem o = new OrderItem(32, 43, 543,543.54);
        OrderItem o1 = new OrderItem();
        o1.setOrderItemid(42534);
        o1.setProductId(45342);
        o1.setQuantity(3);
        o1.setPrice(49.99);
    }
}
