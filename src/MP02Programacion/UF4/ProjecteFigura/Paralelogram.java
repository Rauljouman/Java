package MP02Programacion.UF4.ProjecteFigura;
public class Paralelogram extends Figura {

    private double b;
    private double h;

    public Paralelogram(String figura, int id,double b,double h) {
        super(figura, id);
        this.b = b;
        this.h = h;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getH() {
        return h;
    }

    public void setH(double h) {
        this.h = h;
    }

    @Override
    public double calcularArea() {
        double area = 0;
        area = b * h;
        return area;
    }
}
