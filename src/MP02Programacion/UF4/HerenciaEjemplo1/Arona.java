package MP02Programacion.UF4.HerenciaEjemplo1;

public class Arona extends Seat{
    private String color;
    private int km;

    public Arona() {
    }
    public Arona (int kmArona, String colorArona) {
        this.km = kmArona;
        this.color = colorArona;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getKm() {
        return km;
    }

    public void setKm(int km) {
        this.km = km;
    }

    public void visualizer() {
        System.out.println("La id es " + getId());
        System.out.println("El model del SEAT es " + getModel());
        System.out.println("El color es " + getColor());
        System.out.println("Els km son " + getKm());
    }
}
