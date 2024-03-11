package MP02Programacion.UF4.HerenciaEjemplo1;

public class Car {
    private static int id;

    public int getId() {
        id++;
        return id;
    }

    public int getId(int id) {
        this.id = id;
        return id;
    }

    public void vehicleType() {
    }

    public static void setId(int id) {
        Car.id = id;
    }
}
