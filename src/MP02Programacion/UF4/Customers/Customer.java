package MP02Programacion.UF4.Customers;
public class Customer {
    private int customerId;
    private String name;
    private String email;

    public Customer() {

    }
    public Customer(int customerId, String name, String email) {

    }


    public int getCustumerId() {

       return this.customerId;
    }

    public String getName(){

        return this.name;
    }

    public void setName (String name) {

    }

    public String getEmail() {

        return this.email;

    }

    public void setEmail( String email) {

    }
}
