package MP02Programacion.UF4.ProjecteFigura;

public class Cercle extends Figura {

    private double radi;

    public Cercle(String figura, int id, double radi) {
        super(figura, id);
        this.radi = radi;
    }
    public double getRadi() {
        return radi;
    }

    public void setRadi(int radi) {
        this.radi = radi;
    }

    @Override

    public double calcularArea() {
        double area = 0;
        area = Math.pow(radi, 2) * Math.PI;
        return area;
    }

}
