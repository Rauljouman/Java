package MP02Programacion.UF4.HerenciaEjemplo1;

public class Seat extends Car{
    private String model;

    public Seat(){}

    public Seat(String modelSeat) {
        this.model = modelSeat;
    }

    public void brand() {
        System.out.println(model);
    }

    public void speed() {

    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
}
